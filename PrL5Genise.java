/**
 * Webster Kyle B. Genise
 * InTech 3-B
 * July 21 2017
 * This program accepts package with the size of the package and will stop accepting inputs when the phrase 
 * “Pack-Queue” is inputted. The output of the program will be grouped by “Size – Number-of-Packages Packages:”
 * When DPS is inputted it would dequeue one from small package
 * When DPM is inputted it would dequeue one from medium package
 * When DPL is inputted it would dequeue one from large package
 **/
import java.util.*;
import java.io.*;
public class PrL5Genise{
    public static void main (String[] args)throws IOException{
        FileReader read = new FileReader("pckq2.in");
        Scanner sc = new Scanner(read);
        StringQueue pSmall = new StringQueue();
        StringQueue pMedium = new StringQueue();
        StringQueue pLarge = new StringQueue();
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
                if(s.contains("Small")){
                    pSmall.enqueueObj(s.replace("Small", ""));
                    sCount++;
                }
                if(s.contains("Medium")){
                    pMedium.enqueueObj(s.replace("Medium", ""));
                    mCount++;
                }
                if(s.contains("Large")){
                    pLarge.enqueueObj(s.replace("Large", ""));
                    lCount++;
                }
                if(s.contains("PDS")){
                   pSmall.dequeueObj();
                   sCount--;
                }
                if(s.contains("PDM")){
                    pMedium.dequeueObj();
                    mCount--;
                }
                if(s.contains("PDL")){
                    pLarge.dequeueObj();
                    lCount--;
                }
            }            
        }
    }
}
