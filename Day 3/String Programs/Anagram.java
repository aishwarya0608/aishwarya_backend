package secondproject;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
				String s ="listen";
				String s1="silent";
				char c[]= s.toCharArray();
				char c1[]=s1.toCharArray();
				
				if(c.length!=c1.length) {
					System.out.print("not an Anagram");
					System.exit(0);
				}
				Arrays.sort(c);
				Arrays.sort(c1);
				for(int i=0;i<c.length;i++) {
					if(c[i]!=c[i]) {
						System.out.print("not an Anagram");
					}
						else {
							System.out.print("An Anagram");
							System.exit(0);
						}
					
					}
	}
}
		

	


