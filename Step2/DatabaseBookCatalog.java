package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DatabaseBookCatalog extends BookCatalog{

	private static final DatabaseBookCatalog instance = new DatabaseBookCatalog();

	Connection con;
	static final String DATABASE_URL = "jdbc:mysql://localhost/db1";
	static final String DATABASE_USER = "root";
	static final String DATABASE_PASSWORD = "mkhm1223";


	public DatabaseBookCatalog(){
		connect();
	}


	protected boolean connect(){

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
			}

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
		if (con != null){
			try {
				con.close();
			}catch (Exception ex){
				ex.printStackTrace();
			}
			con = null;
		}
	}


	public Book getBook(String bookId){
		//図書IDから本のデータを検索してBook型に格納して返す

		Book book = null;

		try {
			connect();
			PreparedStatement statement = con.prepareStatement("SELECT * FROM bookcatalog WHERE bookid = ?");
			statement.setString(1, bookId);
			ResultSet result = statement.executeQuery();

			if (result.next() )
				book = createBook(result);
				statement.close();
		}catch (SQLException ex){
			ex.printStackTrace();
		}
		return book;
	}


	public Book[] getBooks(){
		//データベースにあるすべての本のデータを登録日の降順でArrayListに格納して返す

		Book[] bookArray = null;

		try {
			connect();
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM bookcatalog ORDER BY datacreateddate DESC");
			bookArray = createBooks(result);
			statement.close();

		}catch (SQLException ex){
			ex.printStackTrace();
		}
		return bookArray;
	}


	public synchronized Book addBook(Book book){
		//引数で渡された本のデータをデータベースに保持する

		try {
			connect();
			String bookId = book.getBookId();
			if (bookId == null  ||  bookId.length() == 0  ||  getBook(bookId) != null)bookId = createUniqueBookId();
			PreparedStatement statement = con.prepareStatement("INSERT INTO bookcatalog (bookid, title, author, translator,publisher, publishingdate, codeid, statusid, keyword, memo, datacreator, datacreateddate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
			statement.setString(1, bookId);
			statement.setString(2, book.getTitle());
			statement.setString(3, book.getAuthor());
			statement.setString(4, book.getTranslator());
			statement.setString(5, book.getPublisher());
			statement.setString(6, book.getPublicationDate());
			statement.setString(7, book.getCode());
			statement.setString(8, book.getStatus());
			statement.setString(9, book.getKeyword());
			statement.setString(10, book.getMemo());
			statement.setString(11, book.getDataCreator());
			statement.setString(12, book.getDataCreatedDate());

			int result = statement.executeUpdate();
			statement.close();
			return getBook(bookId);
		}catch (SQLException ex){
			ex.printStackTrace();
		}
		return null;
	}


	public void deleteBook(String bookId){
		//データベースに保持してある本を図書IDから検索して削除する

		try {
			connect();
			PreparedStatement statement = con.prepareStatement("DELETE FROM bookcatalog WHERE bookid = ?");
			statement.setString(1, bookId);
			int result = statement.executeUpdate();
			statement.close();
		}catch (SQLException ex){
			ex.printStackTrace();
		}
	}


	public Book[] searchBooks(String word){
		//引数(word)が含まれるデータがある本の情報をBook[]に格納して返す

		Book[] bookArray = null;
		try{
			connect();
			PreparedStatement statement = con.prepareStatement("SELECT * FROM bookcatalog WHERE bookid LIKE ? OR UPPER(title) LIKE ? OR UPPER(author) LIKE ? OR UPPER(translator) LIKE ? OR UPPER(publisher) LIKE ? OR UPPER(code) LIKE ? OR UPPER(status) LIKE ? OR UPPER(keyword) LIKE ? OR UPPER(memo) LIKE ? OR UPPER(datacreator) LIKE ? ORDER BY datacreateddate DESC");
			String pattern = "%" + word.toUpperCase() + "%";

			for (int i=1; i<=10; i++)
				statement.setString(i, pattern);
			ResultSet result = statement.executeQuery();
			bookArray = createBooks(result);
			statement.close();
		}catch (SQLException ex){
			ex.printStackTrace();
		}
		return bookArray;
	}


	protected Book createBook(ResultSet result) throws SQLException {
		//データベースから引き出したデータの一つをBook型の情報に戻す

		Book book = new Book();

		book.setBookId(result.getString("bookid"));
		book.setTitle(result.getString("title"));
		book.setAuthor(result.getString("author"));
		book.setTranslator(result.getString("translator"));
		book.setPublicationDate(result.getTimestamp("publishingdate").toString().substring(0, 10));
		book.setPublisher(result.getString("publisher"));
		book.setCode(result.getString("codeid"));
		book.setStatus(result.getString("statusid"));
		book.setKeyword(result.getString("keyword"));
		book.setMemo(result.getString("memo"));
		book.setDataCreatedDate(result.getTimestamp("datacreateddate").toString().substring(0, 16));
		book.setDataCreator(result.getString("datacreator"));

		return book;
	}


	protected Book[] createBooks(ResultSet result) throws SQLException {
		//createBookメソッドでBook型にしたデータをArrayListに格納する

		ArrayList<Book> books = new ArrayList<Book>();
		while (result.next())
			books.add(createBook(result));
		Book[] bookArray = new Book[books.size()];
		books.toArray(bookArray);
		return bookArray;
	}

	public static DatabaseBookCatalog getInstance(){
		return instance;
	}

}
