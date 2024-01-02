package TestingThingsOut;


public class BuilderTest {
    String firstName;
    String lastName;
    int age;
    String address;

    public BuilderTest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public BuilderTest age(int age) {
        this.age = age;
        return this;
    }

    public BuilderTest address(String address) {
        this.address = address;
        return this; // Returning the updated BuilderTest object
    }

    public PersonTest build() {
        return new PersonTest(this);
    }
}









