public class Weather_server implements Subject{
	
Arraylist observers;
int tmp;
int humidity;
public Weather_server(){
	
	observers = new ArrayList();
	}
	
void registerObserver(Observer observer){
observers.add(observer);
}

void removeObserver(Oserver observer){
int index = observers.indexOf()
observers.remove(index);
}


void notifyObservers(){
for(int i = 0; i <= observers.size(); i++){
    Observer observer = (Observer)observers.get(i);
    observer.update(temp, humidity);
}
}

void incapsulation(){
notifyObservers();
}

}

public void setChanges(int temp, int humidity){
   this.temp = temp;
   this.humidity = humidity;

}

public int 


}




