package integerPalindrome;

public class PalindromeInteger{
	public boolean checlkPalindrome(int n) {
		int r, sum = 0, temp;

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {
			return true;
		}
		return false;

	}
}
