package Sort;

public class QuickSort {
	public static void quickSort(int[] array, int left, int right) {
		if(left <= right) {
			int p = array[(left + right) >>> 1];
			int l = left;
			int r = right;
			while(l <= r) {
				while(array[l] < p) {
					l++;
				}
				while(array[r] > p) {
					r--;
				}
				if(l <= r) {
					int cp = array[l];
					array[l] = array[r];
					array[r] = cp;
					l++;
					r--;
				}
			}
			quickSort(array, left, r);
			quickSort(array, l, right);
		}
	}
	public static void main(String[] args) {
		int[] test = {
				10, 3, 4, 6, 8, 15, 12
		};
		quickSort(test, 0, test.length-1);
		for(int i = 0; i < test.length; i++)
			System.out.print(test[i] + " ");
	}
}
