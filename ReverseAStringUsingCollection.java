package interviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseAStringUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given = "School";
		char[] array = given.toCharArray();

		List<Character> list = new ArrayList<Character>();

		for (Character character : array) {
			list.add(character);

		}

		Collections.reverse(list);
		ListIterator iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}

	}
}