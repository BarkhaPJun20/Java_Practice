package lockdown;

import java.util.Scanner;

public class LongestName_1 {
	
	String longName;
	
	void getMaxLengthOfString (String[] array) {
	
		int maxNameLength=array[0].length();
		for (int index=0; index<array.length; index++) {
			if (array[index].length()>maxNameLength) {
				maxNameLength=array[index].length();
				longName=array[index];
			}
		}
		if (longName==null)  //this is similar with FindNumInArray program
			System.out.println("Names are of same length");	//muze isse br br print nhi krna isliye loop (for) k bahr	
		else {
			System.out.println("Longest Name enter is: "+longName);//to print once , loop k bahr
				
			System.out.println("Length of Longest Name enter is: "+maxNameLength);//to print once , loop k bahr
		}	
	}	
	public static void main(String[] args) {
		LongestName_1 maxlength=new LongestName_1();
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Plaese let us know how many names you want to enter to check total numbers of letters: ");
		int size= scanner.nextInt();
		String[] array= new String [size];
		for (int index=0; index<size; index++) {
			System.out.print("Hey! enter " +(index+1) +" name in order to check which have max nos.of letters:");
		array[index]=scanner.next();
		}	
		scanner.close();
		maxlength.getMaxLengthOfString(array);
	}
}	
		
		
		
		
	
	
