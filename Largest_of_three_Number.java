package task9;

import java.util.Scanner;

public class Largest_of_three_Number {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		
		int l = a>b?a:b;
		int l1 = c>l?c:l;
		
		System.out.println(l1 + " is largest number ");
	}

}
