package task9;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Mark ");
		int mark = sc.nextInt();
		
		if (mark==100 ) {
		    System.out.println("S grade");
		}
		else if (mark <=99 && mark>=90) {
			System.out.println("A grade");
		}
		else if (mark <=89 && mark>=80) {
			System.out.println("B grade");
		}
		else if (mark <=79 && mark>=70) {
			System.out.println("C grade");
		}
		else if (mark <=69 && mark>=60) {
			System.out.println("D grade");
		}
		else if (mark <=59 && mark>=50) {
			System.out.println("E grade");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
}
