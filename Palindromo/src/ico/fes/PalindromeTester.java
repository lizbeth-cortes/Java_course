package ico.fes;

import java.util.Scanner;

public class PalindromeTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = in.next();
		in.close();
		int firstPosition = 0;
		int lastPosition = word.length()-1;
		boolean isAPalindrome = true;
		
		while (firstPosition < lastPosition) {
			if(word.charAt(firstPosition)!=word.charAt(lastPosition))
				isAPalindrome = false;
			firstPosition++;
			lastPosition--;
		}
		
		if (isAPalindrome)
			System.out.println("The word is a Palindrome");
		else
			System.out.println("The word is not a Palindrome");

	}

}
