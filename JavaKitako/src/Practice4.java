
public class Practice4 {
	public static void main(String[] args) {
//		4-1
		for(int i = 1; i <= 10; i++) {
			System.out.println("SPAM : " + i + "回目");
		}
		
//		4-2
		for(int i = 1; i <= 9; i++) {
			System.out.println("3 * " + i + " = " + (3 * i));
		}
		
//		4-3
		int sec = 2;
		for(int i = 1; i <= 8; i++) {
			System.out.println(sec + " の " + i + "乗 = " + Math.pow(sec, i));
		}
		
//		4-4
		int n = 1;
		for(int i = 1; i<= 7; i++) {
			n *= i;
			if(i == 7) {
				System.out.println(i + " の階乗は " + n);
			}
		}
	}
}
