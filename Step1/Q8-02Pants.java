package section08;

public class Q02Pants {
	//衣類品小売業の在庫管理システム

	String code;
	int size;
	String color;


	//引数を自分のインスタンスのフィールドに代入
	Q02Pants ( String code, int size, String color ){
		this.code = code;
		this.size = size;
		this.color = color;
	}

	public boolean sizels ( int size ){     //引数がthis.sizeと等しかったらtrueを返す
		return this.size==size;             //等しくなかったらfalseを返す
	}                                       //intは "=="

	public boolean colorls ( String color){ //引数がthis.colorと等しかったらtrueを返す
		return this.color.equals(color);    //等しくなかったらfalseを返す
	}                                       //Stringは "equals"

	public String toString(){
		return code + "," + size + "," + color;
	}

}
