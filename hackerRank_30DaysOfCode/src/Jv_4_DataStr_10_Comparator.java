import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by admin on 12/22/2017.
 */


class Checker implements Comparator {
    @Override
    public int compare(Object player1, Object player2) {
        if (((Player) player1).score < ((Player) player2).score)
            return 1;

        if (((Player) player1).score > ((Player) player2).score)
            return -1;

        return (((Player) player1).name.compareTo(((Player) player2).name));
    }
}

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}


public class Jv_4_DataStr_10_Comparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }


}
