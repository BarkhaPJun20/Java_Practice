package lockdown;

public class FibbonacciSeries {
	//to print Fibbonacci Series start by 1
	void fibbonacciNumbers(int order) {
		int num1=0;
		int num2=1;
		int sum;
		System.out.println("Fibbonacci Series of order "+order +" is: ");
		for (int numCount=0; numCount<order; numCount++) {
			sum=num1+num2;                   //0+1  sum=1
			num1=num2;                       //num1=1
			num2=sum;						 //num2=1
			System.out.print(num1+" ");
		}
	}
	//to print Fibbonacci Series start by 0
	void printFibonacciNumber(int order) { 
		int num1 = 0, num2=1;
		int sum =num1+num2; //1 
		for(int index=1; index<order; index++) {
			if(index ==1)
				System.out.print(num1 +" ");      //0
			System.out.print(sum+" ");           // 0 1 1 2 3
			sum = num1 + num2;                   // 3
			num1= num2;                          // 1
		    num2 =sum;                           //2
		}
	}

	public static void main(String[] args) {
		FibbonacciSeries fibbonacciSeries=new FibbonacciSeries();
		int order=5;
		fibbonacciSeries.fibbonacciNumbers(order);
		System.out.println();
		fibbonacciSeries.printFibonacciNumber(order);
		
	}
}
