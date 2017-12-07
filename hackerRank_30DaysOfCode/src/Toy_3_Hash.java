class Toy1 {
    int t1;

}

class Toy2 extends Toy1 {
    int t1;
}

public class Toy_3_Hash {

    public static void main(String[] args) {
        Toy1 obj1 = new Toy1();
        Toy1 obj2 = new Toy1();

        Toy2 toy2_1 = new Toy2();
        Toy2 toy2_2 = new Toy2();

        System.out.println("obj " + obj1);
        System.out.println("toStr " + obj1.toString());
        System.out.println(obj1.getClass());
        System.out.println(obj1.hashCode());

        System.out.println(obj1 instanceof Toy1);
        System.out.println(obj1 instanceof Object);
        System.out.println(toy2_1 instanceof Toy1);
        System.out.println(toy2_1 instanceof Toy2);


//        toy1.t1 = 1;
    }
}
