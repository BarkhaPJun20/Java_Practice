package lockdown;

public class ExceptionHandling_SumOfNumInStatement {
	void sumOfNumInStatement(String input) {
		String[] arr=input.split(" ");                    //["I","have","3","years","5","months","of","experience"]
		double sum=0;
		for (int index=0; index<arr.length; index++) {  
			try {
				sum+=Double.parseDouble(arr[index]);      //if "3"=>3 and add, if "have" then handled though exception(catch block)
			}catch(NumberFormatException nfe) {
				//blank catch							//"I", "have".......
			}
		}
		System.out.println("Sum of numbers in "+input+" is: "+sum);
	}	
	public static void main(String[] args) {
		String str="I have 3.5 years 5 months of experience";
		new ExceptionHandling_SumOfNumInStatement().sumOfNumInStatement(str);
	}
}		




