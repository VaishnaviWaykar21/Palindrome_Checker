//Task: Palindrome Checker

package Level_1;

import java.util.Scanner;

public class Task_2 {
	
	public static void Palindrome(String str) {
	
		String newstr = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			newstr += str.charAt(i);
		}

		if(newstr.equals(str)) {
			System.out.println(str + " is a Palindrome");
		}
		else {
			System.out.println(str + " is Not a Palindrome");
		}

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Word or phrase : ");
		String str = sc.nextLine();
		
		Palindrome(str);
		sc.close();
	}

}
