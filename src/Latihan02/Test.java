package Latihan02;
public class Test {

    public static void main(String[] args){
        Line Han = new Line(1, 1, 1, 1);
        Line Far = new Line(1, 1, 1, 1);
       
        System.out.println("Panjang garis Han : "+Han.getLength());
        System.out.println("Panjang garis Far : "+Far.getLength());
        
        if(Han.isGreater(Han, Far)){
            System.out.println("garis Han lebih panjang dari Far");
        }else if(Han.isLess(Han, Far)){
            System.out.println("garsi Han lebih pendek dari Far");
        }else if(Han.isEqual(Han, Far)){    
            System.out.println("garis Han sama panjang dengan Far");
    }
}
}
