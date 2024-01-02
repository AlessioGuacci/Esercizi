package JAExercise30;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setFirstName("Alessio");
        builder.setLastName("Guacci");
        builder.setAge(27);
        builder.setAddress("Via roma 5");
        System.out.println(builder.build());
        Person Alessio = new Person(builder);
        System.out.println(Alessio);
    }
}
