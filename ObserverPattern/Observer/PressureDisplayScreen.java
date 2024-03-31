package ObserverPattern.Observer;

import ObserverPattern.Producer.Producer;

public class PressureDisplayScreen implements Observer,Display{

    private int temp, pressure, humidity;
    private Producer producer ;

    @Override
    public void display() {
       System.out.println(String.format("New Pressure is %d",pressure ));
    }

    public PressureDisplayScreen(Producer producer){
        this.producer = producer;
        this.producer.registerObserver(this);
    }

    @Override
    public void update(int temp,int pressure,int humidity) {
       this.pressure = pressure;
       this.humidity =humidity;
       this.temp = temp;
       display();
    }
}
