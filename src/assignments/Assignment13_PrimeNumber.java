package assignments;

public class Assignment13_PrimeNumber {

	public static void main(String[] args) {

		int[] n = { 7, 25, 1 };

		for (int i = 0; i < n.length; i++) {
			int num = n[i];
			boolean isPrime = true;

			if (num <= 1) {
				isPrime = false;
			}

			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					isPrime = false;
				}
			}

			if (isPrime) {
				System.out.println(num + " is a Prime Number");
			} else {
				System.out.println(num + " is not a prime number");
			}

		}

	}

}
