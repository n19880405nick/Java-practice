import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice3_9 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("3-9:病院が開いているかの確認");
		System.out.println("入力ガイド（曜日）：>0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int x9 = Integer.parseInt(br.readLine());
		System.out.println("入力ガイド（時間帯）:>0=午前、1=午後、2=夜間");
		int y9 = Integer.parseInt(br.readLine());
		
		switch(y9){
			case 0:
				switch(x9) {
					case 0:
						System.out.println("日曜午前：休診");
						break;
					case 1:
						System.out.println("月曜午前：〇");
						break;
					case 2:
						System.out.println("火曜午前：休診");
						break;
					case 3:
						System.out.println("水曜午前：〇");
						break;
					case 4:
						System.out.println("木曜午前：〇");
						break;
					case 5:
						System.out.println("金曜午前：休診");
						break;
					case 6:
						System.out.println("土曜午前：〇");
						break;
				}
				break;
			case 1:
				switch(x9) {
					case 0:
						System.out.println("日曜午後：休診");
						break;
					case 1:
						System.out.println("月曜午後：〇");
						break;
					case 2:
						System.out.println("火曜午後：〇");
						break;
					case 3:
						System.out.println("水曜午後：〇");
						break;
					case 4:
						System.out.println("木曜午後：〇");
						break;
					case 5:
						System.out.println("金曜午後：〇");
						break;
					case 6:
						System.out.println("土曜午後：休診");
						break;
				}
				break;
			case 2:
				switch(x9) {
					case 0:
						System.out.println("日曜夜間：休診");
						break;
					case 1:
						System.out.println("月曜夜間：〇");
						break;
					case 2:
						System.out.println("火曜夜間：〇");
						break;
					case 3:
						System.out.println("水曜夜間：休診");
						break;
					case 4:
						System.out.println("木曜夜間：〇");
						break;
					case 5:
						System.out.println("金曜夜間：〇");
						break;
					case 6:
						System.out.println("土曜夜間：休診");
						break;
				}
				break;
		}
	}
}
