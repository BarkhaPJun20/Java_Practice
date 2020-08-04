package lockdown;

import java.util.Scanner;

public class BiggestNumInArray {
	
	void biggNum(int[]  num){
		int max=num[0];
		for (int j=0; j<num.length; j++){
			if (max<num[j])
				max=num[j];
		}
		System.out.println("Biggest number is:"+max);
		
	}
	public static void main(String[] args) {
		BiggestNumInArray big= new BiggestNumInArray();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please give length of Array");
		int length=scanner.nextInt();
		
		int[] array=new int[length];
		
		System.out.println("Please enter the number in Array:");
		for (int i=0; i<array.length;i++){
			array[i]=scanner.nextInt();
		}
		scanner.close();	
			big.biggNum(array);
		}
			
		
		
		
	}


