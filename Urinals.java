import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Urinals {

    public static ArrayList<String> getString() throws FileNotFoundException {
//        System.out.println("Not yet implemented");
        File file = new File("urinal.dat");
        Scanner scanner = new Scanner(file);
        ArrayList<String> strings = new ArrayList<>();
        while(scanner.hasNextLine()) {
            strings.add(scanner.nextLine());
        }
        return strings;
    }

    Integer getSpaces() {
        return 0;
    }

    Integer fillSpaces() {
        return 0;
    }


    public static void main(String args[]) throws FileNotFoundException {

    }

}
