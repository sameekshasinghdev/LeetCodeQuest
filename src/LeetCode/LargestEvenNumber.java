package LeetCode;

public class LargestEvenNumber {
	
	public static String largestEven(String s) {
//      for(char ch: s.toCharArray()) {
//    	  if(ch.contains('2')!=0) {
//          	
//          }
//      }
		String result ="";
		  if(!s.contains("2")) {
	        	return result;
	        }
		  else if(s.endsWith("2")){
			  return s;
		  }
		  else if(s.endsWith("1")){
			  while(s.endsWith("1")) {
				  s = s.substring(0, s.length() - 1);
			  }
			  return s;
			  
		  }
        return null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "211";
		System.out.println("Largest Even Number : "+largestEven(s));
	}

}
