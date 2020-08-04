package lockdown;

import java.util.Scanner;

public class LongestName {
	//int longestlength;
	//String longestName;
	void longName(String[]  name){
		int s= name[0].length();
		for (int j=1; j<name.length; j++){
			if(name[j].length()>s){ //length equal hone p andr hi nhi jaega isliy kuch b print nhi
				int longestlength=name[j].length();
				String longestName=name[j];
				System.out.println("Longest Name in Array is "+longestName+" with character "+longestlength+" in it");
		}
		}
	}		
	void findchar(String[] namearray, char findch){
		for(int i=0; i<namearray.length; i++){
			String s=namearray[i];
			int count=0;
			for(int j=0; j<s.length(); j++){
				if(s.charAt(j)==findch)
					count++;
			}
				System.out.println("Number of char "+findch+" in "+s+" is "+count);
			}
	}			
	public static void main(String[] args) {
		LongestName lname=new LongestName();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Plesae enter length of array:");
		int length=scanner.nextInt();
		
		String[] input=new String[length];
		
		System.out.println("Please enter names in array:");
		for (int i=0; i<input.length; i++){
			input[i]=scanner.next();
		}
		System.out.println("Please let us know which character you want to count in names of array");	
		char ch=scanner.next().charAt(0);
		
		scanner.close();
		lname.longName(input);
		lname.findchar(input, ch);
	}
}
		
			
	
	
	
		
		
	
	

