/* Webster Kyle Genise
 * InTec 3-B
 */
import java.util.*;
import java.io.*;
public class PrelimActivity1C_Genise{
    public static void main(String[] args)throws IOException {
        IntSLList newList = new IntSLList();
        FileReader read = new FileReader("gntn.in");
        Scanner sc = new Scanner(read);
		//ArrayList<String> inputs = new ArrayList<String>();
        String inputStr = sc.nextLine();
		int startVal = Integer.parseInt(inputStr);
        String[] inputs = new String[startVal];        
        for(int x=0; x < inputs.length; x++){
            inputs[x] = sc.nextLine();
       	}	
        for(int i = 0; i < startVal; i++){
			String s = inputs[i];
			char c = s.charAt(0);
            if(c == 'S'){
                newList.addtoTail(s.substring(2,s.length()));
            }
            if(c == 'D'){
                newList.addtoHead(s.substring(2,s.length()));
            }
         }
		newList.printAll();
    }
}