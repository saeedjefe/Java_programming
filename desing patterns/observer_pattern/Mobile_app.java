public class Mobile_app implements Observer{
    
	private int temp;
	private int humidity;	

  Weather_server  wheather_server;	
  public Mobile_app(){
	weather_server.registerObserver(this);
  }
	
void update(int temp, int humidity){
	this.temp = temp;
	this.humidity = humidity;
}
	

}
