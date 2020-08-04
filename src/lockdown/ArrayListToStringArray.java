package lockdown;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToStringArray {
	void arrayListToStringArrayWithoutPredefinedMethods(ArrayList<String>  al){
		String[] arr=new String [al.size()];
		for (int i=0; i<al.size(); i++){
			arr[i]=al.get(i);
	}
		System.out.println("This is ArrayList to String Array--> "+Arrays.toString(arr));
	}	
	void stringArrayToArrayListWithoutPredefinedMethods(String[] array){
		ArrayList<String>  al=new ArrayList<String>();
		for (int i=0; i<array.length; i++){
			al.add(array[i]);
		}
		System.out.println("This is to String Array to ArrayList--> "+al);
	}
	
	public static void main(String[] args) {
		ArrayListToStringArray arrayListToStringArray=new ArrayListToStringArray();
		
		ArrayList<String>  al=new ArrayList<String>();
		al.add("Barkha");
		al.add("Megha");
		al.add("Piyush");
		arrayListToStringArray.arrayListToStringArrayWithoutPredefinedMethods(al);
		
		String[] arr1= {"Barkha","Tarun","Piyush"};
		
		arrayListToStringArray.stringArrayToArrayListWithoutPredefinedMethods(arr1);
		
	}

}
	
