package Sort;

public class SelectionSort {
	public static void selectionSort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int index = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < array[index]) {
					index = j;
				}
			}
			if(i != index) {
				int cp = array[index];
				array[index] = array[i];
				array[i] = cp;
			}
		}
	}
	public static void main(String[] args) {
		int[] test = {
				10, 2, 5, 23, 11, 15, 3, 6
		};
		selectionSort(test);
		for(int i = 0; i < test.length; i++)
			System.out.print(test[i] + " ");
	}
}
