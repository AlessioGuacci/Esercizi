package JAExercise11;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Alessio", 27);
        Student student2= new Student("Giancarlo", 21);
        Student student3= new Student("Maria",21);
        Student student4= new Student("Giancmaro", 22);
        Student student5= new Student("Giuseppe", 20);
        Student student6= new Student("Antonio", 29);
        Student student7= new Student("Francesco",20);
        Student student8= new Student("Alberto", 22);
        Student student9= new Student("Angelica", 23);
        Student student10= new Student("Valentina",26);
        Student student11= new Student("Martina", 25);
        Student student12= new Student("Marcella", 29);
        List<Student> studentList = new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5,
                student6,student7,student8,student9,student10,student11,student12));


        studentList.sort(Comparator.comparing(Student::getName));
        System.out.println(studentList);
    }
}
