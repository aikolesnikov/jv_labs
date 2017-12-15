import java.util.Scanner;

public class Jv_2_Strings_6_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String s = scan.nextLine();
        // String s = "He is a very very good boy, isn't he?";
        String s = "  ";
        // Write your code here.
        scan.close();

        String[] sAr = s.trim().split("[ !,?._'@]+");

        System.out.println(s.trim().isEmpty());

        if(s == "" || s == null || s.trim().isEmpty()){
            System.out.println("0");
        }
        else if(s.length() > 400000){
            return;
        }
        else{
            System.out.println(sAr.length);
        }


        // System.out.println(sAr.length);
        for (String ss : sAr) {
            System.out.println(ss);
        }
    }

}




//  !,?._'
// He is a very very good boy, isn't he?
