import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice5_1_2_3_4 {
 public static void main(String[] args) throws IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	 5-1
	 int value[] = new int[10];
	 for(int i = 0; i < 10; i++) {
		 value[i] = Integer.parseInt(br.readLine());
	 }
	 for(int i = 0; i < 10; i++) {
		 System.out.println(value[i] * 2);
	 }
	 
//	 5-2
	 for(int i = 0; i < 10; i++) {
		 value[i] = Integer.parseInt(br.readLine());
	 }	 
	 for(int i = 9; i >= 0; i--) {
		 System.out.println(value[i]);
	 }
	 
//	 5-3
	 for(int i = 0; i < 10; i++) {
		 value[i] = Integer.parseInt(br.readLine());
	 }
	 System.out.print("偶数：");
	 for(int i = 0; i < 10; i++) {
		 if(value[i] % 2 == 0) {
			 System.out.print(value[i] + " ");
		 }
	 }
	 System.out.println("");
	 System.out.print("奇数：");
	 for(int i = 0; i < 10; i++) {
		 if(value[i] % 2 != 0) {
			 System.out.print(value[i] + " ");
		 }
	 }
	 System.out.println("");
	 
//	 5-4
	 int sum = 0;
	 for(int i = 0; i < 10; i++) {
		 value[i] = Integer.parseInt(br.readLine());
		 sum += value[i];
		 if(sum > 100) {
			 break;
		 }
	 }
	 for(int n : value) {
		 System.out.println(n);
	 }
 }
}
