package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	//図書館システム実行クラス


	protected Map<String, CLICommand> commandMap = new HashMap<String, CLICommand>();

	public Main(){

		DatabaseBookCatalog catalog = DatabaseBookCatalog.getInstance();
		CLICommand command;

		command = new ListCommand(catalog);
		commandMap.put("1", command);
		commandMap.put("list", command);

		command = new AddCommand(catalog);
		commandMap.put("2", command);
		commandMap.put("add", command);

		command = new DeleteCommand(catalog);
		commandMap.put("3", command);
		commandMap.put("delete", command);

		command = new ExitCommand();
		commandMap.put("0", command);
		commandMap.put("exit", command);
	}


	public void process (BufferedReader in, PrintWriter out) throws IOException{

		while(true){
			out.println("1)一覧(list)   2)登録(add)   3)削除(delete)   0)終了(exit)");
			out.print("作業内容を入力してください：");
			out.flush();
			String line = in.readLine();
			CLICommand command = (CLICommand)commandMap.get(line);
			if (command != null)
				command.process(in, out);
			else
				out.println("コマンドを正しく入力してください。");
		}
	}


	public static void main(String[] args) {

		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
			Main main = new Main();
			main.process(in, out);
		}catch (Exception e){
			e.printStackTrace();
		}


	}

}
