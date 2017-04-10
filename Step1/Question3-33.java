package section3;

public class Question33 {
	/*FizzBuzzプログラム
	 *1から順番に数を表示する(1～50)
	 *その数が3で割り切れるなら"Fizz"、5で割り切れるなら"Buzz"、両方割り切れるなら"FizzBuzz"と表示
	 */

	public static void main(String[] args) {

		for(int i=1; i<51; i++){

			if(i%3==0){
				System.out.print("Fizz");
				if(i%5==0){
					System.out.print("Buzz");
				}

			}else if(i%5==0){
				System.out.print("Buzz");

			}else{
				System.out.print(i);
			}

			System.out.print(" ");
		}
	}
}
