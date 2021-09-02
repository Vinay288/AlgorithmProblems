
public class StringAnagram {
	final static int NUMBER_OF_CHARS = 256;
	public static void main(String[] args) {
		char string1[] = "heart".toCharArray();
		char string2[] = "earth".toCharArray();
		if (anagram(string1, string2))
			System.out.print("strings are anagrams");
		else
			System.out.print("not anagrams");
	}

	static boolean anagram(char[] str1, char[] str2) {

		int[] count = new int[NUMBER_OF_CHARS];
		for (int i = 0; i < str1.length; i++) {
			count[str1[i] - 'a']++;
			count[str2[i] - 'a']--;
		}
		if (str1.length != str2.length)
			return false;
		for (int i = 0; i < NUMBER_OF_CHARS; i++)
			if (count[i] != 0) {
				return false;
			}
		return true;
	}
}
