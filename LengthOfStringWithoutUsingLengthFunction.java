package interviewPrograms;

import java.util.Scanner;

public class LengthOfStringWithoutUsingLengthFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a word to find the lenght");
		Scanner scanner = new Scanner(System.in);		
		String word=scanner.next();
		
		//System.out.println(word.length());
		char[] charArray=word.toCharArray();
		int length=0;
		//Advanced for loop or for each loop
		for (char c : charArray) {
			length++;
		}
		
		System.out.println(length);
		
	}

}
