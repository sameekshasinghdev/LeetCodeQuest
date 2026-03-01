package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3,n = 3 ;
		int[] nums2 = {2,5,6};
		System.out.println("Merged Array ascending : ");
		merge(nums1,m,nums2,n);
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		// TODO Auto-generated method stub
//		if ((nums1 == null || m== 0)||(nums2 == null || n== 0)) {
//			System.out.println("empty"); // Handle null or empty array
//		}
//		int j=0;
//		for(int i=nums1.length-m;i<m+n;i++) {
//			nums1[i]=nums2[j];
//			j++;
//		}
//		Arrays.sort(nums1);
//		System.out.println(Arrays.toString(nums1));
//	}
		 int i = m - 1;
		    int j = n - 1;
		    int k = m + n - 1;

		    while (j >= 0) {
		        if (i >= 0 && nums1[i] > nums2[j]) {
		            nums1[k] = nums1[i];
		            i--;
		        } else {
		            nums1[k] = nums2[j];
		            j--;
		        }
		        k--;
		    }
		    System.out.println(Arrays.toString(nums1));
		}
		
}
