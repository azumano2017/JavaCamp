package section09;

public class Q04Yamada extends Q02Player{
	//Playerクラスを継承したクラス

	public Q04Yamada ( String name ){
		super ( name );
	}


	public int showHand(){
		final int HAND = 2;
		return HAND;
	}
}