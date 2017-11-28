import java.io.PrintStream;

public class Toy_2_IO {


    public static void main(String[] args) {

        PrintStream out = System.out;

        out.append('a');
        out.append('b');

//        System.out.close();

        out.append("qwe");
//        out.flush();
        out.append('c');

        out.write('d');
        out.write('e');
        out.flush();

        out.print('\n');
        out.print(1);
        out.print(22222);
        out.print('\n');

        out.write(3);
        out.write(110);
        out.write(115);
        out.write('\n');
        out.flush();

        byte[] arB = new byte[] {'a','b'};
        out.write(arB,1,1);
    }
}
