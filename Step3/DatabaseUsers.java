package library4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;

public class DatabaseUsers {

	private static final DatabaseUsers instance = new DatabaseUsers();

	// Connection：DBMSへの接続や切断の際に利用する
	Connection con;
	static final String DATABASE_URL = "jdbc:mysql://localhost/db1";
	static final String DATABASE_USER = "root";
	static final String DATABASE_PASSWORD = "mkhm1223";



	public DatabaseUsers(){
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
				msg = "ドライバーのロードに成功しました。";
				System.out.println(msg);
			}catch (ClassNotFoundException e){
				msg = "ドライバーのロードに失敗しました。";
				System.out.println(msg);
			}

			// DriverManager：DBMSへの接続準備のために利用する
			// getWarnings()：最初の警告を取得
			con = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
			if (con.getWarnings() == null){
				System.out.println("connect 成功");
				return true;
			}
			System.out.println("connect error");
			disconnect();
		}catch (Exception ex){
			System.out.println("connect catchにきてる");
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

	public synchronized User addUser(User user){
	//ユーザー情報をデータベースに保持するメソッド

		User[] userCheck = null;
		try {
			connect();
			//同じ名前、パスワードのユーザーがいないか判定
			userCheck = searchUser(user);

			//nullだったらユーザー登録実行
			if(userCheck.length == 0){
				System.out.println("登録可能な名前とパスワードです。");
				// PreparedStatement：SQL文を送する際に利用する
				PreparedStatement statement2 = con.prepareStatement("INSERT INTO users (name, furigana, zipcode, address, tel, mobilephone, email, dateofbirth, gender, pass, datacreateddate) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
				statement2.setString(1, user.getName());
				statement2.setString(2, user.getFurigana());
				statement2.setString(3, user.getZipCode());
				statement2.setString(4, user.getAddress());
				statement2.setString(5, user.getTel());
				statement2.setString(6, user.getMobilePhone());
				statement2.setString(7, user.getEmail());
				statement2.setString(8, user.getDateOfBirth());
				statement2.setString(9, user.getGender());
				statement2.setString(10, user.getPass());
				statement2.setString(11, user.getDataCreatedDate());

				int result2 = statement2.executeUpdate();
				statement2.close();
				System.out.println("ユーザー登録成功");

				return user;

			}else{
				System.out.println("すでに使用されている名前とパスワードです");
				return null;
			}

		}catch (SQLException ex){
			ex.printStackTrace();
			System.out.println("エラー");
		}
		return null;
	}


	public String deleteUser(User user){
	//呼び出す前にnameとpassからuseridを検索

		String msg = null;

		try {
			connect();
			PreparedStatement statement = con.prepareStatement("DELETE FROM users WHERE name = ? AND pass = ?");
			statement.setString(1, user.getName());
			statement.setString(2, user.getPass());
			int result = statement.executeUpdate();
			statement.close();

			msg = "OK";

			return msg;

		}catch (SQLException ex){
			ex.printStackTrace();
		}
		return msg;
	}

	public User editingUser(User newUser, User oldUser){

		User[] userCheck = null;
		try {
			connect();

			//同じ名前、パスワードのユーザーがいないか判定
			userCheck = searchUser(newUser);

			//nullだったらユーザー登録実行
			if(userCheck == null){

				System.out.println("登録可能な名前とパスワードです。");
				PreparedStatement statement1 = con.prepareStatement("UPDATE users SET name=?, pass=? WHERE name=? AND pass=?");

				statement1.setString(1, newUser.getName());
				statement1.setString(2, newUser.getPass());
				statement1.setString(3, oldUser.getName());
				statement1.setString(4, oldUser.getPass());

				int result = statement1.executeUpdate();
				statement1.close();
				System.out.println("ユーザー情報変更成功");

				return newUser;

			}else{
				System.out.println("すでに使用されている名前とパスワードです");
			}

		}catch (SQLException ex){
			ex.printStackTrace();
			System.out.println("エラー");
		}
		return null;

	}


	protected User createUser(ResultSet result) throws SQLException {

		User user = new User();

		user.setUserId(result.getString("userid"));
		user.setName(result.getString("name"));
		user.setFurigana(result.getString("furigana"));
		user.setZipCode(result.getString("zipcode"));
		user.setAddress(result.getString("address"));
		user.setTel(result.getString("tel"));
		user.setMobilePhone(result.getString("mobilephone"));
		user.setEmail(result.getString("email"));
		user.setEmail(result.getString("dateofbirth"));
		//user.setDateOfBirth(result.getTimestamp("dateofbirth").toString().substring(0, 10));
		user.setGender(result.getString("gender"));
		user.setPass(result.getString("pass"));
		user.setDataCreatedDate(result.getTimestamp("datacreateddate").toString().substring(0, 16));

		return user;
	}


	protected User[] createUsers(ResultSet result) throws SQLException {

		ArrayList<User> users = new ArrayList<User>();
		while (result.next())
			users.add(createUser(result));
		User[] userArray = new User[users.size()];
		users.toArray(userArray);
		return userArray;
	}


	public User[] searchUser(User user){
		//すでに登録されているデータでないか判定するメソッド

		User[] userCheck = null;
		try{
			connect();
			PreparedStatement statement = con.prepareStatement("SELECT name, address FROM users WHERE EXISTS ( SELECT * FROM users WHERE name = ? AND address = ?)");
			statement.setString(1, user.getName());
			statement.setString(2, user.getAddress());

			ResultSet result = statement.executeQuery();
			userCheck = createUsers(result);

			if(userCheck.length == 0){
				return userCheck;

			}else{
				//userCheck = createUsers(result);

			}
			statement.close();

		}catch (SQLException ex){
			ex.printStackTrace();

		}
		return userCheck;
	}


	public User[] searchUser2(String word){
		//bookidで検索して、そのIDの図書が存在するか判定

		User[] userArray = null;
		try{
			connect();
			PreparedStatement statement = con.prepareStatement("SELECT * FROM users WHERE userid LIKE ? OR UPPER(name) LIKE ? OR zipcode LIKE ? OR UPPER(address) LIKE ? OR tel LIKE ? OR mobilephone LIKE ? OR UPPER(email) LIKE ? OR UPPER(pass) LIKE ? ORDER BY datacreateddate DESC");
			String pattern = "%" + word.toUpperCase() + "%";

			for (int i=1; i<=8; i++)
				statement.setString(i, pattern);
			ResultSet result = statement.executeQuery();
			userArray = createUsers(result);
			statement.close();

		}catch (SQLException ex){
			ex.printStackTrace();

		}
		return userArray;
	}


}
