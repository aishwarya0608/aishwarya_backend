package firstjavaproject;

public class Pattern30 {

	public static void main(String[] args) {
		int size = 5;
	    int letters= 65;
	    for (int i = 0; i < size; i++) {
	      for (int j = 0; j < size; j++) {
	        System.out.print((char)(letters+j));
	      }
	      System.out.println();
	    }
}

	}


/*
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
*/