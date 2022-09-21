import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_10_11_12 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		4-10
		System.out.println("入力された数の分、＊を表示する。");
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println("");
		
//		4-11
		System.out.println("入力された数の分、0～9の数字を連続して表示する。");
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i < num; i++) {			
			if(i >= 10) {
				System.out.print(i % 10);
			}else {
				System.out.print(i);
			}
		}
		System.out.println("");
		
//		4-12
		int sum = 0;
		System.out.println("数値を繰り返し入力、100を超えたらストップする。");
		while(sum < 100) {
			int s = Integer.parseInt(br.readLine());
			sum += s;
		}
		System.out.println("合計：" + sum);
	}
}
