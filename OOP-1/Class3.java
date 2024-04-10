import java.util.*;

public class Class3 {
    public static void main(String args []) {
        Scanner input = new Scanner (System.in) ;
        int x;
        try{
        x = input.nextInt ();
        System.out.println ("You entered: "+x) ;
        }catch (InputMismatchException e) {
        System.out.println ("Please enter an integer") ;
        }finally{
        System.out.println ("Thank you") ;
        }   
    }
    
    }