import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Urinals {

    private static File file = new File("urinal.dat");
    private static Scanner scanner;

    private static String string;

    static {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //Takes input from the file
    public static String getStrings() throws FileNotFoundException {
//        System.out.println("Not yet implemented");
        string = scanner.nextLine();
        return string;
    }

    //Solves for the placement for a specific string
    public String getPlacement() {
//        System.out.println("Not yet implemented");
        char prev = '0';
        StringBuilder string = new StringBuilder(this.string);
        string.append('0');
        for(int i = 0; i < string.length()-1; ++i) {
            if(prev == '0' && string.charAt(i+1) == '0') {
                string.setCharAt(i, '1');
            }
            prev = string.charAt(i);
        }
        return string.toString();
    }

    //Iteratively solves the placements for all the strings and prints in console
    public static void orchastrator() {
        System.out.println("Not yet implemented");
//        String output = null;
//        for(int i = 0; i < inpStrings.size(); ++i) {
//            output = getPlacement(inpStrings.get(i));
//        }
    }


    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("urinal.dat");
        scanner = new Scanner(file);
    }

    public static String getString() {
        return string;
    }
}
