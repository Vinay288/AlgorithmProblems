import java.util.Arrays;

public class BinarySearchOfWord {
	public static void main(String[] args) {
		String stringArray[] = { "ABCD", "AAD", "ABW", "BB" };
		String searchKey = "BB";
		Arrays.sort(stringArray);
		int searchIndex = binarySearch(stringArray, searchKey);
		if (searchIndex == -1)
			System.out.println("not found");
		else
			System.out.println("found at position " + searchIndex);
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Integer search = 5;
		searchIndex = binarySearch(integerArray, search);
		if (searchIndex == -1)
			System.out.println("not found");
		else
			System.out.println("found at position " + searchIndex);
	}

	public static <T extends Comparable<T>> int binarySearch(T[] inputArray, T searchKey) {
		int low = 0;
		int high = inputArray.length - 1;
		int mid;

		while (low <= high) {
			mid = (low + high) / 2;

			if (inputArray[mid].compareTo(searchKey) < 0) {
				low = mid + 1;
			} else if (inputArray[mid].compareTo(searchKey) > 0) {
				high = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

}
