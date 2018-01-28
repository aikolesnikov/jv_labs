package entry_test;

import java.io.FileReader;
import java.util.*;

public class EntryTest {

    // Task 1. Написать метод заполнения списка случайными целыми числами от 0 до 100.
    // Метод принимает список и количество элементов. 
    public static void fillListWithRandom(List<Integer> numberList, int numQty) {

        if (numberList != null) {
            final Random random = new Random();

            for (int i = 0; i < numQty; i++) {
                numberList.add(random.nextInt(100));
            }
        }
    }

    // Task 2. Написать метод, который принимает имя файла и возвращает количество строк в файле
    // (задача на применение FileReader).
    public static long getFileRowsCount(String fileName) throws Exception {
        long rowCounts=0;

        try{
            FileReader f= new FileReader(fileName);
            Scanner scan = new Scanner(f);

            while (scan.hasNextLine()) {
                scan.nextLine();
                rowCounts++;
            }

            f.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return rowCounts;
    }

    /*Task 3
    3. Написать метод, принимающий двумерный квадратный массив и заполняющий:
    01, 02, 03, 04
    05, 06, 07, 08
    09, 10, 11, 12
    13, 14, 15, 16
    */
    public static void fillArray2D(int[][] arInt) {
        int k = 0;
        for (int i = 0; i < arInt.length; i++) {
            for (int j = 0; j < arInt[i].length; j++) {
                arInt[i][j] = ++k;
            }
        }
    }

    // 4. Написать метод, проверяющий является ли строка полиндромом.
    // Строка, которая одинаково читается справо-налево и слева-направо.
    // Например, фииф, нгшшгн
    public static boolean isPolindrom(String s) {
        if (s != null) {
            int sL = s.length();
            if (sL == 1)
                return true;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(sL - i - 1)) return false;
            }
        }
        return true;
    }


    /*
        5. Написать метод, который принимает массив целых чисел, заполняет по такому принципу:
        - элементы с четными индексами - значением номера элемента
        - элементы с нечетными индексами - значением 0
        Вывести массив на экран 1, 0, 3, 0, 5, 0, 7, 0..
     */
    public static void fillArrayEvenOdd(int[] arInt) {

        int arL = arInt.length;
        if (arL == 0) return;
        if (arL == 1) {
            arInt[0] = 1;
            return;
        }

        for (int i = 0; i < arInt.length; i += 2) {
            arInt[i] = i + 1;
            arInt[i + 1] = 0;
        }
    }


    public static void main(String[] args) throws Exception {

        /*
        // Task 1
        List<Integer> numberArrayList = new ArrayList<>();
        fillListWithRandom(numberArrayList, 10);
        System.out.println(numberArrayList);
        */

        /*
        //Task 2
        // System.out.println(getFileRowsCount("./vertex/test.txt"));
        /*

        /*
        // Task 3
        int[][] arInt2D = new int[4][4];
        fillArray2D(arInt2D);
        System.out.println(Arrays.deepToString(arInt2D));
        */

        /*
        // Task 4
        System.out.println(isPolindrom("mama"));
        System.out.println(isPolindrom("фииф"));
        */

        /*
        // Task 5
        int[] arI = new int[10];
        fillArrayEvenOdd(arI);
        System.out.println(Arrays.toString(arI));
        */
    }
}
