package LeetCode;

import java.util.HashSet;

public class HappyNumber {

	public static boolean isHappy(int n) {

		HashSet<Integer> seen = new HashSet<>();

		while (n != 1) {

			if (seen.contains(n)) {
				return false; // cycle detected
			}

			seen.add(n);
			n = getSumOfSquares(n);
		}

		return true;
	}

	private static int getSumOfSquares(int n) {
		int sum = 0;

		while (n > 0) {
			int digit = n % 10;
			sum += digit * digit;
			n = n / 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Happy Number : "+isHappy(999));

	}

}
