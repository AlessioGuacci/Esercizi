package Exercise11;
import static Exercise11.CharacterExtractor.*;
public class Extraction {
    public static void main (String[] Args) {
        CharacterExtractor characterExtractor = new CharacterExtractor("this is the string", 8);
        String result= characterExtractor.characterExtractor();
        System.out.println(result);
    }
}
