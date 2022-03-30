package interviewPrograms;

public class ReverseTheWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given = "Learn Automation Online";
		String reversed="";
		String[] temp=given.split(" ");
		System.out.println(temp.length);
		System.out.println(temp[2]);
		System.out.println(temp[1]);
		System.out.println(temp[0]);
		
		for(int i=temp.length-1;i>=0;i--) {
			reversed=reversed+temp[i]+" ";
			
		}
		System.out.println(reversed);
	}

}
