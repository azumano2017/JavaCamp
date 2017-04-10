package section11;

import java.util.UUID;

import org.omg.CORBA.Object;

public class Q04ToDo {
	//平成28年春期 基本情報技術試験

	/*
	 * 【クラス ToDo】
	 * ・ToDoを表すクラス、コンストラクタで主題、期限、重要度を指定する
	 * ・期限は年月日を表す8桁または年月日時分を表す12桁の数字からなる文字列(以下、日時という)である。
	 * ・主題、期限、重要度を取得する各メソッドと、状態を設定及び取得するメソッド、ToDowo識別する
	 *   フィールドidをもつ
	 * ・列挙PriorityはToDoの重要度を表す列挙であり、重要度が高い順にLOW、MIDDLE、HIGHである。
	 * ・列挙StateはToDoの状態を表す列挙であり、NOT_YET_STARTEDは未着手、STAETEDは着手済み、
	 *   DONEは完了を表す
	 */

	public enum Priority { LOW, MIDDLE, HIGH }
	public enum State { NOT_YET_STARTED, STARTED, DONE }

	// 8桁または12桁の数字からなる文字列と一致する正規表現
	private static final String DEADLINE_PATTERN = "\\d{8} | \\d{12}";

	private final String id;     //識別id
	private String subject;      //主題
	private String deadline;     //期限
	private Priority priority;   //重要度
	private State state;         //状態


	private Q04ToDo ( String subject, String deadline, Priority priority, String id, State state ){
		if ( !deadline.matches( DEADLINE_PATTERN ) ){
			throw new IllegalArgumentException();   //期限が引数の期限とマッチしなかったらエラー
		}
		this.subject = subject;       //マッチしたらそれぞれ代入
		this.deadline = deadline;
		this.id = id;
		this.state = state;
	}

	public Q04ToDo ( String subject, String deadline, Priority priority ){
		this ( subject, deadline, priority,
					UUID.randomUUID().toString(), State.NOT_YET_STARTED );
	}

	public Q04ToDo ( Q04ToDo todo ){
		this ( todo.subject, todo.deadline, todo.priority, todo.id, todo.state );
	}

	public String getSubject() { return subject; }
	public String getDeadline() { return deadline; }
	public Priority getPriority() { return priority; }
	public State getState() { return state; }
	public void setState(State state) { this.state = state; }
	public int hashcode() { return id.hashCode(); }


	public boolean epuals ( Object o ){
		return o instanceof Q04ToDo && ( (Q04ToDo) o).id.equals(id);
	}

	public String toString(){
		return String.format("主題：%s, 期限：%s, 優先度：%s, 状態：%s",
								subject, deadline, priority, state );
	}

}
