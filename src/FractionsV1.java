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

        //set up variables
        String[] fractions = new String[100]; //String to take in fractions
        String[] split = new String[2]; //used to split the fractions
        int[] num = new int[100]; //store numerator
        int[] denom = new int[100]; //store denom
        int count = 0; //number of lines in the file
        int duplicate = 0; //number of fractions that are duplicate

        //count the lines in the file, & store in string[]
        for(int i= 0; inputFile.hasNextLine(); i++) {
            fractions[i] = inputFile.nextLine();
            count++;
        }

        //split the fractions[] into 2: num & denom
        for(int i = 0; i < count; i++) {
            split = fractions[i].split("/"); //reads the split of ints with /
            num[i] = Integer.parseInt(split[0]); //string to int
            denom[i] = Integer.parseInt(split[1]); //string to int
        }

        //used to compare specific nums & denoms
        int num2;
        int denom2;

        //compare denom, then num
        for(int i = 0; i < count; i++) {
            denom2 = denom[i];
            num2 = num[i];

            //if denom & num = each other, then they're are duplicates
            for (int y = 0; y < count; y++) {
                if (denom2 == denom[y]) {
                    if (num2 == num[y]) {
                        duplicate++;
                    }
                }
            }
            if (duplicate <= 1) {
                System.out.println(num2 + "/" + denom2 + " has a count of 1");
            } else {
                System.out.println(num2 + "/" + denom2 + " has a count of " + duplicate);
            }
            duplicate = 0; //reset the duplicates
        }//end for loop
    }//end main
}//end class
