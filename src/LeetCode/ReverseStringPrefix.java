package LeetCode;

public class ReverseStringPrefix {
	
	public static String reversePrefix(String s, int k) {
//        int n = s.length();
//        char[] str = s.toCharArray();
//        for (int i = 0; i < n; i += k) {
//			int left = i;
//			int right = Math.min(i + k - 1, n - 1);
//			while (left < right) {
//				char temp = str[left];
//				str[left] = str[right];
//				str[right] = temp;
//				left++;
//				right--;
//			}
//		}
//        return new String(str);
		
		char[] arr = s.toCharArray();

	    int left = 0;
	    int right = k - 1;

	    while (left < right) {
	        char temp = arr[left];
	        arr[left] = arr[right];
	        arr[right] = temp;
	        left++;
	        right--;
	    }

	    return new String(arr);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		int k=2;
		System.out.println(reversePrefix(s,k));
	}

}
