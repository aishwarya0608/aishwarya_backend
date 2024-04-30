package firstjavaproject;

public class PatternEight {

	public static void main(String[] args) {
	
		int n=5;
		
		int i,j;
		for(i=n; i>=1; i--) {
			
				for(j=1; j<=i; j++) {
					System.out.print(i+" ");
			}
			for(j=0; j<=n-i; j++) {
		}
		System.out.println(" ");
	}

}
}

/*

5 5 5 5 5  
4 4 4 4  
3 3 3  
2 2  
1  

*/