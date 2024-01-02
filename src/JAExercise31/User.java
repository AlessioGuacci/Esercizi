package JAExercise31;

public class User {
    private String name;
    private  int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User (String name, int age){
        this.age =age;
        this.name =name;
    }

    public void printResult(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        User user1 = new User("Giancarlo", 21);
        User user2 = new User("Alessio" , 27);
        user1.printResult();
        user2.setAge(30);
        user2.setName("Gianfranco");
        user2.printResult();
    }

}
