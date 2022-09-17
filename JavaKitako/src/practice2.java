import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice2 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
//		2-1
		System.out.println(s);
		
//		2-2
		int x = Integer.parseInt(s);
		System.out.println("2-2:" + x);
		
//		2-3
		System.out.println("2-3:" + x * x);
		System.out.println("2-3:" + x * x * x);
		
//		2-4
		int y = Integer.parseInt(br.readLine());
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		
//		2-5
		System.out.println("2-5:" + (x + y) / 2);
	}	
}
