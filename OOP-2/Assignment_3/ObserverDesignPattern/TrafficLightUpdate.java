package ObserverDesignPattern;
// concrete observer
public class TrafficLightUpdate {
    
    public String color;

    public void update(String color){
        this.color=color;
        display();
    }
    public void display(){
        System.out.println("Traffic light is "+color);  
    }

}
