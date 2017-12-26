import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by admin on 12/22/2017.
 */
class Checker2 implements Comparator {
    @Override
    public int compare(Object student1, Object student2) {
        if (((Student3) student1).getCgpa() < ((Student3) student2).getCgpa())
            return 1;

        if (((Student3) student1).getCgpa() > ((Student3) student2).getCgpa())
            return -1;

        if (((Student3) student1).getFname().compareTo(((Student3) student2).getFname()) > 0) {
            return 1;
        }
        if (((Student3) student1).getFname().compareTo(((Student3) student2).getFname()) < 0) {
            return -1;
        }

        return (((Student3) student1).getId() - ((Student3) student2).getId());
    }
}

class Student3 {
    private int id;
    private String fname;
    private double cgpa;

    public Student3(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Jv_4_DataStr_11_JavaSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student3> studentList = new ArrayList<Student3>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student3 st = new Student3(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, new Checker2());

        for (Student3 st : studentList) {
            System.out.println(st.getId() + " " + st.getFname() + " " + st.getCgpa());
        }
    }

}
