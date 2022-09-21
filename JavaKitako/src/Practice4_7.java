import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k_num = 0;
		int h_num = 0;
		System.out.println("巨人、阪神戦の毎回の得点を入力");
		for(int i = 1; i <= 9; i++) {
			System.out.print(i + "回表、巨人の得点は？");
			int k = Integer.parseInt(br.readLine());
			k_num += k;
			System.out.print(i + "回裏、阪神の得点は？");
			int h = Integer.parseInt(br.readLine());
			h_num += h;
		}
		System.out.println("巨人：" + k_num + "点、阪神：" + h_num + "点");
		if(k_num > h_num) {
			System.out.println("巨人の勝ち");
		}else {
			System.out.println("阪神の勝ち");
		}
	}
}
