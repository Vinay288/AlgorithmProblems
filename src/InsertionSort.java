
public class InsertionSort {

	public static void main(String[] args) {
		Integer[] inputArray = { 3, 8, 20, 7, 5, 15, 19 };
		System.out.println("Before Insertion Sort");
		for (int i : inputArray) {
			System.out.print(i + " ");
		}
		insertionSort(inputArray);

		System.out.println("After Insertion Sort");
		for (int i : inputArray) {
			System.out.print(i + " ");
		}
	}

	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			T key = array[j];
			int i = j - 1;
			while ((i > -1) && ((array[i].compareTo(key) > 0))) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}

}
