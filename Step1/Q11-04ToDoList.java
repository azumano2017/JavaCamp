package section11;

import java.util.ArrayList;
import java.util.List;

public class Q04ToDoList {
	//平成28年春期 基本情報技術試験

	/*
	 *【クラス ToDoList】
	 *・クラスToDoListはToDoのリストを保持するクラス。
	 *・リスト中に、フィールドidの値が同じToDoを複数含まないことを保証する。
	 *・ToDoを追加するメソッドaddと、ToDoの更新を行うメソッドupdate、条件に合うToDoのリストを
	 *  返すメソッドselectをもつ。
	 *・メソッドaddの引数に、すでにリストに保持されているToDoを指定したとき、及びメソッドupdateの引数に
	 *  リストにないToDoを指定したときは何もしない。
	 *・メソッドselectの引数には、条件を0個以上指定できる。条件を指定したときは、すべての条件に合致する
	 *  ToDoからなるリストを返す。条件を指定しないときは、保持するすべてのToDoからなるリストを返す。
	 */

	private List <Q04ToDo> todoList = new ArrayList <Q04ToDo>();

	public void add ( Q04ToDo todo ){
		if ( !todoList.contains(todo) ){
			todoList.add ( new Q04ToDo(todo) );
		}
	}

	public void update ( Q04ToDo todo ){
		int index = todoList.indexOf( todo ); //指定数が何番目にあるか
		if ( index != -1 ){
			todoList.set( index, todo );
		}
	}



	public List <Q04ToDo> select ( Q04Condition... conditions ){
		List <Q04ToDo> result = new ArrayList <Q04ToDo>();
		for ( Q04ToDo todo : todoList ){
			boolean selected = true;
			for ( Q04Condition condition : conditions ){
				selected = condition.test(todo);
				if ( !selected ) break;
			}
			if ( selected ){
				result.add( new Q04ToDo(todo) );
			}
		}
		return result;
	}

}
