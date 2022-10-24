package Sort;

public class BubbleSort {
	public static void bubbleSort(int[] array) {
		int cp;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length -i -1; j++) {
				if(array[j] > array[j+1]) {
					cp = array[j];
					array[j] = array[j+1];
					array[j+1] = cp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] test = {
				10, 3, 56, 2, 44, 25, 23, 6, 8
		};
		bubbleSort(test);
		for(int i = 0; i < test.length; i++)
			System.out.print(test[i] + " ");
	}
}
