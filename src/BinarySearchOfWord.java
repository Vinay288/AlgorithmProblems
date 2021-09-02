import java.util.Arrays;

public class BinarySearchOfWord {
	public static void main(String[] args) {
		String array[] = { "ABCD", "AAD", "ABW", "BB" };
		String search = "BB";
		Arrays.sort(array);
		int searchIndex = binarySearch(array, search);
		if (searchIndex == -1)
			System.out.println("not found");
		else
			System.out.println("found at position " + searchIndex);
	}

	public static int binarySearch(String[] stringArray, String search) {
		int low = 0;
		int high = stringArray.length - 1;
		int mid;

		while (low <= high) {
			mid = (low + high) / 2;

			if (stringArray[mid].compareTo(search) < 0) {
				low = mid + 1;
			} else if (stringArray[mid].compareTo(search) > 0) {
				high = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

}
