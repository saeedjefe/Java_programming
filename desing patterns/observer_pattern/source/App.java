public class App implements Observer {
	
	int temp;
	int humidty;

	public App(Api api){
	api.registerObserver(this);

	}

	void update(int temp, int humidity){
	this.temp = temp;
	this.humidty = humidity;
	}
	
	void display(){
	System.out.printf("this is the current temperature : %d\t this is the current humidity : %d\t",temp, humidty);
	}

}
