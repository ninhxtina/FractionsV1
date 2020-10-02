/** Christina Ninh
 * CSS143 Kalmin
 */
import java.lang.String;
import java.io.FileInputStream;
import java.io.FileNotFoundException; //Import this class to handle errors
import java.util.Scanner; //Import the Scanner class to read text files

public class FractionsV1 {
    public static void main(String[] args) {
        //reads file
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(new FileInputStream("fractions.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Text file could not be read.");
            e.printStackTrace();
        }//end of try
    }//end main
}//end class
