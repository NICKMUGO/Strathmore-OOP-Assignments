public class Rectangle extends Quadrilateral{

    public Rectangle(int a,int b){
        super(a,b);
    }

    public float getArea(){
        return (a*b);
    }

    public float getPerimeter(){
        return(2*(a+b));
}
}