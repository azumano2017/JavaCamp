package library4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import model.Book;

public class BookCatalog {

	static final String CATALOG_FILE_NAME = "c＼＼jsimple＼＼book.ser";

	//HashMap(books)をインスタンス
	protected Map<String, Book> books = new HashMap<String, Book>();

	private static final BookCatalog instance = new BookCatalog();

	public BookCatalog(){
		load();
	}

	protected synchronized void load(){
		try{
			ObjectInputStream in = new ObjectInputStream(
					new FileInputStream(CATALOG_FILE_NAME) );
			books = (Map<String, Book>)in.readObject();
			in.close();
		}catch (FileNotFoundException e){

		}catch (Exception e){
			e.printStackTrace();
		}
	}


	protected synchronized void save(){
		try{
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream(CATALOG_FILE_NAME) );
			out.writeObject(books);
			out.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public Book getBook(String bookId){
		return (Book)books.get(bookId);
	}

	public Book[] getBooks(){
		Book resultArray[] = new Book[books.size()];
		books.values().toArray(resultArray);
		return resultArray;
	}

	protected String createUniqueBookId(){
		//現在の日時からユニークIDを作成する

		Date now = new Date();  //現在の日時を取得
		String id;
		id = new SimpleDateFormat("yyyyMMddHH").format(now);
		while (getBook(id) != null){
			int intId = Integer.parseInt(id);
			id = Integer.toString(intId + 1);
		}
		return id;
	}

	public synchronized Book addBook(Book book){
		//idをキー、bookを値として格納

		String id = book.getBookId();
		if (id == null  ||  books.containsKey(id) ){
			id = createUniqueBookId();
			book.setBookId(id);
		}
		books.put(id, book);
		save();
		return book;
	}

	public void deleteBook(String bookId){
		//bookidが当てはまる図書除法を削除

		books.remove(bookId);
		save();
	}

	public Book[] searchBooks(String word){
		//引数wordがとこかに含まれる図書を検索

		ArrayList<Book> result = new ArrayList<Book>();

		Iterator<Book> i = books.values().iterator();
		while (i.hasNext() ){
			Book book = (Book)i.next();
			if (book.getBookId().indexOf(word) != -1
			 || book.getTitle().indexOf(word) != -1
			 || book.getAuthor().indexOf(word) != -1
			 || book.getTranslator().indexOf(word) != -1
			 || book.getPublisher().indexOf(word) != -1
			 || book.getKeyword().indexOf(word) != -1
			 || book.getMemo().indexOf(word) != -1 ){
				result.add(book);
			}
		}
		Book resultArray[] = new Book[result.size()];
		result.toArray(resultArray);
		return resultArray;
	}

	public static BookCatalog getInstance(){
		return instance;
	}
}
