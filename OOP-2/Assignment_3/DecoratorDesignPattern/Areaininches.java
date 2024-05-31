package DecoratorDesignPattern;

public class Areaininches  implements Area{
    private Area rectangle;

    public Areaininches(Area rectangle){
        this.rectangle=rectangle;
    }

    @Override
    public double getarea(){
        return rectangle.getarea()*2.54;
    }
    
}
