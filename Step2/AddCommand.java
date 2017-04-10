package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;


public class AddCommand implements CLICommand, Serializable{
	//登録コマンド
	//各項目を入力し、データをデータベースに保持する

	BookCatalog catalog;

	public AddCommand(BookCatalog catalog){
		this.catalog = catalog;
	}

	public void process(BufferedReader in, PrintWriter out) throws IOException{

		Book book = new Book();
		String chapter;


		out.println("【登録】");
		out.println("各項目を入力してください。");

		out.print("タイトル：");
		out.flush();
		chapter = in.readLine();
		book.setTitle(chapter);

		out.print("著者：");
		out.flush();
		chapter = in.readLine();
		book.setAuthor(chapter);

		out.print("訳者：");
		out.flush();
		chapter = in.readLine();
		book.setTranslator(chapter);

		out.print("出版社：");
		out.flush();
		chapter = in.readLine();
		book.setPublisher(chapter);

		out.print("出版年月日(20XX/04/23)：");
		out.flush();
		chapter = in.readLine();
		book.setPublicationDate(chapter);

		out.print("ISBN/ISSN：");
		out.flush();
		chapter = in.readLine();
		book.setCode(chapter);

		out.print("備考：");
		out.flush();
		chapter = in.readLine();
		book.setMemo(chapter);

		out.print("キーワード：");
		out.flush();
		chapter = in.readLine();
		book.setKeyword(chapter);

		out.print("登録者：");
		out.flush();
		chapter = in.readLine();
		book.setDataCreator(chapter);

		out.print("登録年月日(20XX/04/23)：");
		out.flush();
		chapter = in.readLine();
		book.setDataCreatedDate(chapter);


		catalog.addBook(book);

		out.println("【登録完了！】");
		out.flush();


	}

}
