package latihan01;
    public class AeroPlan extends Vehicle {
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }
    @Override
    public void fuel(){
        System.out.println("Fuels");
    }
    public static void main (String []args){
        AeroPlan garuda = new AeroPlan();
        garuda.fungtion();
        garuda.fuel();
        garuda.walk();
    }
    
}

