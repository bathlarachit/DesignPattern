package ObserverPattern.Producer;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Observer.Observer;

public class ProducerImpl implements Producer{

    private List<Observer> list; 

    private int temp;
    private int pressure; 
    private int humidity;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
        notifyObserver();
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyObserver();
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyObserver();
    }

    public ProducerImpl(){
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObsever(Observer observer) {
       if(list.contains(observer)){
        list.remove(observer);
       }
    }

    @Override
    public void notifyObserver() {
     for(int i=0;i<list.size();i++){
        list.get(i).update(temp,pressure,humidity);
     }
    }
    
}
