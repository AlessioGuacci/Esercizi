package JAExercise10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Alessio", 27);
        Student student2 = new Student("Giancarlo", 21);

        List <Student> studentList = new ArrayList<>(Arrays.asList(student1, student2));
        System.out.println("the student list is " + studentList);

        Student student3= new Student("Marcella", 29);
        Student student4= new Student("Nicola", 25); //youre only as young as you feel ;)
        Student student5= new Student("Kevin", 27);
        Student student6= new Student("Maria", 23);

        studentList.add(2, student3);
        studentList.add(3, student4);
        studentList.add(4, student5);
        studentList.add(5, student6);
        System.out.println("the new list is " + studentList);


    }
}
