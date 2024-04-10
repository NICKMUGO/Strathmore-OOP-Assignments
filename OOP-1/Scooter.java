public class Scooter extends Motorcycle{
    private int wheels;
    public static int  totalScooters = 0; //Static variable to keep track of the number of scooter objects created.
    
    
    public Scooter (String name, float price, int wheels) {
    super (name, price) ;
    this. wheels = wheels;
    
    }
    
    public void showAttributes ()
    {
    
    System.out.println ("Wheels: "+wheels);
    
    }
    @Override
    public void showDetails(){
        System.out.println ("Wheels: "+wheels);
        System.out.println("Name: " + getName());  // Using getMake() from the superclass
        System.out.println("Price: " + getPrice()); 
    }

    
    }