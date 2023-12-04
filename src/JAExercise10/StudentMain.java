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
        studentList.add(2, student3);
        studentList.add(3,student4);
        System.out.println("the new list is " + studentList);


    }
}
