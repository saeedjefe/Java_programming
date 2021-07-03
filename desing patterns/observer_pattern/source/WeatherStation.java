public class WeatherStation{

public static void main(String[] args){
	
	Api api = new Api();
	App app = new App(api);
	
	api.setChanges(33,1);

	app.display();



}

}
