import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_5_6 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		4-5
		System.out.println("整数を10回入力してください。平均値を求めます。");
		int ave = 0;
		for(int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());
			ave += n;
		}
		System.out.println("平均値は " + (ave / 10));
		
//		4-6
		System.out.println("0を負け、1を勝ちとして、それぞれの総数を表示する。");
		System.out.println("0か1を入力");
		
		int win = 0;
		int lose = 0;
		for(int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				lose++;
			}else {
				win++;
			}
		}
		System.out.println("勝ちの総数：" + win);
		System.out.println("負けの総数：" + lose);
	}
}
