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

    @Test
    @DisplayName("Checking if the input is valid")
    void checkValidInput() throws FileNotFoundException {
        System.out.println("====== Sai Vardhan Reddy Ainavolu == TEST TWO EXECUTED =======");
        ArrayList<String> inp = urinals.getString();

        for(int i = 0; i < inp.size(); ++i) {
            if(inp.get(i).length() > 20)
                assertFalse(true, "Input exceeding the permitted length");
            for(int j = 0; j < inp.get(i).length(); ++j) {
                if(inp.get(i).charAt(j) == '0' || inp.get(i).charAt(j) == '1') {
                    continue;
                } else {
                    assertFalse(true, "Input not in a valid format");
                }
            }
        }
        assertTrue(true, "Input in the right format");
    }
}
