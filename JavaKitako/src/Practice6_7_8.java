
public class Practice6_7_8 {
 public static void main(String[] args) {
//	 6-7
	 for(int i = 10000; i < 10100; i++) 
		 judge(i);
	 
//	 6-8
	 for(int i = 11; i < 21; i++)
		 System.out.println(i + " 番目の項は " + Fibonacci(i));
 }
 
 static void judge(int n) {
	 int x;
	 for( x = 2 ; x <= ( n / 2 ) ; x++ ){
		 if( ( n % x ) == 0 )
			 break;
	 }
	 if( x > ( n / 2 ) )
	   System.out.println( n + "は素数です" );
	 else
	   System.out.println( n + "は素数ではありません" );
 }
 
 static int Fibonacci(int n) {
	 if( n == 0)
		 return 0;
	 else if( n == 1)
		 return 1;
	 else
		 return Fibonacci(n - 2) + Fibonacci(n - 1);
 }
}
