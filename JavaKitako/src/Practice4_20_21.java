import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_20_21 {
 public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
//	 4-20
	 System.out.println("サイズを示す数値を入力");
	 int tri = Integer.parseInt(br.readLine());
	 for(int i = 1; i <= tri; i++) {
		 for(int x = 0; x < i; x++) {
			 System.out.print("$");
		 }
		 System.out.println("");
	 }
	 
//	 4-21
	 System.out.println("サイズを示す数値を入力");
	 int cross = Integer.parseInt(br.readLine());
	 for(int i = 0; i < cross; i++) {
		 for(int x = 0; x < cross; x++) {
			 if(i == x || (cross - i - 1) == x) {
				 System.out.print("X");
			 }else {
				 System.out.print(" ");
			 }
		 }
		 System.out.println("");
	 }
 }
}
