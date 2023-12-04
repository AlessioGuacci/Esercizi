package JAExercise11;

public class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age){
        this.age=age;
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
