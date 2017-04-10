package section11;

public class Q04ToDoListTester {
	//平成28年春期 基本情報技術試験
	//実行クラス

	public static void main(String[] args) {

		Q04ToDoList list = new Q04ToDoList(); //プログラム2のToDoListのインスタンスを生成

		list.add ( new Q04ToDo("メール送信", "201604181500", Q04ToDo.Priority.HIGH ) );
		list.add ( new Q04ToDo("ホテル予約", "20160420", Q04ToDo.Priority.LOW ) );
		list.add ( new Q04ToDo("チケット予約", "20160430", Q04ToDo.Priority.MIDDLE ) );
		list.add ( new Q04ToDo("報告書作成", "20160428", Q04ToDo.Priority.HIGH ) );
		list.add ( new Q04ToDo("会議室予約", "20160530", Q04ToDo.Priority.HIGH ) );
		list.add ( new Q04ToDo("PC購入", "20160531", Q04ToDo.Priority.HIGH ) );

		for ( Q04ToDo todo : list.select() ){
			todo.setState ( Q04ToDo.State.STARTED );   //状態をSTATEDに設定
			list.update( todo );
		}

		/*Condition condition1 = new Condition() {  プログラム3のConditionのインスタンスを生成
			public boolean test ( ToDo todo ){    //メソッドのオーバーライド
				return todo.getDeadline(). compareTo("20160501") < 0;
				// Deadline：期限      compareTo:文字列が()と比べて大きいか調べる
			}
		}
		*/

		/*
		Condition condition2 = new Condition() {
			public boolean test ( ToDo todo ){
				return todo.getPriority(). equals(ToDo.Priority.HIGH);
			}
		};
		*/

		/*
		for ( ToDo todo : list.select( condition1, condition2 ) ){  //ToDoListのselect()メソッド
			System.out.println( todo );
		}
		*/


	}

}
