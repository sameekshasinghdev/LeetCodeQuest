package LeetCode;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given a string s, find the length of the longest substring without duplicate characters.
		String s= "pwwkew";
		System.out.println("find the length of the longest substring without duplicate characters. : "+ longestSubstring(s));
	}

	private static int longestSubstring(String s) {
		// TODO Auto-generated method stub
		int left = 0, right = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            if (!set.contains(c)) {
                set.add(c);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
	}

}
