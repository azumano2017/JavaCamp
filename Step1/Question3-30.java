package section3;

public class Question30 {
	//キーボードから入力された年(yesr)がうるう年かどうかを判定するプログラム

	public static void main(String[] args) {

		int year = 0;

		System.out.println("入力された年がうるう年か判定するプログラム");
		System.out.print("西暦を入力してください→");

		year = new java.util.Scanner ( System.in ).nextInt ();;

			if (year>0) {
				if((year%4==0 && year%100!=0) || (year%400==0)) {
					System.out.println(year + "年はうるう年です。");
				} else {
					System.out.println(year + "年はうるう年ではないです。");
				}
			}else{
				System.out.println("エラー");
			}
		}

}
