package firstjavaproject;

public class Pattern32 {

	public static void main(String[] args) {
		int n = 5;
        int stars = 9;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            
          
            for (int k = 0; k < stars; k++) {
                System.out.print("* ");
            }
            
            stars -= 2; 
            System.out.println();
        }
    }
	}


/*
 
 
* * * * * * * * * 
 * * * * * * * 
   * * * * * 
     * * * 
       * 
*/