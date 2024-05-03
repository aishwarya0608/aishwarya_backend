package firstjavaproject;

public class Pattern27 {

	public static void main(String[] args) {
		 int n = 5;
	        for (int i = 0; i <  n; i++) {
	           
	            for (int j = 0; j < n - i - 1; j++) {
	                System.out.print("  ");
	            }
	       
	            for (int k = 0; k < 2 * i + 1; k++) {
	                if (i % 2 == 0) {
	                    System.out.print("1 ");
	                } else {
	                    System.out.print("0 ");
	                }
	            }
	            
	            System.out.println();
	        }
	}

}
/*
        1 
      0 0 0 
     1 1 1 1 1 
   0 0 0 0 0 0 0 
 1 1 1 1 1 1 1 1 1 
*/