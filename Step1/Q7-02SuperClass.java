package section07;

public class Q02SuperClass {
	//「SuperClass」を継承した「SubClass」を利用したプログラム

	String name;

	Q02SuperClass(){
		System.out.println("I am John.");
	}


	Q02SuperClass(String name){
		this();
		this.name = name;
		System.out.printf("I am a father of %s.\n\n", name );
	}

}
