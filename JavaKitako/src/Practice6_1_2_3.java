import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice6_1_2_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		6-1
		System.out.println("3の2乗 = " + pow2(3));
		
//		6-2
		System.out.println("10と8の平均 = " + ave2(10, 8));
		
//		6-3
		System.out.println("3と5で大きい方は：" + com2(3, 5));
		System.out.println("3つの数値を入力、最も大きい数値を出力");
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());
		System.out.println("最も大きいの数値 = " + com2(x, com2(y, z)));

	}
	static int pow2(int n) {
		return n * n;
	}
	static int ave2(int n, int i) {
		return ((n + i) / 2);
	}
	static int com2(int n, int i) {
		if(n < i) {
			return i;
		}else {
			return n;
		}
	}
}
