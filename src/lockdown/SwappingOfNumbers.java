package lockdown;

public class SwappingOfNumbers {
	//Without using third Variable
	void SwapNumbers(int num1,int num2) {
		
		num1=num1+num2;                //num1=30
		num2=num1-num2;                //num2=30-20=10
		num1=num1-num2;                //num1=30-10
	
		System.out.println("Value of variable num1 after Swapping is: "+num1);
		System.out.println("Value of variable num2 after Swapping is: "+num2);
	}	
	//Using third variable
	void SwapNumbers2(int num1,int num2) {
		
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Value of variable num1 after Swapping is: "+num1);
		System.out.println("Value of variable num2 after Swapping is: "+num2);
	}
	//Using third variable Method 2
	void SwapNumbers3(int num1,int num2) {
		int sum=0;
		
		sum=num1+num2;         //sum=10+20=30
		num1=sum-num1;         //num1=30-10=20
		num2=sum-num2;		   //num2=30-20=10
		
	}
	public static void main(String[] args) {
		SwappingOfNumbers swappingOfNumbers=new SwappingOfNumbers();
		int num1=10;
		int num2=20;
		swappingOfNumbers.SwapNumbers(num1,num2);
	}
}
