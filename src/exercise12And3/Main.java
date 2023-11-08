package exercise12And3;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //my new student
        Student Alessio = new Student("Alessio","Guacci","exercise1And2.Main.Student 1");
        System.out.println(Alessio.getNome());
        System.out.println(Alessio.getCognome());
        System.out.println(Alessio.getIdentificativo());
        Alessio.setNome("gianfranco");
        System.out.println(Alessio.getNome()); //per mostrare funzionamento del setter

        //my new exercise1And2.Main.Auto
        Auto Mercedes= new Auto("1.332 cm3 ", "AJ 765FP", "Mercedes", "classe a");
        System.out.println(Mercedes.getCilindrata());
        System.out.println(Mercedes.getTarga());
        System.out.println(Mercedes.getMarca());
        System.out.println(Mercedes.getModello());
    }


}
