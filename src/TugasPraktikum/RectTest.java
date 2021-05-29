package TugasPraktikum;
public class RectTest {
    
    public static void main(String[] args){
        Rect Persegi1 = new Rect(2, 2, 4, 4);
        Rect Persegi2 = new Rect(1, 1, 3, 3);
        
        //objek union dan intersection
        Rect intersection = Persegi2.intersection(Persegi1);
        Rect union = Persegi1.union(Persegi1);
        
        //variable untuk memformat string, agar mudah
        String koordinatPersegi1 = String.format("[%d, %d : %d,%d]",Persegi1.x1, Persegi1.y1, Persegi1.x2, Persegi1.y2);
        String koordinatPersegi2 = String.format("[%d, %d : %d,%d]",Persegi2.x1, Persegi2.y1, Persegi2.x2, Persegi2.y2);
        String koordinatunion = String.format("[%d, %d ; %d,%d]", union.x1, union.y1, union.x2, union.y2);
        String koordinatintersection = String.format("[%d, %d ; %d,%d]", intersection.x1, intersection.y1, intersection.x2, intersection.y2);
        
        System.out.println("<" + Persegi1.x1 + Persegi1.y1 +"> is inside the unions");
        System.out.println(koordinatPersegi2 + "union"+koordinatPersegi1 + " = " + koordinatunion);
        System.out.println(koordinatPersegi2 + "intersection" + koordinatPersegi1 + " = " + koordinatintersection);
    }
}
