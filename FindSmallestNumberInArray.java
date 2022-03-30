package interviewPrograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindSmallestNumberInArray {
	Integer givenArray[] = {5,8,20,2,75};
	
	public void findSmallest( ) {
				
		int small=Integer.MAX_VALUE;
		
		for(int i=0;i<givenArray.length;i++) {
			
			if(givenArray[i]<small) {
				
			small=givenArray[i];
			}
		}
		
		System.out.println(small);
	}
	
	public void usingArray() {
		
		Arrays.sort(givenArray);
		System.out.println(givenArray[0]);
	}
	
	public void usingCollections() {
		
	List<Integer> list=	Arrays.asList(givenArray);
	Collections.sort(list);
	int smallest=list.get(0);
	System.out.println(smallest);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	FindSmallestNumberInArray obj = new FindSmallestNumberInArray();
	//obj.findSmallest();
	//obj.usingArray();
	obj.usingCollections();
	}

}
