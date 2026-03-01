package LeetCode;

public class ClimibingStairs {
	public static int climbStairs(int n) {
	       // Base cases: If there are 0 or 1 stairs,
	        // there is only one way to reach the top.
//	        if (n == 0 || n == 1)
//	            return 1;
//
//	        return climbStairs(n - 1) + climbStairs(n - 2);
		if (n <= 1) return 1;

	    int prev2 = 1;  // ways to reach step 0
	    int prev1 = 1;  // ways to reach step 1

	    for (int i = 2; i <= n; i++) {
	        int current = prev1 + prev2;
	        prev2 = prev1;
	        prev1 = current;
	    }

	    return prev1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * You are climbing a staircase. It takes n steps to reach the top.
		 * 
		 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
		 * you climb to the top?
		 */		
		int n=5;
		System.out.println("ways to climb to the top : "+ climbStairs(n));
	}

}
