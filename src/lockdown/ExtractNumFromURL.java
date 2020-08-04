package lockdown;

public class ExtractNumFromURL {
	
	
		String output="";
		
		void displayItemId(String URL) {
			if (URL.contains("itemId=")){
				String str = URL.split("itemId=")[1];     // 12345/
				String output="";
				for (int index=0; index<str.length(); index++){
					if (Character.isDigit(str.charAt(index))){
						output+=str.charAt(index);
					}else
						break;
				}
				System.out.println("itemId is=> "+output);
				
			}else
				System.out.println("No itemId present");
		}
		public static void main(String[] args) {
			//String input = "https://www.facebook.com/technocredits/itemId=12345/";
			String input ="https://www.facebook.com/technocredits/empid=123&itemId=12345/";
			//String input ="https://www.facebook.com/technocredits/itemId=12345&empid=123/";
			//String input ="https://www.facebook.com/technocredits/empid=123/";
			new ExtractNumFromURL().displayItemId(input);
		}
	}			


