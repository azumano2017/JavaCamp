package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;


public class ListCommand implements CLICommand {
	//一覧コマンド
	//データベースに保持してあるデータをすべて持ってきて表示する

	//BookCatalog catalog;
	DatabaseBookCatalog catalog;

	public ListCommand(DatabaseBookCatalog catalog){
		this.catalog = catalog;
	}

	public void process(BufferedReader in, PrintWriter out) throws IOException{

		String str = "＊";
		BookWriter br = new BookWriter(out, str);

		Book[] bk = catalog.getBooks();

		out.println("\n\n合計" + bk.length + "項目\n");
		out.flush();



		for (int i=0; i<bk.length; i++){

			out.println("[" + (i+1) + "]");
			out.flush();

			out.println("＊図書ID：" + bk[i].getBookId() );
			br.write(bk[i]);
			out.println();
			out.flush();

		}

	}

}
