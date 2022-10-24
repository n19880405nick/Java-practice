package Sort;

public class MergeSort {
	public static void mergeSort(int[] array, int low, int high) {
		if(low < high) {
			int middle = (low + high) / 2;
			mergeSort(array, low, middle);
			mergeSort(array, middle+1, high);
			merge(array, low, middle, high);
		}
	}
	public static void merge(int[] array, int low, int middle, int high) {
		int[] helper = new int[array.length];
		for(int i = low; i <= high; i++) {
			helper[i] = array[i];
		}
		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;
		
		while(helperLeft <= middle && helperRight <= high) {
			if(helper[helperLeft] <= helper[helperRight]) {
				array[current] = helper[helperLeft];
				helperLeft++;
			}else {
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		int remaining = middle - helperLeft;
		for(int i = 0; i <= remaining; i++) {
			array[current + i] = helper[helperLeft + i];
		}
	}
	
	public static void main(String[] args) {
		int[] test = {
				10, 2, 4, 6, 12, 9
		};
		mergeSort(test, 0, test.length-1);
		for(int i = 0; i < test.length; i++)
			System.out.print(test[i] + " ");
	}
}
