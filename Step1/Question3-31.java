package section3;

public class Question31 {
	/*太郎さんと花子さんのジャンケン勝敗判定プログラム
	  太郎さんと花子さんのジャンケンデータはキーボードから入力する
	  グー：1、チョキ：2、パー：3
	 */

	public static void main(String[] args) {

		System.out.println("じゃんけん勝敗判定プログラムです！");

		System.out.println("太郎さんと花子さんの数字を入力してください。");
		System.out.print("グー:1 チョキ:2 パー:3 →\n");

		System.out.print("太郎さん→");
		int t = new java.util.Scanner ( System.in ).nextInt ();

		System.out.print("花子さん→");
		int h = new java.util.Scanner ( System.in ).nextInt ();

		if((t==1 && h==2) || (t==2 && h==3) || (t==3 && h==1)){
			System.out.println("太郎さんの勝ちです");

		}else if((t==1 && h==3) || (t==2 && h==1) || (t==3 && h==2)){
			System.out.println("花子さんの勝ちです");

		}else if((t==1 && h==1) || (t==2 && h==2) || (t==3 && h==3)){
			System.out.println("あいこです");
		}

	}

}
