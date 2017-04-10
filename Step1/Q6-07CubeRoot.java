package section06;

public class Q07CubeRoot {
	//キーボードから入力した整数の立方根を求めるプログラム

	int x;

	public Q07CubeRoot (int x){
		this.x = x;
	}

	public void display(){
		System.out.print(x + " の立方根は " + Math.cbrt(x) );     //立方根
	}

}
