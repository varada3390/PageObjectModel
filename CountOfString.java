package interviewPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class CountOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Payilagam";
		
		char search = 'a';
		
		int count = 0;
		for(int i=0;i<word.length();i++) {
			
			if(search == word.charAt(i))
				
			count++;	
		}
		System.out.println("Count of a is "+count);
	}

}
