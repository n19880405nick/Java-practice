import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice2_6 {
	public static void main(String[] args) throws IOException{
		
		System.out.println("あなたの年齢は？");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		
		System.out.println("生まれてから現在まで、およそ" + (n * 365) + "日経っています。");
	}
}
