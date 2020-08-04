package lockdown;

import java.util.ArrayList;

public class ArrayListFunction_ReplaceWordInArrayList {

	void displayIndex(ArrayList<String> strArrayList, String opString) {
		System.out.println("Given ArrayList has "+opString+" on following indexes:-");
		for(int index=0; index < strArrayList.size(); index++) {
			if(strArrayList.get(index) == opString) {
				System.out.print(index+" ");
			}
		}
	}

	void replace(ArrayList<String> strArrayList, String opString, String replacementString) {
		int index = 0;
		while(strArrayList.contains(opString)) {
			index = strArrayList.indexOf(opString);
			strArrayList.set(index, replacementString);
		}
	}

	void displayOccurrenceCount(ArrayList<String> strArrayList, String replacementString) {
		int count = 0;
		for(int index=0; index < strArrayList.size(); index++) {
			if(strArrayList.get(index) == replacementString) {   //never use == to compare String...== compare reference value of String... 
																	//we have to compare String value(content). always use .equals().
				count++;
			}
		}
		System.out.println("\nArrayList contains "+replacementString+"--> "+count+" times");
	}

	public static void main(String[] args) {
		ArrayListFunction_ReplaceWordInArrayList replaceAndDisplay = new ArrayListFunction_ReplaceWordInArrayList();
		ArrayList<String> strArrayList = new ArrayList<String> () {
			{
				add("Maulik");
				add("Techno");
				add("Krishna");
				add("Techno");
				add("Credits");
				add("Techno");
			}
		};
		
		String opString = "Techno";
		String replacementString = "Credits";
		//Displaying indices of "Techno"
		replaceAndDisplay.displayIndex(strArrayList, opString);
		System.out.println("\n\nOriginal ArrayList is:-\n"+strArrayList.toString());
		//Replacing "Techno" with "Credits"
		replaceAndDisplay.replace(strArrayList, opString, replacementString);
		System.out.println("\nArrayList after replacing "+opString+" with "+replacementString+":-\n"+strArrayList.toString());
		//Displaying number of occurrences of "Credits"
		replaceAndDisplay.displayOccurrenceCount(strArrayList, replacementString);
	}
}
