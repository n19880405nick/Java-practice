import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_13_14 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int st = 0;
		int ba = 0;
		while(st < 3 && ba < 4) {
			System.out.println("ストライク=1 or ボール=2 or ファウル=3 ？");
			int th = Integer.parseInt(br.readLine());
			if(th == 1 || th == 3) {
				st++;
				if(st == 3 && th == 3) {
					st--;
				}
			}else if(th == 2) {
				ba++;
			}
		}
		System.out.println(ba + "ボール、" + st + "ストライク");
	}
}
