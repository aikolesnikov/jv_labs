import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by admin on 12/22/2017.
 */
public class Jv_4_DataStr_6_List {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(scan.nextInt());
        }

        int tries = scan.nextInt();
        while (tries-- > 0) {
            if (scan.next().equals("Insert")){
                list.add(scan.nextInt(), scan.nextInt());
            } else {
                list.remove(scan.nextInt());
            }
        }

        for (Integer i:list) System.out.printf(i.toString() + " ");

        scan.close();
    }


}
