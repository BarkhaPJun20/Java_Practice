package lockdown;

public class PalindromeString {
	
	void verifyIsStringPalindrome(String name){
		boolean flag=true;
		for (int index=0; index<name.length()/2; index++){
			if (name.charAt(index)!=name.charAt(name.length()-(index+1))){
				System.out.println("Provided String is not Palindrome");
				flag=false;
				return;
			}
		}
		if (flag==true)
			System.out.println("Provided String is a Palindrome");
		
	}
	public static void main(String[] args) {
		PalindromeString palindromeString=new PalindromeString();
		palindromeString.verifyIsStringPalindrome("radar");  //odd length string:first r to last r, then a to a..not need to compare d as it is in middle....reverse me b middle p hi aaega isliye index only 0 and 1.
		palindromeString.verifyIsStringPalindrome("abba"); //even length string:first a to last a and b to b comparison...hence index 0 and 1. 
	}

}
