package DecoratorDesignPattern;


//concrete implementation

public class Rectangle implements Area{

    int length;
    int width;

    public Rectangle(int length,int width){
        this.length= length;
        this.width = width;

    }

    public double getarea(){
        return length*width;
    }


    
}