package JAExercise2;

public class CharChecker {
    public static void main(String[] Args) {
        char[] characters = {'a', '3', '7', 'c'};
        for (char i : characters) {
            try {
                boolean result = characterChecker(i);
                System.out.println(result);
            } catch (CharacterException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean characterChecker(char example) throws CharacterException {
        if (example >= '0' && example <= '9') {
            return true;
        } else {
            throw new CharacterException("the character is not a number");
        }
    }
}

