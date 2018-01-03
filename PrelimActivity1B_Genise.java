/* Webster Kyle Genise
 * InTec 3-B
 * To determine if the power level of any being in Planet Earth
 * that is inputted is over or not over 9000.
 */
import java.util.*;
import java.io.*;
public class PrelimActivity1B_Genise extends IntSLList{
    public static void main(String[] args)throws IOException {
        IntSLList newList = new IntSLList();
        FileReader read = new FileReader("scsy.in");
        Scanner sc = new Scanner(read);
        int inputs = sc.nextInt();
        int[] powerlvls = new int[inputs];        
        for(int x=0; x < powerlvls.length; x++){
            powerlvls[x] = sc.nextInt();
            newList.addtoTail(powerlvls[x]);
        }	
        newList.Insertion();
	    newList.printAll();
	    newList.getPwrLvl();
    }
}