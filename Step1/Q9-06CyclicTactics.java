package section09;

public class Q06CyclicTactics implements Q05Tactics{

	int hand = -1;

	public int readTactics(){

		hand = ( hand + 1 ) % 3;

		return hand;
	}

}
