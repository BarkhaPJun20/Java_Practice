package lockdown;

public class FindSecondLargestNumInArray {
	
	void printSecondLargestNum1(int[] num){     //most preferable
		int largest=num[0];
		int secondLargest=num[0];
		for (int index=0; index<num.length; index++){
			if (num[index]>largest){
				secondLargest=largest;
				largest=num[index];
				
			}
			else if((num[index]>secondLargest)&&secondLargest!=largest){
					secondLargest=num[index];
			}
		}
		System.out.println(secondLargest);
	}
	void printSecondLargestNum2(int[] num){   // by sorting array in descending order
		int temp=0;
		for (int index=0; index<num.length; index++){
			for (int innerIndex=index+1; innerIndex<num.length; innerIndex++){
				if (num[index]<num[innerIndex]){  // if ">" kr de to print in ascending order
					temp=num[index];
					num[index]=num[innerIndex];
					num[innerIndex]=temp;
					
				}
			}
			System.out.println(num[index]);    //{99,56,43,33,21,10}
			
		}
		System.out.println("Second Largest Number in array is "+num[1]);
		
	}
		
	
	public static void main(String[] args) {
		FindSecondLargestNumInArray findSecondLargestNumInArray=new FindSecondLargestNumInArray();
		int[] num={10,33,56,43,99,21};
		findSecondLargestNumInArray.printSecondLargestNum1(num);
		
		
		
	}

}
