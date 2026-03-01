package LeetCode;

public class IsPower {
	public static boolean isPowerOfTwo(int n) {
        if(n<=0)
        {
            return false;
        }
        
        else{
            return (n&(n-1)) ==0 ;
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =15;
		System.out.println("Is power of two: "+isPowerOfTwo(n));
	}

}
