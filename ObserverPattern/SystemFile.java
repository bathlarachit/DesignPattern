package ObserverPattern;

import ObserverPattern.Observer.HumidityDisplayScreen;
import ObserverPattern.Observer.ObserverImpl;
import ObserverPattern.Observer.PressureDisplayScreen;
import ObserverPattern.Producer.Producer;
import ObserverPattern.Producer.ProducerImpl;

public class SystemFile {

    public static void main(String[] args) {
        ProducerImpl producer = new ProducerImpl();

        HumidityDisplayScreen humidityDisplayScreen = new HumidityDisplayScreen(producer);
        ObserverImpl observerImpl = new ObserverImpl(producer);
        PressureDisplayScreen pressureDisplayScreen = new PressureDisplayScreen(producer);
        
        producer.setHumidity(0);
        producer.setPressure(1);
        producer.setTemp(100);

    }
    
}