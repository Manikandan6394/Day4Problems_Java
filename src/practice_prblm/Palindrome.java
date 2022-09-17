package practice_prblm;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		 {  
		      String org, rev = "";   
		      Scanner Sc = new Scanner(System.in);   
		      System.out.println("Enter a string/number to check if it is a palindrome");  
		      org = Sc.nextLine();   
		      int length = org.length();   
		      for ( int i = length - 1; i >= 0; i-- )  
		         rev = rev + org.charAt(i);  
		      if (org.equals(rev))  
		         System.out.println("Entered no is palindrome");  
		      else  
		         System.out.println("Entered no isn't a palindrome.");   
		   }  
		}  

	}


