
public class InsertionSort {

	public static void main(String[] args) {
		int[] inputArray = { 3,8,20,7,5,15,19 };
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

	public static void insertionSort(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}

}
