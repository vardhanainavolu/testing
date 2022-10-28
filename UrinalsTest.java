import org.junit.jupiter.api.*;

import java.io.FileNotFoundException;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import org.junit.jupiter.api.Order;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestMethodOrder;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class UrinalsTest {

    private static Urinals urinals = new Urinals();

    private boolean flag = false;

    @BeforeAll
    static void setUp() throws FileNotFoundException {
        urinals.getStrings();
    }

    @AfterEach
    void skip() {
        if(flag) {
            System.exit(0);
        }
    }

    @Test
    @Order(1)
    @DisplayName("Checking if the input is null")
    void checkInput() {
        System.out.println("====== Sai Vardhan Reddy Ainavolu == TEST ONE EXECUTED =======");
        String inp = urinals.getString();
        assertFalse(inp == null, "There is no input for the file");
        if(inp == null)
            flag = true;
    }

    @Test
    @Order(2)
    @DisplayName("Checking if the input is valid")
    void checkValidInput() {
        System.out.println("====== Sai Vardhan Reddy Ainavolu == TEST TWO EXECUTED =======");
        String inp = urinals.getString();
        if(inp.length() > 20) {
            assertFalse(true, "Input exceeding the permitted length");
            flag = true;
        }
        for(int j = 0; j < inp.length(); ++j) {
            if(inp.charAt(j) == '0' || inp.charAt(j) == '1') {
                continue;
            } else {
                assertFalse(true, "Input not in a valid format");
                flag = true;
            }
        }
        assertTrue(true, "Input in the right format");
    }


    @Test
    @Order(3)
    @DisplayName("Check if the placement is valid")
    void checkValidPlacement() throws FileNotFoundException {
        System.out.println("====== Sai Vardhan Reddy Ainavolu == TEST THREE EXECUTED =======");
//        urinals.getStrings();
        String s = urinals.getPlacement();
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == '1'&& s.charAt(i+1) == '1') {
                assertFalse(true, "invalid number of spaces detected");
                flag = true;
            }
        }
    }

    @Test
    @Order(4)
    @DisplayName("Check if the output is valid")
    void checkOutput() {
        System.out.println("====== Sai Vardhan Reddy Ainavolu == TEST FOUR EXECUTED =======");
        assertFalse(urinals.getResult() == null, "No valid result");
    }

}
