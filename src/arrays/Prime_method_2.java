package arrays;

public class Prime_method_2 {

	public static void main(String[] args) {
		int count = 0; int n = 10;
		for(int i =2;i<n;i++) {
			count = 0;
          for(int j = 2; j < i/2;j++) {
        	  
        	  if(i%j == 0) {
        		  count ++;
        		  break;
        	  }
          }
          if(count == 0) {
        	  System.out.println(i);
          }
		}
	}

}
