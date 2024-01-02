package TestingThingsOut;

public class PersonTest {

    private String firstName;
    private String lastName;
    private int age;
    private String address;

    // Constructor accepting Builder as input
    public PersonTest(BuilderTest builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}