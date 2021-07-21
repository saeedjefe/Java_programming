public class Api implements Subject {

Arraylist observers;
int tmp;
int humidty;

public Api(){
observers = Arraylist();
}

public void registerObserver(Observer o){
observers.add(o);

}

public void removeObserver(Observer o)[
int index = observers.indexOf(o);
observers.remove(index);

}

public void notifyObservers(){
//itertate over observers
for(int i = 0; i<observers.size() ; i++){
Observer observer = (Observer)observers.get(i);
observer.update(temp, humidity);
}
}

void setMeasurements(){
	notifyObservers();
}

void setGhanges(int tmp, int humidty){
this.temp = temp;
this.humidity = humidity;
setMeasurements();
}


}
