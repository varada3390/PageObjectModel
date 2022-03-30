package interviewPrograms;

public class Swap2Numbers {

	public void swap2NumberWithUsingThirdVariable() {

		int a = 50;
		int b = 100;

		System.out.println("The value of a before is " + a + " and value of b before is " + b);

		int temp = a;

		a = b;
		b = temp;

		System.out.println("The value of a after is " + a + " and value of b after is " + b);

	}

	
	public void swap2NumberWithoutUsingThirdVariable() {
		
		int a=50,b=100;
		System.out.println(+a+  " and " +b);
		// Using addition and Subtraction
		/*a=a-b;
		b=a+b;
		a=b-a;*/
		
		//Using Multiplication and Division
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println(+a+  " and " +b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Swap2Numbers obj = new Swap2Numbers();
		//obj.swap2NumberWithUsingThirdVariable();
		obj.swap2NumberWithoutUsingThirdVariable();
	}

}
