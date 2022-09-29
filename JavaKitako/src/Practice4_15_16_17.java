import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_15_16_17 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		4-15
		System.out.println("入力された数が素数か判定");
		int n = Integer.parseInt(br.readLine());
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				System.out.println(n + "は合成数");
				break;
			}else if(n-1 == i) {
				System.out.println(n + "は素数");
			}
		}
		
//		4-16
		System.out.println("入力した数値を素因数分解");
		int num = Integer.parseInt(br.readLine());
		for(int i = 2; num > 1; i++) {
			while((num % i) == 0) {
				System.out.print(i + " ");
				num /= i;
			}
		}
		System.out.println("");
		
//		4-17
		for(int i = 1; i < 10; i++) {
			for(int x = 1; x < 10; x++) {
				System.out.printf(" %2d", i * x);
			}
			System.out.println("");
		}
	}
}
