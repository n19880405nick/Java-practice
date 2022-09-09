
public class Chapter08 {
	public static void main(String[] args) {
		int count = 1;
		while(count < 5) {
			int counts = count * count;
			System.out.println("While = " + counts);
			count++;
		}
		
		int array[] = { 1, 2, 3, 4};
		for(int i = 0; i < array.length; i++) {
			System.out.println("For = " + array[i]);
		}
		
		for(int number : array) {
			if(number % 2 == 0) {
				continue;
			}
			System.out.println("exFor = " + number);
		}
	}
}
