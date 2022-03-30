package interviewPrograms;

import java.util.Scanner;

public class PositionOfMyEnglishAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ASCII -> (a=97;A=65)
		
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter your Character");
		char givenCharacter=scanner.next().charAt(0);
		givenCharacter=Character.toLowerCase(givenCharacter);
		
		int asciiValue=(int)givenCharacter;
		int position=asciiValue-96;
		System.out.println(position);
		
		}
		
	}


