import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		3-1
		System.out.println("3-1:入力x");
		int x1 = Integer.parseInt(br.readLine());
		System.out.println("3-1:入力y");
		int y1 = Integer.parseInt(br.readLine());
		if(x1 > y1) {
			System.out.println("xはyより大きい。");
		}
		
//		3-2
		System.out.println("3-2:入力x");
		int x2 = Integer.parseInt(br.readLine());
		System.out.println("3-2:入力y");
		int y2 = Integer.parseInt(br.readLine());
		if(x2 < y2) {
			System.out.println("大きい方の数はy：" + y2);
		}else {
			System.out.println("大きい方の数はx：" + x2);
		}
		
//		3-3
		System.out.println("3-3:入力x");
		int x3 = Integer.parseInt(br.readLine());
		System.out.println("3-3:入力y");
		int y3 = Integer.parseInt(br.readLine());
		if(x3 > y3) {
			System.out.println("xはyより大きい。");
		}else {
			System.out.println("xはyより小さい。");
		}
		
//		3-4
		System.out.println("3-4:入力x");
		int x4 = Integer.parseInt(br.readLine());
		System.out.println("3-4:入力y");
		int y4 = Integer.parseInt(br.readLine());
		if(x4 > y4) {
			System.out.println("xはyより大きい。");
		}else if(x4 < y4){
			System.out.println("xはyより小さい。");
		}else {
			System.out.println("xとyは等しい。");
		}
		
//		3-5
		System.out.println("3-5:入力");
		int x5 = Integer.parseInt(br.readLine());
		if(x5 % 2 == 0) {
			System.out.println("入力された数は偶数です。");
		}else {
			System.out.println("入力された数は奇数です。");
		}
		
//		3-6
		System.out.println("3-6:入力");
		int x6 = Integer.parseInt(br.readLine());
		if(x6 >= 0) {
			if(x6 % 2 == 0) {
				System.out.println("入力は正の偶数です。");
			}else {
				System.out.println("入力は正の奇数です。");
			}
		}else {
			if(x6 % 2 == 0) {
				System.out.println("入力は負の偶数です。");
			}else {
				System.out.println("入力は負の奇数です。");
			}
		}
	}
}
