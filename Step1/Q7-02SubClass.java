package section07;

public class Q02SubClass extends Q02SuperClass {
	//「SuperClass」を継承した「SubClass」を利用したプログラム

	String name;

	Q02SubClass(String name){
		super ("Johnson");

		System.out.printf("I am a son of %s.\n", name);
	}

}
