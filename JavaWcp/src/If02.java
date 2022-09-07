
public class If02 {
	public static void main(String[] args) {
		int number = 7;
		if(number < 7) {
			System.out.println(number + "は5未満です");
		}else if(number < 10) {
			System.out.println(number + "は5以上、10未満です");
		}else if(number < 15) {
			System.out.println(number + "10以上、15未満です");
		}else {
			System.out.println(number + "15以上です");
		}
	}
}
