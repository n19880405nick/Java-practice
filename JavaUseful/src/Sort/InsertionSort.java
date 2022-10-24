package Sort;

public class InsertionSort {
	public static void insertionSort(int[] array) {
		for(int i = 1; i < array.length; i++) {
			int j = i;
			while(j >= 1 && array[j-1] > array[j]) {
				int cp = array[j];
				array[j] = array[j-1];
				array[j-1] = cp;
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] test = {
				3, 4, 6, 2, 40, 22, 15, 10
		};
		insertionSort(test);
		for(int i = 0; i < test.length; i++)
			System.out.print(test[i] + " ");
	}
}
