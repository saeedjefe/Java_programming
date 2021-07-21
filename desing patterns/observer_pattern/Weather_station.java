public class Weather_station{

	public static void main(String [] args){
	

	//all the data should be sent to the observers from here
	Weather_server weather_server = new Weather_server();
	Mobile_app mobile_app = new Mobile_app();
	

	weather_server.setChanges(10,90);
	weather_server.notifyObervers();	

	
	}

}
