package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,1};
		System.out.println("Single Number"+ singleNumber(nums));

	}
	public static int singleNumber(int[] nums) {
        Map<Integer,Integer> countMap = new HashMap<Integer,Integer>();
        for(int num: nums){
            countMap.put(num,countMap.getOrDefault(num,0)+1);
           
        }
        for (int num : nums) {
	        if (countMap.get(num) == 1) {
	            return num;
	        }
	    }
        return -1;
    }
}
