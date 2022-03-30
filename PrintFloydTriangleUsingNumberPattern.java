package interviewPrograms;

import java.util.Scanner;

public class PrintFloydTriangleUsingNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number of lines ");
		Scanner scanner=new Scanner(System.in);
		int numberOfLines=scanner.nextInt();
		int startingNumber=1;
		int row,column;
		for (row=0;row<numberOfLines;row++) {
			
			for(column=0;column<=row;column++) {
				
				System.out.print(startingNumber+ " ");
				startingNumber=startingNumber+1;
			
			}
			
			System.out.println();
			
		}
		
		
	}

}
