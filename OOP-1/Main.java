public class Main {
    public static void main(String[] args) {
       Motorcycle cycke1 =new Motorcycle("Nissan", 6000);
       cycke1.showDetails();
       Scooter scoote1= new Scooter("Honda",500,2);
       scoote1.showDetails();
       
       System.out.println("\nTesting the equals() method:");
    }
}