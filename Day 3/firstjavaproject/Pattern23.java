package firstjavaproject;

public class Pattern23 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j%2==0) {
					System.out.print("0");
				}
				else 
				{
					System.out.print("1");
				}
			}
				System.out.println();	
			}
		}
	}

/*
10101
10101
10101
10101
10101
*/
