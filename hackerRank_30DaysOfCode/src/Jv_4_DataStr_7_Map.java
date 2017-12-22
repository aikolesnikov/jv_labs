import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by admin on 12/22/2017.
 */
public class Jv_4_DataStr_7_Map {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        Map map = new HashMap<String, Integer>();

         int n = in.nextInt();
         in.nextLine();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            map.put(name, phone);
            in.nextLine();
        }

        // System.out.println(map.size());
        // System.out.println(map.entrySet());

        while (in.hasNext()) {
            String s = in.nextLine();
            Object o = map.get(s);

            if (o == null)
                System.out.println("Not found");
            else
                System.out.println(s + "=" + o);
        }
    }
}
