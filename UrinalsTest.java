import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UrinalsTest {

    Urinals urinals = new Urinals();
    @Test
    @DisplayName("Checking if the input is null")
    void checkInput() throws FileNotFoundException {
        System.out.println("====== Sai Vardhan Reddy Ainavolu == TEST ONE EXECUTED =======");
        ArrayList<String> inp = urinals.getString();
        assertTrue(inp.size() > 0, "There is no input for the file");
    }
}
