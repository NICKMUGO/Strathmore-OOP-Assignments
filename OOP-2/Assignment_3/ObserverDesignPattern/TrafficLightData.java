package ObserverDesignPattern;
import java.util.*;

public class TrafficLightData implements TrafficLight {
    private String color;

    public List<TrafficLightObserver> trafficLights = new ArrayList<>();

    public void setTrafficLight(String color) {
        this.color = color;
        notifyObservers();
    }

    public void registerObserver(TrafficLightObserver trafficlight) {
        trafficLights.add(trafficlight);
    }

    public void removeObserver(TrafficLightObserver trafficLight) {
        trafficLights.remove(trafficLight);
    }

    public void notifyObservers() {
        for (TrafficLightObserver trafficLight : trafficLights) {
            trafficLight.update(color);
        }
    }

    public static void main(String[] args) {
        TrafficLightObserver trafficLight = new TrafficLightObserver() {
            @Override
            public void update(String color) {
                System.out.println("Traffic light color is " + color);
            }
        };
        TrafficLightData oneLight = new TrafficLightData();
        TrafficLightUpdate update = new TrafficLightUpdate();

        oneLight.registerObserver(trafficLight);
        oneLight.setTrafficLight("red");
        update.display();
    }
}
