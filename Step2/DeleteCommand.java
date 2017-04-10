package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteCommand implements CLICommand{
	//削除コマンド
	//データベースに保持してあるデータを図書IDから検索し削除できる

	//protected BookCatalog catalog;  ファイルアクセスの時はこっち
	protected BookCatalog catalog;

	public DeleteCommand(BookCatalog catalog){
		this.catalog = catalog;
	}

	public void process(BufferedReader in, PrintWriter out) throws IOException{

		String str = "＊";
		BookWriter br = new BookWriter(out, str);

		out.println("【削除】");

		out.print("削除したい本の図書IDを入力してください：");
		out.flush();
		String id = in.readLine();
		Book bk = catalog.getBook(id);


		if (bk == null){
			System.out.println("入力されたIDは存在しません。\n\n");

		}else{
			out.println("＊図書ID：" + bk.getBookId() );
			br.write(bk);
			out.println();

			out.println("*****本当に削除しますか？*****");
			out.print("【 削除する：1    削除しない：2 】→");
			out.flush();
			String sakujo = in.readLine();


			if (  !(sakujo.equals("1")) &&  !(sakujo.equals("2")) ){
				out.println("エラー\n" + "トップ画面に戻ります。\n\n");
				out.flush();

			}else if (sakujo.equals("1")){
				catalog.deleteBook(id);
				out.println("図書ID" + id + "のデータは削除されました。\n\n");
				out.flush();

			}else if(sakujo.equals("2")){
				out.println("*****キャンセル*****\n" + "トップ画面に戻ります。\n\n");
				out.flush();

			}




		}

	}

}
