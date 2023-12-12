package JAExercise21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class PreviousExerciseTest {

    @Test
    void rangeCheckerTest(){
        PreviousExercise exercise = new PreviousExercise();
        assertTrue(PreviousExercise.rangeChecker(1,5,3));

    }
}