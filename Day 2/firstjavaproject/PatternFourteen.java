package firstjavaproject;

public class PatternFourteen {

	public static void main(String[] args) {
		int n=5;
		 
		 for(int i=1;i<=n;i++) {
			 
			 for(int j=1;j<=2*(n-i);j++) {
				 
				 System.out.print(" ");
		 }
			 for(int j=i;j>=1;j--) {
				 
				 System.out.print(j+" ");
	}
             for(int j=2;j<=i;j++) {
				 
				 System.out.print(j+" ");
	}
			 
			 System.out.println();
	}
}
	}



/*
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 

*/