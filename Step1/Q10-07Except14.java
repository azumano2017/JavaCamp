package section10;

public class Q07Except14 {

	//例外処理 どのような出力結果が得られるかの確認

	public static void main(String[] args) {

		for ( int i=0; i<=2; i++){
			try{
				System.out.println();
				System.out.println("try 外=" + i );
				if ( i == 0 ) throw new Exception ("例外1");
				try{
					System.out.println("         try 内=" + i );
					if ( i == 1 ) throw new Exception ("例外2");
				}
				catch ( Exception inner ){
					System.out.println("         catch 内=" + i );
				}
				finally {
					System.out.println("         finally 内=" + i );
				}
			}
			catch ( Exception outer ){
				System.out.println("catch 外=" + i );
			}
			finally {
				System.out.println("finally 外=" + i );
			}
		}

	}

}
