package ObserverPattern.Observer;

import ObserverPattern.Producer.Producer;

public class HumidityDisplayScreen implements Observer,Display{

    private int temp,pressure,humidity;
        private Producer producer ;

    @Override
    public void display() {
       System.out.println(String.format("New Humidity is %d",humidity));
    }

    @Override
    public void update(int temp, int pressure, int humidity) {
       this.temp = temp;
       this.pressure = pressure;
       this.humidity = humidity;
       display();
    }

    public HumidityDisplayScreen(Producer producer){
        this.producer =producer;
        this.producer.registerObserver(this);
    }
    
}
