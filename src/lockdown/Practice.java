package lockdown;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// Practice pr=new Practice();
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while (count < 3) {
			System.out.println("Enter no");
			int num = scanner.nextInt();
			if (num > 0) {
				sum = sum + num;
				count++;
			} else
				System.out.println("Invalid Nos.");
		}

		System.out.println("Sum is " + sum);
		scanner.close();
	}
}
