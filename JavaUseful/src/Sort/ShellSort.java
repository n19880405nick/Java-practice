package Sort;

public class ShellSort {
	public static void shellSort(int[] array) {
		int h = array.length / 2;
		
		while(h > 0) {
			for(int i = h; i < array.length; i++) {
				int j = i;
				while(j >= h && array[j-h] > array[j]) {
					int cp = array[j];
					array[j] = array[j-h];
					array[j-h] = cp;
					j--;
				}
			}
			h /= 2;
		}
	}
	
	public static void main(String[] args) {
		int[] test = {
				2, 5, 7, 32, 14, 16, 22, 21
		};
		shellSort(test);
		for(int i = 0; i < test.length; i++)
			System.out.print(test[i] + " ");
	}
}
