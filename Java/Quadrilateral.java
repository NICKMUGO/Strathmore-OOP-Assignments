public abstract class Quadrilateral {
    protected int a;
    protected int b;

    public Quadrilateral(int a,int b){
        this.a=a;
        this.b=b;
    }

    public abstract float getArea();
    public abstract float getPerimeter();

}
