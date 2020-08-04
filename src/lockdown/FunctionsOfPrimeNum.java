package lockdown;

public class FunctionsOfPrimeNum {
	int sum=0;
	int count=0;
	
	void primeOrNot(int num) {
		boolean flag=true;    
		for (int index=2; index<=num/2; index++) {
			if (num%index==0) {  //num=15...first 15%2!=0 then index++ i.e.,3...15/3 =>if k andr and then break and flag false.
				flag=false;  // if flag false then not Prime Num
				break;
			}	
		}	
		if (flag==true)
			System.out.println("Number "+num+" is Prime Number.");
		else
			System.out.println("Number "+num+" is Not Prime Number.");
	}
	void printCountOfPrimeNum(int from, int to) {
		int count=0;
		for (int number=2; number<=100; number++) 
			primeOrNot(number);
		   count++;
		System.out.println("Total Prime Num in range are:"+count);
			
	}		
			
	
	public static void main(String[] args) {
		FunctionsOfPrimeNum functionsOfPrimeNum=new FunctionsOfPrimeNum();
		
		functionsOfPrimeNum.printCountOfPrimeNum(2,100);
		
	}
}
	
			
	
	
		
	
			
			
			
		
		
	
	
	
