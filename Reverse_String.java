package task9;

import java.util.Scanner;

public class Reverse_String {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		
		String str = sc.nextLine();
		
		
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
}

}
