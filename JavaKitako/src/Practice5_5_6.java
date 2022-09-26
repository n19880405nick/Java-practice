import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice5_5_6 {
	public static void main(String[] args) throws IOException {
//		5-5
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		int value = Integer.parseInt( br.readLine() );

		int binary[] = new int[16];

		for( int i = 0; i < 16; i++) {
			binary[i] = value % 2;
			value /= 2;
		}

		for( int i = 0 ; i < 16 ; i++ )
			System.out.print( binary[i] );
		
		System.out.println("");
		
//		5-6
		int kuku[][] = new int[9][];

		for( int i = 0; i < 9; i++) {
			kuku[i] = new int[9];
			for(int j = 0; j < 9; j++)
				kuku[i][j] = (i + 1) * (j + 1);
		}

		for( int i = 0 ; i < 9 ; i++ ){
	    for( int j = 0 ; j < 9 ; j++ )
	        System.out.printf( " %2d", kuku[i][j] );
	    System.out.println();
		}
	}	
}
