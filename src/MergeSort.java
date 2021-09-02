
public class MergeSort {
	private int[] inputArray;
	private int[] tempArray;
	private int length;

	public static void main(String a[]) {
		int[] inputArray = { 67, 89, 32, 76, 41, 99, 12, 05, 40, 53 };
		System.out.println("Array before sorting ");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]+" ");
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(inputArray);
		System.out.println("Array after sorting is ");
		for (int i : inputArray) {
			System.out.print(i+" ");
		}
	}

	public void sort(int inputArray[]) {
		this.inputArray = inputArray;
		this.length = inputArray.length;
		this.tempArray = new int[length];
		mergeSort(0, length - 1);
	}

	private void mergeSort(int lowIndex, int highIndex) {
		if (lowIndex < highIndex) {
			int middle = lowIndex + (highIndex - lowIndex) / 2;
			mergeSort(lowIndex, middle);
			mergeSort(middle + 1, highIndex);
			merge(lowIndex, middle, highIndex);
		}
	}

	private void merge(int lowIndex, int middle, int highIndex) {
		for (int i = lowIndex; i <= highIndex; i++) {
			tempArray[i] = inputArray[i];
		}
		int i = lowIndex;
		int j = middle + 1;
		int k = lowIndex;
		while (i <= middle && j <= highIndex) {
			if (tempArray[i] <= tempArray[j]) {
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
