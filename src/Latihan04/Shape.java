package Latihan04;
public class Shape {
    //private member variable
    private String color;
    //Constructor
    public Shape (String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "Shape[color=" + color + "]";
    }
    //Ali shape must have a method called getArea().
    public double getArea(){
        // we need to return some value to compile the program.
        System.out.println("Shape unknown! cannot compute area!");
        return 0;
    }
}
