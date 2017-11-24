import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Logger;

public class Toy1_Dates_Log_Static {
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

        Toy1_Dates_Log_Static t = new Toy1_Dates_Log_Static();
        t.test();

        t.x = 4;
        t.test();

        System.out.println(stX++);

        System.out.println(System.currentTimeMillis() - startTimeM);
        System.out.println(System.nanoTime() - startTimeN);

        System.out.println(System.getProperties());
        System.out.println();
        System.out.println(System.getenv());

        System.out.println(LocalDate.now() + " " + LocalTime.now());

        Logger logger = Logger.getLogger("main");
        logger.info("Mi rabotali - " + (System.nanoTime() - startTimeN));

        Instant timestamp = Instant.now();
        logger.warning("Abr: " + timestamp.getEpochSecond());

    }

}
