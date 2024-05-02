package firstjavaproject;

public class Pattern26 {

	public static void main(String[] args) {
		 int rows = 5;
	        
	        for (int i = 0; i < rows; i++) {
	           
	            for (int j = 0; j < 2 * (rows - i - 1); j++) {
	                System.out.print(" ");
	            }
	           
	            for (int k = 0; k <= i; k++) {
	                if (k % 2 == 0) {
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
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1
*/