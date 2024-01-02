package TestingThingsOut;

public class MainTest {
    public static void main(String[] args) {
        // Corrected Builder invocation
        PersonTest person1 = new BuilderTest("John", "Doe")
                .age(30)
                .address("123 Main St")
                .build();

        PersonTest person2 = new BuilderTest("Jane", "Smith")
                .age(25)
                .address("456 Main St")
                .build();

        System.out.println("Person 1: " + person1.getFirstName() + " " + person1.getLastName() +
                ", Age: " + person1.getAge() + ", Address: " + person1.getAddress());

        System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getLastName() +
                ", Age: " + person2.getAge() + ", Address: " + person2.getAddress());
    }
}


