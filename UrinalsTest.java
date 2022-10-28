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
        String inp = urinals.getStrings();
        assertTrue(inp.length() > 0, "There is no input for the file");
    }

    @Test
    @DisplayName("Checking if the input is valid")
    void checkValidInput() throws FileNotFoundException {
        System.out.println("====== Sai Vardhan Reddy Ainavolu == TEST TWO EXECUTED =======");
        String inp = urinals.getStrings();
        if(inp.length() > 20)
            assertFalse(true, "Input exceeding the permitted length");
        for(int j = 0; j < inp.length(); ++j) {
            if(inp.charAt(j) == '0' || inp.charAt(j) == '1') {
                continue;
            } else {
                assertFalse(true, "Input not in a valid format");
            }
        }
        assertTrue(true, "Input in the right format");
    }


    @Test
    @DisplayName("Check if the specific output is valid")
    void checkValidPlacement() throws FileNotFoundException {
        System.out.println("====== Sai Vardhan Reddy Ainavolu == TEST THREE EXECUTED =======");
//        urinals.getStrings();
        String s = urinals.getPlacement();
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == '1'&& s.charAt(i+1) == '1') {
                assertFalse(true, "invalid number of spaces detected");
            }
        }
    }

}
