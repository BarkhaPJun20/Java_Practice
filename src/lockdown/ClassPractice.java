package lockdown;

import java.util.Scanner;

public class ClassPractice {
	static int sum = 0;
	//int count = 0;

	void addition(int num) {
		//while (count < 3) {
			//if (num > 0) {
				sum = sum + num;
				//System.out.println("Addition of 3 positive nos is: "+sum);
				//break;
			//} else
				//System.out.println("Negative nos are not allowed");
		//	break;
		//}
			
			
	}	
	public static void main(String[] args) {
		ClassPractice c1 = new ClassPractice();
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while (count < 3) {
			System.out.println("Enter your no to add (only add positive nos):");
			int num = scanner.nextInt();
			if (num>0){
			c1.addition(num);
			count++;
			
			} else
				System.out.println("Negative nos are not allowed");
		}
		System.out.println("Addition of 3 positive nos is: "+sum);
			scanner.close();
			//System.out.println("Addition of 3 positive nos is: "+sum);
	}	
			
}	
	




