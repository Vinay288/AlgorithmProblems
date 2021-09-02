
public class BubbleSort {

	public static void main(String[] args) {
		Integer[] inputArray = { 20, 9, 7, 101, 23, 44, 12, 78, 34, 32 };
		System.out.println("before sort");
		for (int i : inputArray)
			System.out.print(i + " ");
		System.out.println("");
		bubbleSort(inputArray);
		String[] stringArray = { "AA", "BB", "CC" };
		bubbleSort(stringArray);
	}

	static <T extends Comparable<T>> void bubbleSort(T[] inputArray) {
		for (int i = 0; i < inputArray.length - 1; i++) {
			for (int j = i; j < inputArray.length; j++) {
				if (inputArray[i].compareTo(inputArray[j]) > 0) {
					T temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		System.out.println("after sort");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
	}

}
