import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Student2 {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void anothermethod() {
    }

    public void anothermethod2() {
    }

}

public class Jv_72_Reflection {

    public static void main(String[] args){

        Class student = Student2.class;

       /* Get declared methods */
        Method[] methods = student.getDeclaredMethods();

       /* Adding method list to a collection */
        ArrayList<String> methodList = new ArrayList<>();
        for(Method m : methods){
            methodList.add(m.getName());
        }

       /* Sorting the list of methods */
        Collections.sort(methodList);

       /* Printing the methods list */
        for(String name: methodList){
            System.out.println(name);
        }

/*
       // The following blocks is EXTRA exercise.

       // Getting and Printing the list of constructors Student3 class
       Constructor<Student3>[] constructsOfStudent = student.getConstructors();
       if (constructsOfStudent.length != 0){
           System.out.println("Constructs of Student3");
           for (Constructor c : constructsOfStudent){
               System.out.println(c.toGenericString());
           }
       }
       else System.out.println("No constructors in " + student.getSimpleName() + "class");

       // Getting and Printing the Fields of Student3 class
       Field[] fields = student.getFields();
       if (fields.length != 0){
          System.out.println("List of fields in Student3 class");
             for (Field f : fields){
                 System.out.println(f.toGenericString());
             }
       }
       else System.out.println("No fields in " + student.getSimpleName() + "class");
*/
    }
}
