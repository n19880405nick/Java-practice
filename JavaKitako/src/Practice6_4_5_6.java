
public class Practice6_4_5_6 {
	public static void main(String[] args) {
//		6-4
		tri(3);
		System.out.println("");
		tri(4);
		System.out.println("");
		tri(5);
		
//		6-5
		extri(5, 'q');
		System.out.println("");
		extri(3, 'f');
		System.out.println("");
		extri(8, '$');
		
//		6-6
		for(int i = 1; i <= 9; i++){
			kuku(i);
		}
	}
	
	static void tri(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("$");
			}
			System.out.println("");
		}
	}
	
	static void extri(int n, char x) {
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(x);
			}
			System.out.println("");
		}
	}
	
	static void kuku(int n) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf(" %2d", n * i);
		}
		System.out.println("");
	}
}
