import java.util.Scanner;

public class StringPermutation {
	static String[] permutationRecursive = new String[100];
	static int arrayIndex = 0;

	public static void main(String[] args) {
		System.out.println("enter a word");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		String[] permutationIterative = permutationIterative(word);
		String[] permutationRecursive = permutationRecursive(word, "");
		if (permutationIterative.equals(permutationIterative)) {
			System.out.println("equal");
		}

	}

	public static String[] permutationIterative(String word) {
		int[] factorials = new int[word.length() + 1];
		factorials[0] = 1;
		for (int i = 1; i <= word.length(); i++) {
			factorials[i] = factorials[i - 1] * i;
		}
		String[] permutation = new String[factorials[word.length()]];
		int index = 0;

		for (int i = 0; i < factorials[word.length()]; i++) {
			String permutationWord = "";
			String temp = word;
			int positionCode = i;
			for (int position = word.length(); position > 0; position--) {
				int selected = positionCode % position;
				permutationWord += temp.charAt(selected);
				temp = temp.substring(0, selected) + temp.substring(selected + 1);
			}
			System.out.println(permutationWord);
			permutation[index++] = permutationWord;
		}
		return permutation;

	}

	public static String[] permutationRecursive(String word, String answer) {
		if (word.length() == 0) {

			permutationRecursive[arrayIndex++] = answer;
			return permutationRecursive;
		}

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			String leftSubstr = word.substring(0, i);
			String rightSubstr = word.substring(i + 1);
			String rest = leftSubstr + rightSubstr;
			permutationRecursive(rest, answer + ch);
		}
		return permutationRecursive;
	}

}
