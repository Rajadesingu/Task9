package task9;


import java.util.Scanner;
public class Palindrome {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		
		String str = sc.nextLine();
		
		
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		String rev = sb.toString();
		System.out.println(sb.reverse());
		
		
		if (str.equals(rev))
			
		{
			
			System.out.println(str + "is palindrome");
			
			
		} 
			  else
			  
			  {
			  
			  System.out.println(str + "is not palindrome"); }
			 
		
	}
	
	
}
