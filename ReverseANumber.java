package interviewPrograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int givenNumber = 0;
		
		int reverseNumber =0;
		
		//Scanner Coding
		System.out.println("Enter your number: ");
		Scanner scanner= new Scanner(System.in);
		givenNumber=scanner.nextInt();
		
		while(givenNumber!=0) {
		reverseNumber= reverseNumber*10;
		reverseNumber=reverseNumber+givenNumber%10;
		givenNumber=givenNumber/10;
		
		
		}
		
		System.out.println(reverseNumber);
		
		
		
	}

}
