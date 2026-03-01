package LeetCode;

import java.util.Arrays;

public class PlusOne {
	
	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
	        
	        if (digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        
	        digits[i] = 0;  // handle carry
	    }

	    // If all digits were 9
	    int[] result = new int[digits.length + 1];
	    result[0] = 1;
	    return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {9,9,9};
		int a=19;
		float split = 19%10;
		System.out.println(split);
		System.out.println("Plus one: "+Arrays.toString(plusOne(digits)));
	}

}
