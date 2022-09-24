import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_18_19 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		4-18
		int sum = 0;
		System.out.println("数値を入力、０を入力でそこまでの合計を表示");
		for(int i = 0; i >= 0; i++) {
			int x = Integer.parseInt(br.readLine());	
			sum += x;
			if(x == 0) {
				break;
			}
		}
		System.out.println("合計：" + sum);
		
//		4-19
		int ave = 0;
		System.out.println("数値を入力、０を入力でそこまでの合計の平均値を表示");
		System.out.println("*最初に０を入力しない");
		for(int i = 1; i >= 1; i++) {
			int x = Integer.parseInt(br.readLine());	
			ave += x;
			if(x == 0) {
				ave /= (i - 1);
				break;
			}
		}
		System.out.println("平均値：" + ave);
		
	}
}
