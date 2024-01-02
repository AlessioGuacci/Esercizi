package JAExercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharCheckerTest {

    @Test
    void checkIfCharacterisInRange() throws CharacterException {
        char toTest= '6';
        boolean result=CharChecker.characterChecker(toTest);
        assertTrue(result);
    }
    @Test
    void checkIfCharacterIsntInRange() throws CharacterException {
        char toTest1='a';
        assertThrows(CharacterException.class, ()-> CharChecker.characterChecker(toTest1));
    }
}