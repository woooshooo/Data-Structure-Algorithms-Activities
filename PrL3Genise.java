/* Webster Kyle B. Genise
 * InTech 3-B
 * This STACK program accepts character names from the Game of Thrones series and prints them after, 
 * when a String "KILL" is accepted
 * the program kills the character and wont be shown in the list.
 * If "END-OF-SEASON" String is accepted it signifies the end of the program thus 
 * showing all the names accepted that werent killed.
 */
import java.util.*;
import java.io.*;
public class PrL3Genise{
    public static void main(String[] args)throws IOException{
        FileReader read = new FileReader("got7.in");
        Scanner sc = new Scanner(read);
        Stacks stackList = new Stacks();
        while(sc.hasNextLine()){
            String thisLine = sc.nextLine();
            if(thisLine.equals("END-OF-SEASON")){
                System.out.println("Survives Season 7: ");
                stackList.showNames();
            }
            if(thisLine.equals("KILL")){
                stackList.killChar();
            } else {
                stackList.charNames(thisLine);
            }
        }
    }
}
