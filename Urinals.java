import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Urinals {

    private static File file = new File("urinal.dat");
    private static Scanner scanner;

    private static String string;

    private static Integer result;

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
        if(scanner.hasNextLine())
            string = scanner.nextLine();
        return string;
    }

    //Solves for the placement for a specific string
    public static String getPlacement() {
//        System.out.println("Not yet implemented");
        char prev = '0';
        StringBuilder str = new StringBuilder(string);
        str.append('0');
        Integer ans = 0;
        for(int i = 0; i < str.length()-1; ++i) {
            if(prev == '0' && str.charAt(i+1) == '0') {
                if(str.charAt(i) != '1')
                    ans++;
                str.setCharAt(i, '1');
            }
            prev = str.charAt(i);
        }
        result = ans;
        return str.toString();
    }

    //Iteratively solves the placements for all the strings and logs in files
    public static void main(String args[]) throws IOException {
        File file = new File("urinal.dat");
        scanner = new Scanner(file);
        StringBuilder fileName = new StringBuilder("rule");
        File output = new File("rule.txt");
        Integer enumerate = 1;
        while(output.exists()) {
            fileName.append(Integer.toString(enumerate));
            fileName.append(".txt");
            output = new File(fileName.toString());
            fileName = new StringBuilder("rule");
            enumerate++;
        }
        output.createNewFile();
        FileWriter fileWriter = new FileWriter(output);
        String placement;
        while(scanner.hasNextLine()) {
            getStrings();
            placement = getPlacement();
            System.out.println("Resulting placement of the urinals:"+placement);
            fileWriter.write(Integer.toString(result)+"\n");
        }
        fileWriter.close();
    }

    public static String getString() {
        return string;
    }

    public static Integer getResult() {
        return result;
    }
}
