package interviewPrograms;

import java.util.stream.IntStream;

public class ArrayContainsElementOrNot {
	int array[] = {11,15,7,13,88,15,13};
	
	int numberToFind=13;
	
	boolean found = false;
	
	public void presentOrNot() {
		for (int number : array) {
			
			if(number==numberToFind) {
				found=true;
				//System.out.println("Number Present");
				//break;
			}
			
		} 
		
		if(found) {
			System.out.println("Number Present");
		} else {
			System.out.println("Number not found");
		}
	}
	
	public void intStream() {
		boolean found=IntStream.of(array).anyMatch(element->element==numberToFind);
		if(found) {
			System.out.println("Number Present");
		} else {
			System.out.println("Number not Present");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayContainsElementOrNot obj = new ArrayContainsElementOrNot();
		//obj.presentOrNot();
		obj.intStream();
		
		
	}

}
