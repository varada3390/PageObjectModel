package interviewPrograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int fact = num;
		
		while(num>1) {
			num--;
			fact= fact*num;
		}
		
		System.out.println("Factorial of the given number is " +fact);
	}

}
