package lockdown;

import java.util.Scanner;

public class ClassPractice1 {  //Will not work because we need to give multiple input for addition(negative and positive)
	int sum = 0;		//3 positive nos. need fpr addition.
	

	void addition(int num) {
		int count = 0;
		while (count < 3) {
			if (num > 0) {
				sum = sum + num;
				count++;
				//System.out.println("Addition of 3 positive nos is: "+sum);
				//break;
			} else
				System.out.println("Negative nos are not allowed");
		break;
		}
		System.out.println("Addition of 3 positive nos is: "+sum);	
			
	}	
	public static void main(String[] args) {
		ClassPractice1 c1 = new ClassPractice1();
		Scanner scanner = new Scanner(System.in);
		//int count = 0;
		//while (count < 3) {
			System.out.println("Enter your no to add (only add positive nos):");
			int num = scanner.nextInt();  //but by this only one no we can give.( this is not as aaray we consider here only one-one num)
			//if (num>0){
			c1.addition(num);  //but we can solve it by array concept here
			//count++;
			
			//} else
			//	System.out.println("Negative nos are not allowed");
		//}
		//System.out.println("Addition of 3 positive nos is: "+sum);
			scanner.close();
			//System.out.println("Addition of 3 positive nos is: "+sum);
	}	
			
}	
	





