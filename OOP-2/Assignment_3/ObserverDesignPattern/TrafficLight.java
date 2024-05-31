package ObserverDesignPattern;
//Subject
public interface TrafficLight {
    // Methods
    void registerObserver(TrafficLightObserver trafficLight);
    void removeObserver(TrafficLightObserver trafficLight);
    void notifyObservers();
}
