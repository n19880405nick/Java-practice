import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3_11_12_13 {
	public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//    3-11
		System.out.println("その月の初めから年末までにある祝日を表示します。");
		System.out.println("月を入力してください。");
		int month11 = Integer.parseInt(br.readLine());
		
		switch(month11) {
			case 1:
				System.out.println("1月：元日、成人の日");
			case 2:
				System.out.println("2月：建国記念の日");
			case 3:
				System.out.println("3月：春分の日");
			case 4:
				System.out.println("4月：昭和の日");
			case 5:
				System.out.println("5月：憲法記念日、みどりの日、こどもの日");
			case 6:
			case 7:
				System.out.println("7月：海の日");
			case 8:
			case 9:
				System.out.println("9月：敬老の日、秋分の日");
			case 10:
				System.out.println("10月：体育の日");
			case 11:
				System.out.println("11月：文化の日、勤労感謝の日");
			case 12:
				System.out.println("12月：天皇誕生日");
		}
		
//		3-12　省略
//		3-13
		System.out.println("入力された月の日数を表示します。");
		System.out.println("月を入力してください。");
		int month13 = Integer.parseInt(br.readLine());
		
		switch(month13) {
			case 1:
				System.out.println("1月：31日");
				break;
			case 2:
				System.out.println("2月：28日");
				break;
			case 3:
				System.out.println("3月：31日");
				break;
			case 4:
				System.out.println("4月：30日");
				break;
			case 5:
				System.out.println("5月：31日");
				break;
			case 6:
				System.out.println("6月：30日");
				break;
			case 7:
				System.out.println("7月：31日");
				break;
			case 8:
				System.out.println("8月：31日");
				break;
			case 9:
				System.out.println("9月：30日");
				break;
			case 10:
				System.out.println("10月：31日");
				break;
			case 11:
				System.out.println("11月：30日");
				break;
			case 12:
				System.out.println("12月：31日");
				break;
			default:
				System.out.println("入力が間違っています。");
				break;
		}
	}
}
