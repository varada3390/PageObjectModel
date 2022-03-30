package interviewPrograms;

import java.util.LinkedList;

public class LinkedListExample {

	public void linkedListOperations() {
	LinkedList< Integer> linkedList = new LinkedList<Integer>();
	
	linkedList.add(2);
	linkedList.add(3);
	linkedList.add(4);
	System.out.println(linkedList);
	
	
	linkedList.addFirst(1);
	linkedList.addLast(5);
	System.out.println(linkedList);
	
	System.out.println("First Value : " +linkedList.getFirst());
	System.out.println("Last Value : "+linkedList.getLast());
	
	System.out.println("Third Value : "+linkedList.get(3));
	
	for(int index=0;index<linkedList.size();index++) {
		
		System.out.println("elements in linked list are : "+linkedList.get(index));
	}
	
	for (Integer intObj : linkedList) {
		System.out.println("elements in linked list are : "+linkedList.get(intObj-1));
	}
	
	}
		public void iteratorUsingForEachLop( ) {
			LinkedList<String> linkedList = new LinkedList<String>();
			linkedList.add("Camel");
			linkedList.add("Ant");
			linkedList.add("Lion");
			linkedList.add("Tiger");
			linkedList.add("1");
			
			for (String string : linkedList) {
				System.out.println("Linked List are : "+string);
			
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListExample obj = new LinkedListExample();
		//obj.linkedListOperations();
		obj.iteratorUsingForEachLop();
	}

}
