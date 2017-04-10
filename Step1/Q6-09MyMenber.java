package section06;

public class Q09MyMenber {

	static int myStatic = 10;
	int myInstance = 100;


	public static void main (String[] args){

		myStatic = 20;
		System.out.println(myStatic);
		Q09MyMenber obj = new Q09MyMenber();
		obj.myInstance = 200;
		System.out.println( obj.myInstance );

	}

}
