package DecoratorDesignPattern;

public class Areaincm implements Area{
    
    private Area rectangle;

    public Areaincm (Area rectangle){
        this.rectangle = rectangle;  
    }

    
    public double getarea(){
        return rectangle.getarea();
    }
}
