import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CoinCase{
	private int Kind;
	private int Amount1 = 0;
	private int Amount5 = 0;
	private int Amount10 = 0;
	private int Amount50 = 0;
	private int Amount100 = 0;
	private int Amount500 = 0;
	
	public void AddCoins(int kind, int amount) {
		Kind = kind;
		switch(Kind) {
			case 1 : 
				Amount1 += amount;
				break;
			case 5 :
				Amount5 += amount;
				break;
			case 10:
				Amount10 += amount;
				break;
			case 50:
				Amount50 += amount;
				break;
			case 100:
				Amount100 += amount;
				break;
			case 500:
				Amount500 += amount;
				break;
			default:
				break;
		}
	}
	
	public int GetCount(int kind) {
		Kind = kind;
		switch(Kind) {
			case 1 : 
				return Amount1;
			case 5 :
				return Amount5;
			case 10:
				return Amount10;
			case 50:
				return Amount50;
			case 100:
				return Amount100;
			case 500:
				return Amount500;
			default:
				return 0;
		}
	}
	
	public int GetCount2() {
		return (Amount1 + Amount5 + Amount10 + Amount50 + Amount100 + Amount500);
	}
	
	public int GetAmount() {
		return ((Amount1 * 1) + (Amount5 * 5) + (Amount10 * 10) 
				+ (Amount50 * 50) + (Amount100 * 100) + (Amount500 * 500));
	}
	
	public int GetAmount2(int kind) {
		Kind = kind;
		switch(Kind) {
			case 1 : 
				return Amount1 * 1;
			case 5 :
				return Amount5 * 5;
			case 10:
				return Amount10 * 10;
			case 50:
				return Amount50 * 50;
			case 100:
				return Amount100 * 100;
			case 500:
				return Amount500 * 500;
			default:
				return 0;
		}
	}
}

public class Practice7_5_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		CoinCase mywallet = new CoinCase();
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + "回目の入力：種類は");
			int x = Integer.parseInt(br.readLine());
			System.out.print(i + "回目の入力：枚数は");
			int y = Integer.parseInt(br.readLine());
			mywallet.AddCoins(x, y);
		}
		System.out.println("1円は" + mywallet.GetCount(1) + "枚で、" + mywallet.GetAmount2(1) + "円分です。");
		System.out.println("5円は" + mywallet.GetCount(5) + "枚で、" + mywallet.GetAmount2(5) + "円分です。");
		System.out.println("10円は" + mywallet.GetCount(10) + "枚で、" + mywallet.GetAmount2(10) + "円分です。");
		System.out.println("50円は" + mywallet.GetCount(50) + "枚で、" + mywallet.GetAmount2(50) + "円分です。");
		System.out.println("100円は" + mywallet.GetCount(100) + "枚で、" + mywallet.GetAmount2(100) + "円分です。");
		System.out.println("500円は" + mywallet.GetCount(500) + "枚で、" + mywallet.GetAmount2(500) + "円分です。");
		System.out.println("総枚数は" + mywallet.GetCount2() + "枚で総額は" + mywallet.GetAmount() + "円です。");
		
	}
}
