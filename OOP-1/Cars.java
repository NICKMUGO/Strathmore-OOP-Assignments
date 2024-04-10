public class Cars {
    private String engine;
    // constructor method(function within a class)
    public Cars(String  engine) {
        this.engine = engine;
    }

    public  void printEngine() {
        System.out.println("This car has an " + engine + " engine.");   
    }
    // runs the application
    public static void main(String args[]){
        Cars LandCruiser = new Cars("V8");
        Cars Mustang = new Cars("V6");

        LandCruiser.printEngine();
        Mustang.printEngine();
    }

}
