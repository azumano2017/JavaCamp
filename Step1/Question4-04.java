package section4;

public class Question04 {

	public static void main(String[] args) {
		//バブルソートのプログラム

		int[] data = { 7, 2, 3, 8, 9, 1 };
		int w;

		for(int i=6; i>=2; i--){
			for(int j=0; j<=i-2; j++){
				if (data[j] > data[j+1]){
					w = data[j];
					data[j] = data[j+1];
					data[j+1] = w;
				}

			}
		}
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
