package secondproject;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
				String s,str="";
				int i;
				 Scanner sc = new Scanner(System.in);
				 System.out.println("Enter a String");
				 s=sc.nextLine();
				 
				 for(i=s.length()-1;i>=0;i--)
				 {
					 str=str+s.charAt(i);
				 }
				 System.out.println("Reverse string is:" +str);
			
			if(s.equals(str))
			{
			System.out.println("String is palindrome");
			}
			else
			{
			System.out.println("String is not palindrome");	
		}
			}
		
}
