package interviewPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter any Number");
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		
		int f=0, s=1, t;
		
		System.out.println(f);
		System.out.println(s);
		
		for(int i=2;i<n;i++) {
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			
			
		}
	}

}
