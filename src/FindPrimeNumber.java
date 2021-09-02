
public class FindPrimeNumber {
	private final static int START_NUMBER = 2;
	private final static int END_NUMBER = 100;

	public static void main(String[] args) {
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
				System.out.println(i + " is a prime number");
			}
		}

	}

}
