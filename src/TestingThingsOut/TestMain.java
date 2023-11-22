package TestingThingsOut;

public class TestMain {
    public static void main(String[] Args) {


        int valoreLimite = 5;
        int valoreAttuale = 1;
        int sum = 0;
        while (valoreAttuale < valoreLimite) {
            valoreAttuale++;
            sum = valoreAttuale + valoreAttuale;
        }
        System.out.println(sum);
        ;
    }
}
