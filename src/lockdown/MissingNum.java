package lockdown;

public class MissingNum {

	// Searching for missing no in the range
	void checkMissingNo(int arr[]) {
		for (int index = 1; index <= 10; index++) {
			boolean flag = false;
			for (int index1 = 0; index1 < arr.length; index1++) {
				if (index == arr[index1])
					flag = true;
			}
			if (flag == false) {
				System.out.println(index + " is missing");
			}
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 2, 1, 3, 5,4 , 7, 8, 9, 10 };
		MissingNum missingNoArray = new MissingNum();
		missingNoArray.checkMissingNo(arr1);
	}
}