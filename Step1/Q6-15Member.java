package section06;

public class Q15Member {
	//会員クラス「Menber」を利用するプログラム

	Q15MemberTest mem = new Q15MemberTest();

	Q15Member suzuki;
	Q15Member tanaka;
	Q15Member yamada;

	private String name;
	private int no;
	private int age;


	Q15Member ( String name, int no, int age ){
		this.name = name;
		this.no = no;
		this.age = age;

	}

	int getNo() { return this.no; }
	void setNo( int no ) { this.no = no; } //会員番号を変更
	int getage() { return this.age; }


	void print() {
		System.out.println("No." + suzuki.getNo() + ":" + suzuki.name + ":" + suzuki.age + "才");
		System.out.println("No." + tanaka.getNo() + ":" + tanaka.name + ":" + tanaka.age + "才");
		System.out.println("No." + yamada.getNo() + ":" + yamada.name + ":" + yamada.age + "才");
	}

}
