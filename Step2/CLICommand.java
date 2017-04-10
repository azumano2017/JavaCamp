package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public interface CLICommand {
	//各コマンドのインターフェース

	public void process (BufferedReader in, PrintWriter out)
			throws IOException;


}
