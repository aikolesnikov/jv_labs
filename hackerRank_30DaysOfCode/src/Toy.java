public class Toy {
    private int x = 3;
    private static int stX;

    static {
        stX++;
    }

    private void test() {
        System.out.println(x);
    }

    public static void main(String[] args) {

        long startTimeM, endTimeM;
        long startTimeN, endTimeN;

        startTimeM = System.currentTimeMillis();
        startTimeN = System.nanoTime();

        Toy t = new Toy();
        t.test();

        t.x = 4;
        t.test();



        System.out.println(stX++);
        System.out.println();

        endTimeM = System.currentTimeMillis();
        endTimeN = System.nanoTime();

        System.out.println(endTimeM - startTimeM);
        System.out.println(endTimeN - startTimeN);


    }

}
