package lockdown;

public class CountDigitsLettersUpperLowerSpecial_IMP {
	
	void countDigitsLettersUpperLowerSpecialInString(String name) {
		int countDigit=0; 
		int countLetters=0;
		int countUpperCase=0;
		int countLowerCase=0;
		int countSpecialChar=0;
		for(int index=0; index<name.length(); index++) {
			char ch=name.charAt(index);
			
			if (Character.isDigit(ch))
				countDigit++;
			if(Character.isLetter(ch))
				countLetters++;
			if (Character.isUpperCase(ch))
				countUpperCase++;
			if (Character.isLowerCase(ch))
				countLowerCase++;
			else
				countSpecialChar++;		
		}
		System.out.println("Number of DIGITS in Predefined String "+name +" are: "+countDigit);
		System.out.println("Number of LETTERS in Predefined String "+name +" are: "+countLetters);
		System.out.println("Number of UPPER CASE LETTERS in Predefined String "+name +" are: "+countUpperCase);
		System.out.println("Number of LOWER CASE LETTERS in Predefined String "+name +" are: "+countLowerCase);
		System.out.println("Number of SPECIAL CHARACTERS in Predefined String "+name +" are: "+countSpecialChar);
		
			
			
	}
	
	void countSpecialCharInString(String name) {
	}
	public static void main(String[] args) {
		CountDigitsLettersUpperLowerSpecial_IMP count=new  CountDigitsLettersUpperLowerSpecial_IMP();
	String name="1rRpd3F9#K(E";	
	
	count.countDigitsLettersUpperLowerSpecialInString(name);
	
}
}
	
	