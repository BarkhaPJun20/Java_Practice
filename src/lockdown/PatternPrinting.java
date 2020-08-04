package lockdown;

public class PatternPrinting {
	
	void patternPrinting(){
		for (int i=0; i<=4; i++){      //i for rows
			for (int j=0; j<=i;j++){   //j for columns
				System.out.print("$ " );
			}
			System.out.println();
		}
	}
	void patternPrinting1(){
		for (int i=0; i<=4; i++){
			for (int j=4; j>=i;j--){
				System.out.print("$ " );
			}
			System.out.println();
		}
	}	
	void patternPrinting2(){
		for (int i=1; i<=3; i++){
			for (int j=3;j>=i; j--){
				System.out.print("* " );
				
			}
			System.out.println(i);
		}
		
		
	}
			
	
	
	public static void main(String[] args) {
		PatternPrinting patternPrinting=new PatternPrinting();
		patternPrinting.patternPrinting();
		System.out.println("===============================");
		patternPrinting.patternPrinting1();
		System.out.println("===============================");
		patternPrinting.patternPrinting2();
	}

}
