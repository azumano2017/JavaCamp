package section11;

public interface Q04Condition {
	//平成28年春期 基本情報技術試験
	/*
	 * 【インターフェース Condition】
	 * ToDoを選択する際の条件を表すクラスが実装するインターフェース。
	 * メソッドtestは条件に合致するときにtrueを返す
	 */

	boolean test ( Q04ToDo todo );

}
