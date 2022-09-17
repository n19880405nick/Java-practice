import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice3_7_8 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		3-7
		System.out.println("3-7:試験の点数入力");
		int x7 = Integer.parseInt(br.readLine());
		if(x7 >= 60) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		if(x7 >= 80) {
			System.out.println("たいへんよくできました。");
		}else if((x7 < 80) && (x7 >= 60)) {
			System.out.println("よくできました。");
		}else {
			System.out.println("ざんねんでした。");
		}
		if(x7 >= 80) {
			System.out.println("優");
		}else if((x7 < 80) && (x7 >= 70)) {
			System.out.println("良");
		}else if((x7 < 70) && (x7 >= 60)) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
		
//		3-8
		System.out.println("3-8:中間試験の点数入力");
		int x8 = Integer.parseInt(br.readLine());
		System.out.println("3-8:期末試験の点数入力");
		int y8 = Integer.parseInt(br.readLine());
		if((x8 >= 60) && (y8 >= 60)) {
			System.out.println("合格");
		}else if((x8 + y8) >= 130) {
			System.out.println("合格");
		}else if(((x8 + y8) >= 100) && ((x8 >= 90) || (y8 >= 90))) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
	}
}
