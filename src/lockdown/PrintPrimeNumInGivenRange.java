package lockdown;

public class PrintPrimeNumInGivenRange {
	void printPrimeNum(int fromNum, int toNum) {
		System.out.println("Prime numbers in the range " + fromNum + " to "
				+ toNum + " is: ");

		for (int index = fromNum; index <= toNum; index++) { // index is nothing
																// but a number
			boolean flag = true;
			for (int innerIndex = 2; innerIndex <= index / 2; innerIndex++) {
				if (index % innerIndex == 0) {
					flag = false;
					break;
				}
			}

			if (flag == true) {

				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		PrintPrimeNumInGivenRange primeNum = new PrintPrimeNumInGivenRange();
		primeNum.printPrimeNum(1, 100);
	}
}
