/* Webster Kyle Genise
 * InTec 3-B
 * To determine if the power level of any being in Planet Earth
 * that is inputted is over or not over 9000.
 */

import java.util.*;
import java.io.*;
public class PrelimActivity1A_Genise {
	public static void main(String[] args) throws IOException {
		int counter=0;
		int temp;
		FileReader InputFile = new FileReader("scsy.in"); //file reader get the input
    	Scanner sc = new Scanner(InputFile); //Scanner sc = new Scanner(new File("scsy.in"));
    	int inputs = sc.nextInt(); // retrieve length of the input file
    	int[] powerlvls = new int[inputs]; // retrieve length of the input file
    	System.out.println("Input the values: ");
    	
    	for(int x=0; x < powerlvls.length; x++){
			powerlvls[x] = sc.nextInt();
		}
		for (int i = 1; i < powerlvls.length; i++) {
		    for(int j = i ; j > 0 ; j--){
			    if(powerlvls[j] > powerlvls[j-1]){
				    temp = powerlvls[j];
				    powerlvls[j] = powerlvls[j-1];
				    powerlvls[j-1] = temp;
			    }
		    }
	    }
        System.out.println("Sorted Values are ");     
    	for(int c=0; c < powerlvls.length; c++){
    		System.out.println(powerlvls[c]);
    		if(powerlvls[c] > 9000){
    			counter++;
    		}
    	}
		if(counter > 0){
			System.out.println("It’s Over 9000!");
			} else {
				System.out.println("No one is over 9000!");
    		}
    	
    	
    }
}