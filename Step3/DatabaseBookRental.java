package library4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Rental;
import model.User;

public class DatabaseBookRental {

	private static final DatabaseBookRental instance = new DatabaseBookRental();

	Connection con;
	static final String DATABASE_URL = "jdbc:mysql://localhost/db1";
	static final String DATABASE_USER = "root";
	static final String DATABASE_PASSWORD = "mkhm1223";

	String deleteBookId = null;


	public DatabaseBookRental(){
		connect();
	}


	protected boolean connect(){
		//ドライバーに接続

		String msg = "";

		try {
			if (con != null){
				if (con.getWarnings() == null)
					return true;
				disconnect();
			}
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("connect 成功");
				msg = "ドライバーのロードに失敗しました。";
			}catch (ClassNotFoundException e){
				msg = "ドライバーのロードに失敗しました。";
				System.out.println("connect 不成功");
			}

			//データベースの接続
			con = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
			if (con.getWarnings() == null){
				System.out.println("connect 成功");
				return true;
			}
			System.out.println("connect error");
			disconnect();
		}catch (Exception ex){
			ex.printStackTrace();

		}
		return false;
	}


	protected void disconnect(){
		//ドライバー接続の切断

		if (con != null){
			try {
				con.close();
			}catch (Exception ex){
				ex.printStackTrace();
			}
			con = null;
		}
	}

	protected User createUser(ResultSet result) throws SQLException {
		//データベースから持ってきた情報をUser型にする

		User user = new User();

		user.setUserId(result.getString("userid"));
		user.setName(result.getString("name"));

		return user;
	}


	protected User[] createUsers(ResultSet result) throws SQLException {
		//データベースから持ってきた情報をUser型のArrayListに格納

		ArrayList<User> users = new ArrayList<User>();
		while (result.next())
			users.add(createUser(result));
		User[] userArray = new User[users.size()];
		users.toArray(userArray);
		return userArray;
	}


	public User searchUser(String userId){
		//すでに登録されているIDかどうか判定するメソッド
		//登録されていないIDだったらnullを返す

		User userCheck = null;
		try{

			connect();

			//usersテーブルから、userIdが該当する行のuseridとnameを取り出す
			PreparedStatement statement = con.prepareStatement("SELECT userid, name FROM users WHERE userid  = ?");
			statement.setString(1, userId);
			// ResultSet：DBMSから検索結果を受け取る際に利用する
			ResultSet result = statement.executeQuery();

			if (result.next() )
				userCheck = createUser(result);
			statement.close();

			statement.close();

		}catch (SQLException ex){

			ex.printStackTrace();

		}
		return userCheck;
	}


	protected Rental createRental(ResultSet result) throws SQLException {

		Rental rental = new Rental();

		rental.setBookId(result.getString("bookid"));
		rental.setRentalDate(result.getTimestamp("rentaldate").toString().substring(0, 10));
		rental.setMemo(result.getString("memo"));
		rental.setTitle(result.getString("title"));

		return rental;
	}


	protected Rental[] createRentals(ResultSet result) throws SQLException {

		ArrayList<Rental> data = new ArrayList<Rental>();
		while (result.next())
			data.add(createRental(result));
		Rental[] rentalArray = new Rental[data.size()];
		data.toArray(rentalArray);
		return rentalArray;
	}


	protected Rental createRental2(ResultSet result) throws SQLException {

		Rental rental = new Rental();

		rental.setBookId(result.getString("bookid"));
		rental.setMemo(result.getString("memo"));
		rental.setTitle(result.getString("title"));

		return rental;
	}


	public Rental[] searchUserRental(String userId){
		//会員の現在借りている図書の情報をデータベースから引き出すメソッド

		Rental[] rentalBooks = null;

		try{

			connect();
			PreparedStatement statement = con.prepareStatement("SELECT BR.bookid, BR.rentaldate, BR.memo, BC.title FROM bookrental AS BR JOIN bookcatalog as BC ON BR.bookid = BC.bookid WHERE BR.userid = ? AND situation = '1'");
			statement.setString(1, userId);

			ResultSet result = statement.executeQuery();
			rentalBooks = createRentals(result);

			statement.close();

		}catch (SQLException ex){
			ex.printStackTrace();

		}
		return rentalBooks;
	}


	public Rental searchRental(Rental returnBook){
		//引数returnBookの"bookid","situation"から検索して、本当に貸し出し中のものか判定する

		Rental rentalBook = null;

		try{

			connect();
			PreparedStatement statement = con.prepareStatement("SELECT BR.bookid, BC.title, BR.memo FROM bookrental AS BR JOIN bookcatalog AS BC ON BR.bookid = BC.bookid WHERE BR.bookid = ? AND BR.situation = ?");
			statement.setString(1, returnBook.getBookId());
			statement.setString(2, returnBook.getSituation());

			ResultSet result = statement.executeQuery();
			while (result.next())
				rentalBook = createRental2(result);
			if (rentalBook != null){
				System.out.println("bookidはちゃんと貸し出し中の図書IDです");
			}

			statement.close();

		}catch (SQLException ex){

			ex.printStackTrace();

		}
		return rentalBook;
	}

	//貸し出し情報をデータベースに保持するメソッド
	public synchronized Rental rentalProcessing(Rental rental){

		Rental insertBookDate = null;

		try{

			connect();
			PreparedStatement statement = con.prepareStatement("INSERT INTO bookrental (bookid, userid, rentaldate, returnplan, situation, memo) VALUES (?,?,?,?,?,?)");
			statement.setString(1, rental.getBookId());
			statement.setString(2, rental.getUserId());
			statement.setString(3, rental.getRentalDate());
			statement.setString(4, rental.getReturnPlan());
			statement.setString(5, rental.getSituation());
			statement.setString(6, rental.getMemo());

			int result = statement.executeUpdate();
			statement.close();
			insertBookDate = rental;

		}catch (SQLException ex){
			ex.printStackTrace();
		}
		return rental;
	}


	public synchronized Rental returnProcessing(Rental rental){
		//既に登録されている貸し出し情報の状況を "返却済み(2)"に書き換えて、返却日に本日の日付を入れる

		Rental updateBookDate = null;

		try{
			connect();

			PreparedStatement statement = con.prepareStatement("UPDATE bookrental SET situation = ?, returndate = ? WHERE bookid = ?");
			statement.setString(1, rental.getSituation());
			statement.setString(2, rental.getReturnDate());
			statement.setString(3, rental.getBookId());

			int result = statement.executeUpdate();
			statement.close();
			updateBookDate = rental;

		}catch (SQLException ex){
			ex.printStackTrace();
		}
		return updateBookDate;
	}

}
