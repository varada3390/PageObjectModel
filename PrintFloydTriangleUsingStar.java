package interviewPrograms;

import java.util.Scanner;

public class PrintFloydTriangleUsingStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberofLines=0;
		System.out.println("Enter Number of Lines :");
		Scanner scanner= new Scanner(System.in);
		numberofLines=scanner.nextInt();
		
		int row,column;
		
		for(row=0;row<numberofLines;row++) {
			
			for(column=0;column<=row;column++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}
