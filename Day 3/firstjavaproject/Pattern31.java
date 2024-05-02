package firstjavaproject;

public class Pattern31 {
	
	public static void main(String[] args) {
		  int n = 5;
	        int currentNumber = 1;

	        for (int i = 1; i <= n; i++) {
	            int num = currentNumber;
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                num += n - j;
	            }
	            System.out.println();
	            currentNumber++;
	        }
	    }

}
/*
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 
*/
