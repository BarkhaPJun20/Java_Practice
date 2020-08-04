package lockdown;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection {
	
	public static void main(String[] args) {
		/*ArrayList <String> al=new ArrayList<String>();
		al.add("Harsh");
		al.add("Techno");
		for (String temp: al){
			if (temp.length()>3){
				al.remove(temp);  
			}	
		}	
		System.out.println(al);   //Techno will print because first tym it will check Harsh and will remove..to second index ka Techno ab first index p chala jaega... but loop b iterate hogi... index 2 me usse koi element nhi milega to outof loop me print
	*/
		
		//if we want to show (M, B ) and (B,M) as equal
		ArrayList<String> al1=new ArrayList<String>(Arrays.asList("M", "B", "L"));
		ArrayList<String> al2=new ArrayList<String>(Arrays.asList("B", "M"));
		//System.out.println(al1.containsAll(al2)&& al2.containsAll(al1));   //will work correctly
		System.out.println(al1.containsAll(al2));
		//Collections.sort(al1);   // B  L  M
		//Collections.sort(al2);   // B  M
		//System.out.println(al1.equals(al2));
		
	}


}
