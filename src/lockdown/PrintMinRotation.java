/*Print minimum rotation required to compare both strings equality
Example 1  : 
String input1 = "abcdef";
String input2 = "defabc";
output : 3

Example 2  : 
String input1 = "adbcdef"; -> push right
fadbcde
efadbcd
defadbcgit add 
String input2 = "defadbc";
output : 3 */

package lockdown;

public class PrintMinRotation {
	int count = 0;

	void printRotation(String name1, String name2) {
		while (!name1.equals(name2)&& count<name1.length() ) {   //but this will work in only positive scenario means where String becomes equal   
			name1 = name1.charAt(name1.length() - 1) + name1.substring(0, name1.length() - 1);
			count++;
		}
		System.out.println("Tatal Rotation required to equate both String are: " + count);
	}
	public static void main(String[] args) {
		PrintMinRotation printMinRotation = new PrintMinRotation();
		String input1 = "abcdef";
		String input2 = "defabc";  
		printMinRotation.printRotation(input1, input2);
	}
}
