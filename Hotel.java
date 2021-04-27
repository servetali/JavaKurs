package hotelIntro;

public class Hotel {

	int hotelId;
	String hotelName;
	int numberOfRooms;
	int emptyRooms;
	
	public Hotel(int hotelId,String hotelName,int numberOfRooms,int emptyRooms){
		
		this.hotelId=hotelId;
		this.hotelName=hotelName;
		this.numberOfRooms=numberOfRooms;
		this.emptyRooms=emptyRooms;
	}
}
