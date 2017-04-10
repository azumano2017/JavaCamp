package section07;

public class Q03MyOverrideNew extends Q03MyOverride{
	//「MyOverride」を継承した「MyOverrideNew」を利用したプログラム

	public String whoName = "子";

	void getWho(){
		System.out.println( super.whoName );
		System.out.println( this.whoName );
	}

}
