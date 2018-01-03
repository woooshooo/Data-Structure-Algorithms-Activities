/**
 * Webster Kyle B. Genise
 * InTech 3-B
 * This program accepts package with the size of the package and will stop accepting inputs when the phrase 
 * “Pack-Queue” is inputted. The output of the program will be grouped by “Size – Number-of-Packages Packages:”
 **/
import java.util.*;
import java.io.*;
public class PrL4Genise{
    public static void main (String[] args)throws IOException{
        FileReader read = new FileReader("pckq.in");
        Scanner sc = new Scanner(read);
        StringQueue pSmall = new StringQueue("");
        pSmall.dequeueObj();
        StringQueue pMedium = new StringQueue("");
        pMedium.dequeueObj();
        StringQueue pLarge = new StringQueue("");
        pLarge.dequeueObj();
        int startVal = 0;
        int sCount = 0;
        int mCount = 0;
        int lCount = 0;
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equals("Pack-Queue")){
                System.out.println("Small – " + sCount + " Packages:");
                pSmall.printQueue();
                System.out.println();
                System.out.println("Medium – " + mCount + " Packages:");
                pMedium.printQueue();
                System.out.println();
                System.out.println("Large – " + lCount + " Packages:");
                pLarge.printQueue();
            } else {
                if(s.charAt(10) == 'S'){
                    pSmall.enqueueObj(s.replace("Small", ""));
                    sCount++;
                }
                if(s.charAt(10) == 'M'){
                    pMedium.enqueueObj(s.replace("Medium", ""));
                    mCount++;
                }
                if(s.charAt(10) == 'L'){
                    pLarge.enqueueObj(s.replace("Large", ""));
                    lCount++;
                }
            }
        }
    }
}
