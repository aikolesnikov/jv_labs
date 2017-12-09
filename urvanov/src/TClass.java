public class TClass {

    /*
    рекомендуется давать всем полям класса самый минимальный из возможных уровней доступа,
    что означает, что большинство полей класса должны иметь уровень доступа private
    */

    private static final int IVAL = 123454;
    private static final int NORM_H = 5;
    private static final String NORM_GOLOVA = "rebyatyonok";
    private static final String NORM_GREETINGS = "Egegeeeyy!!";


    private int h;

    private enum ruki {LEFT, RIGHT}

    private String golova;

    private TClass() {
        h = NORM_H;
        golova = NORM_GOLOVA;
    }

    private TClass(int h) {
        this.h = h;
    }

    static int getIVAL() {
        return IVAL;
    }

    private void greetEveryOne(String sGreet) {
        System.out.println(sGreet);
    }

    static private void greetEveryOne() {
        System.out.println(NORM_GREETINGS);
    }

    private void yob(ruki r) {
        System.out.println(ruki.valueOf(r.name()));
    }


    private void yob(int tymes) {
        System.out.println("by " + this.h + " " + tymes + " tymes");
    }


    public static void main(String[] args) {
        TClass bogatyr = new TClass(3);

        bogatyr.yob(2);
        bogatyr.yob(ruki.LEFT);

        new TClass().greetEveryOne("EEEEy"); // it works but .. ?
        TClass.greetEveryOne();  // it might be better
    }

}
