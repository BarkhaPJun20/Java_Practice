package lockdown;

import java.util.Scanner;

public class AllCharFreqInArray {
	void printFreqOfChar(String[] array) {
		
			for(int index=0; index<array.length; index++) {
				String input=array[index];
				
			
				for (int j=0; j<input.length(); j++){
					char ch=input.charAt(j);
					int count=0;
				for (int i=0; i<input.length(); i++) {
					if(input.charAt(i)==ch)
						count++;
					}
				System.out.println("Total number of "+ch+" in name "+input+" is "+count);
				}
			}
		}			
		public static void main(String[] args) {
			AllCharFreqInArray  freqofchar=new AllCharFreqInArray ();
			Scanner scanner=new Scanner(System.in);
			
			System.out.print("Please tell now many names you want to enter:");
			int size=scanner.nextInt();
			String[] num=new String[size];
			
			for(int index=0;index<size;index++) {
				System.out.print("PLease enter name "+(index+1)+" to find char in it:");
				num[index]=scanner.next();
			}
			//System.out.print("Please any letter you want to count in given name:");
			//char ch=scanner.next().charAt(0);
			
			freqofchar.printFreqOfChar(num);
			
			scanner.close();
				
		}

	}		

	
	
	
		
		
				
				
			
				
			
			
		
		
		
		
		

