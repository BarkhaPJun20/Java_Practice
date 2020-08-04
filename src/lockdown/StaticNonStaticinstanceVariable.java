package lockdown;

public class StaticNonStaticinstanceVariable {
	
	int sum=5;
	static int add=10;
	
	void m1(){
		int num=5;
		sum=sum+num; //10
		add=add+num;  //15
		
		System.out.println("m1() Sum is : "+sum);
		System.out.println("m1() Add is : "+add);
	}
	void m2(){	
		int num=7;
		sum=sum+num;  //17
		add=add+num;  //22
		
		System.out.println("m2() Sum is : "+sum);
		System.out.println("m2() Add is : "+add);
	}
	public static void main(String[] args) {
		StaticNonStaticinstanceVariable staticNonStatic=new StaticNonStaticinstanceVariable();
		staticNonStatic.m1();
		staticNonStatic.m2();
	}

}
