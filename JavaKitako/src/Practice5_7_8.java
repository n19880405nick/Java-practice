import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice5_7_8 {
 public static void main(String[] args) throws IOException{
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
//	 5-7
	 System.out.println("１～９の数値を２つ入力、積を表示");
	 int kuku[][] = new int[9][9];
	 for(int i = 0; i < 9; i++) {
		 for(int j = 0; j < 9; j++)
			 kuku[i][j] = (i + 1) * ( j + 1);
	 }
	 int x = Integer.parseInt(br.readLine());
	 int y = Integer.parseInt(br.readLine());
	 System.out.println("結果は：" + kuku[x-1][y-1]);
	 
//	 5-8
	 System.out.println("整数を１０回入力、小さい順に並べて表示");
	 int value[] = new int[10];
	 for(int i = 0; i < 10; i++) 
		 value[i] = Integer.parseInt(br.readLine());
	 for(int i = 0; i < 10; i++) {
		 for(int j = i + 1; j < 10; j++) {
			 if(value[i] > value[j]) {
				 int n = value[i];
				 value[i] = value[j];
				 value[j] = n;
			 }
		 }
	 }
	 for(int i = 0; i < 10; i++)
		 System.out.print(value[i] + " ");
 }
}
