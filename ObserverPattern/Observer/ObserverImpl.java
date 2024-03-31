package ObserverPattern.Observer;

import ObserverPattern.Producer.Producer;

public class ObserverImpl implements Observer,Display{

    private Producer producer; 
    private int temp,pressure,humidity;

    @Override
    public void update(int temp,int pressure,int humidity) {
       this.temp = temp;
       this.humidity=humidity;
       this.pressure =pressure;
       display();
    }

    public ObserverImpl(Producer producer){
        this.producer = producer;
        this.producer.registerObserver(this);
    }

    @Override
    public void display() {
       System.out.println(String.format("New temperature is %d",temp));
    }
}
