package hotelIntro;

public class Main {

	public static void main(String[] args) {
		
		Hotel hotel1 = new Hotel(123,"Ramada Hotel",200,150);
		Hotel hotel2 = new Hotel(234,"Alba Queen Hotel",150,100);
		Hotel hotel3 = new Hotel(345,"La Blanche Hotel",500,250);
		Hotel hotel4 = new Hotel(456,"Flora Hotel",250,200);
		
		City city1 = new City(1,"Antalya");
		City city2 = new City(2,"Muðla");
		City city3 = new City(3,"Aydýn");
		
		System.out.println("Þehirler");
		System.out.println("--------------------------");
		City[] cities= {city1,city2,city3};
		for (City city : cities) {
			System.out.print(city.cityName+"/");
		}
		System.out.print("\n");
		System.out.println("--------------------------");
		
		
		System.out.println("Otellerimiz");
		
		System.out.println("--------------------------");
		Hotel[] hotels= {hotel1,hotel2,hotel3,hotel4};
		for (Hotel hotel : hotels) {
			System.out.println(hotel.hotelName);
		}
		System.out.println("--------------------------");
		
		HotelManager hotelManager = new HotelManager();
		
		hotelManager.reservation(hotel1);
		
		hotelManager.reservationDelete(hotel1);
		
	}
		

}
