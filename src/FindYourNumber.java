import java.util.Scanner;

public class FindYourNumber {
	private static int answer;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the range");
		int range = scanner.nextInt();
		System.out.println("think of a number");
		int answer = scanner.nextInt();
		int startNumber = 0;
		int endNumber = range - 1;

		int iteration = binarySearch(startNumber, endNumber, 0);
		if (iteration >= 0)
			System.out.println("found after " + iteration + " iterations");
		else
			System.out.println("not found");

	}

	public static int binarySearch(int start, int end, int index) {
		if (start <= end) {

			int mid = (start + end) / 2;

			if (guess(mid) == 0) {
				return index;
			}
			if (guess(mid) == 1) {
				return binarySearch(start, mid - 1, ++index);
			} else {
				return binarySearch(mid + 1, end, ++index);
			}
		}
		return -1;

	}

	public static int guess(int mid) {
		if (mid == answer) {
			return 0;
		} else if (mid > answer)
			return 1;
		else
			return 2;
	}
}
