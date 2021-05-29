package Latihan04;
public class Triangel extends Shape {
    //Private member variable
    private int base;
    private int height;
    //constructor
    public Triangel(String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height; 
    }
    @Override
    public String toString(){
        return"Triangle[base="+ base + ",height="+ height + "," + super.toString() + "]";
    }
    //override the inherited getArea()
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
}
