package section07;

public class Q04Rectangle {
	//長方形の外周、面積を求めるプログラム

	// フィールド
	int width;
	int height;


	// コンストラクタ
	Q04Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}


	// メソッド
	int getWidth() {return this.width; }
	int getHeight() {return this.height;}
	int getCircum() {return (this.width + this.height) * 2;}
	int getArea() {return this.width * this.height;}

}
