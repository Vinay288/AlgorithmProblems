
public class MergeSort {

	public static void main(String a[]) {
		Integer[] inputArray = { 67, 89, 32, 76, 41, 99, 12, 05, 40, 53 };
		System.out.println("Array before sorting ");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(inputArray, 0, inputArray.length - 1);
		System.out.println("Array after sorting is ");
		for (int i : inputArray) {
			System.out.print(i + " ");
		}
	}

	private <T extends Comparable<T>> void mergeSort(T[] inputArray, int lowIndex, int highIndex) {
		if (lowIndex < highIndex) {
			int middle = lowIndex + (highIndex - lowIndex) / 2;
			mergeSort(inputArray, lowIndex, middle);
			mergeSort(inputArray, middle + 1, highIndex);
			merge(inputArray, lowIndex, middle, highIndex);
		}
	}

	private <T extends Comparable<T>> void merge(T[] inputArray, int lowIndex, int middle, int highIndex) {

		T tempArray[] = (T[]) new Object[highIndex - lowIndex + 1];
		for (int i = lowIndex; i <= highIndex; i++) {
			tempArray[i] = inputArray[i];
		}
		int i = lowIndex;
		int j = middle + 1;
		int k = lowIndex;
		while (i <= middle && j <= highIndex) {
			if ((tempArray[i].compareTo(tempArray[j])) <= 0) {
				inputArray[k] = tempArray[i];
				i++;
			} else {
				inputArray[k] = tempArray[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			inputArray[k] = tempArray[i];
			k++;
			i++;
		}

	}

}
