import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_8_9 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		4-8
		int max_num = 1;
		System.out.println("自然数を10回入力、最大値を求める。");
		for(int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			if(max_num < num) {
				max_num = num;
			}
		}
		System.out.println("最大値は：" + max_num);
		
//		4-9
		max_num = 0;
		int min_num = 0;
		System.out.println("整数を10回入力、最大値と最小値を求める。");
		for(int i = 0; i < 10; i++) {
			int num = Integer.parseInt(br.readLine());
			if(max_num < num) {
				max_num = num;
			}
			if(min_num > num) {
				min_num = num;
			}
		}
		System.out.println("最大値は：" + max_num);
		System.out.println("最小値は：" + min_num);
	}
}
