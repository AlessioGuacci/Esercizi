package Exercise10;

public class confrontation {
    public static String confrontStrings(String a, String b) {
        int risultatoConfronto = a.compareTo(b);

        StringBuilder result = new StringBuilder("Le due stringhe sono ");

        if (risultatoConfronto == 0) {
            result.append("uguali");
        } else {
            result.append("differenti");
        }

        return result.toString();
    }
}