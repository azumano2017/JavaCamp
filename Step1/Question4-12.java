package section4;

public class Question12 {

	public static void main(String[] args) {
		// ホテルの空き部屋を検索するプログラム

		int mem;
		int x;
		int[] heya = { 101, 102, 201, 202, 301 };
		int[] teiin = {4, 4, 3, 4, 6 };
		String[] yoyaku = {"空き", "使用中", "空き", "空き", "空き"};

		System.out.print("利用人数を入力して下さい：");
		mem = new java.util.Scanner(System.in).nextInt();


		System.out.print("空いている部屋は、");

		for (int i=0; i<heya.length; i++){
			if ( mem <= teiin[i] && yoyaku[i].equals("空き")){
				System.out.print( heya[i] + "号室 ");

			}
		}
		System.out.println("です。");
	}

}
