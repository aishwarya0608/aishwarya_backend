package firstjavaproject;

public class Pattern34 {

	public static void main(String[] args) {
		  int n = 5;
	        int num = 1;
	        
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < i * 2; j++) {
	                System.out.print(" ");
	            }
	          
	            for (int k = 0; k < n - i; k++) {
	                System.out.print(num + " ");
	                num++;
	            }
	           
	            for (int l = n - i - 2; l >= 0; l--) {
	                System.out.print(num - 2 + " ");
	                num--;
	            }
	            num = 1;
	            
	            System.out.println();
	        }
	    }
	}


/*
1 2 3 4 5 4 3 2 1 
1 2 3 4 3 2 1 
  1 2 3 2 1 
    1 2 1 
      1 
*/