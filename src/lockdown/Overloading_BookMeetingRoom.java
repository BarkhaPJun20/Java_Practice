package lockdown;

public class Overloading_BookMeetingRoom {
	String room1="Nalanda";
	static double time1=0.0;
	String room2="Takshashila";
	static double time2=0.0;
	String room3="AgraFort";
	static double time3=0.0;
	String room4="PratapGadh";
	static double time4=0.0;
	
	void bookMeetingRoom(){           //this is for Nalanda...so when book booking time will increase by 1 hr
		time1++;
	}
	void bookMeetingRoom(String room){     //book a meeting room other than "Nalanda" for default timing would be 1 hr.
		if (room.equalsIgnoreCase(room2))
			time2++;
		else if (room.equalsIgnoreCase(room3))
			time3++;
		else if (room.equalsIgnoreCase(room4))
			time4++;
		else 
			System.out.println("Enter Valid Room: you have entered "+room1);
	}
	void bookMeetingRoom(String room, double time){  //book room with time
		if (room.equalsIgnoreCase(room1))
			time1=time1+time;
		else if (room.equalsIgnoreCase(room2))
			time2=time2+time;
		else if (room.equalsIgnoreCase(room3))
			time3=time3+time;
		else if (room.equalsIgnoreCase(room4))
			time4=time4+time;
		else 
			System.out.println("Enter Valid Room");
	}
	void displayBookingInfo(){
		if (time1>0){
			System.out.println("Congratulations! "+room1+ " is booked for "+time1+" hrs.");
		}
		if (time2>0){
			System.out.println("Congratulations! "+room2+ " is booked for "+time2+" hrs.");
		}	
	
		if (time3>0){
			System.out.println("Congratulations! "+room3+ " is booked for "+time3+" hrs.");
			
		}
		if (time4>0){
			System.out.println("Congratulations! "+room4+ " is booked for "+time4+" hrs.");
		}
	}

	void availableRooms(){    //time=0 means never booked
		if (time1==0){
			System.out.println("Hey! "+room1+ " is available for booking.");
		}
		if (time2==0){
			System.out.println("Hey! "+room2+ " is available for booking.");
		}	
	
		if (time3==0){
			System.out.println("Hey! "+room3+ " is available for booking.");
			
		}
		if (time4==0){
			System.out.println("Hey! "+room4+ " is available for booking.");
		}
	}
	public static void main(String[] args) {
		Overloading_BookMeetingRoom bookMeetingRoom=new  Overloading_BookMeetingRoom();
		bookMeetingRoom.bookMeetingRoom();
		bookMeetingRoom.bookMeetingRoom("Nalanda");
		bookMeetingRoom.bookMeetingRoom("Nalanda",5.45);
		bookMeetingRoom.displayBookingInfo();
		bookMeetingRoom.availableRooms();
	}
	
		
	


}