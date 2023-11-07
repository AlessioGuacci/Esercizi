// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student Alessio = new Student("Alessio","Guacci","Student 1");
        System.out.println(Alessio.getNome());
        System.out.println(Alessio.getCognome());
        System.out.println(Alessio.getIdentificativo());
        Alessio.setNome("gianfranco");
        System.out.println(Alessio.getNome()); //per mostrare funzionamento del setter
    }
}
