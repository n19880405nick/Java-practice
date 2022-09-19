import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3_10 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("入力x");
		int x10 = Integer.parseInt(br.readLine());
		System.out.println("入力y");
		int y10 = Integer.parseInt(br.readLine());
		
		if((x10 < y10) && (x10 % 2 == 0) && (y10 % 2 == 0)) {
			System.out.println("xはyより小さく、かつ、xとyは共に偶数である。");
		}
		if((x10 == y10) && (x10 < 0)) {
			System.out.println("xとyは等しく、かつ、負の数である。");
		}
		if((x10 < y10) || (x10 % 2 == 0)) {
			System.out.println("xはyより小さい、または、xは偶数である。");
		}
		if(((x10 <= 10) || (x10 >= 100)) && ((y10 >= 10) && (y10 <= 100))) {
			System.out.println("xは10以下または100以上で、かつ、yは10以上かつ100以下である。");
		}
		if (!((x10 < 0) && (y10 < 10))) {
			System.out.println("xもyも負の数である、ではない。");
		}
	}
}
