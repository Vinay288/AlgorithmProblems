import java.util.Arrays;

public class FindPrimeNumber {
	private final static int START_NUMBER = 2;
	private final static int END_NUMBER = 1000;
	static int[] palindrome = new int[500];
	static int palidromeIndex = 0, anagramIndex = 0;
	static int[] anagram = new int[500];
	static int numberOfPrime = 0;

	public static void main(String[] args) {
		Integer[] primeNumbersArray = new Integer[500];
		int arrayIndex = 0;
		for (int i = START_NUMBER; i <= END_NUMBER; i++) {
			int factors = 0;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if ((i % j) == 0) {
					factors++;
					break;
				} else
					continue;
			}
			if (factors == 0) {
				primeNumbersArray[arrayIndex++] = i;
				numberOfPrime++;
//				System.out.println(i + " is a prime number");
			}
		}
		checkForAnagramOrPalindrome(primeNumbersArray);
		for (int i = 0; i < palidromeIndex; i++) {
			System.out.print(palindrome[i]+" ");
		}
		System.out.println(" ");
		for (int i = 0; i < anagramIndex; i++) {
			System.out.print(anagram[i]+" ");
		}

	}

	private static void checkForAnagramOrPalindrome(Integer[] array) {

		for (int i = 0; i < numberOfPrime - 1; i++) {
			for (int j = i; j < numberOfPrime; j++) {
				if (isAnagram(array[i], array[j])) {
					anagram[anagramIndex++] = array[i];
					anagram[anagramIndex++] = array[j];
					if (ispalidrome(array[i], array[j])) {
						palindrome[palidromeIndex++] = array[i];
						palindrome[palidromeIndex++] = array[j];
					} else
						continue;

				} else
					continue;
			}
		}
	}

	private static boolean ispalidrome(int i, int j) {
		String str1 = String.valueOf(i);
		String str2 = new StringBuffer(j).reverse().toString();

		if (str1.equals(str2)) {
			return true;
		}
		return false;
	}

	private static boolean isAnagram(Integer i, Integer j) {
		char[] str1 = Integer.toString(i).toCharArray();
		char[] str2 = Integer.toString(j).toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		if (Arrays.equals(str1, str2)) {
			return true;
		}
		return false;
	}

}
