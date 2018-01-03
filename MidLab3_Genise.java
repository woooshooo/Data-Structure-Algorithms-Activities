/** 
 * Webster Kyle B. Genise InTech 3-B
 * This program allows you to use the recursive function of multiplication and exponentiation.
 * The first input number wil be the multiplicand for the multiplication and base for the exponentiation 
 * the second input number would be the multiplier and the exponent for the exponentiation.
 * The result would be first the product then power then the product of the first two answers.
**/
import java.util.*;
import java.io.*;
public class MidLab3_Genise{
    public static int multiply(int x, int y){
        if( x == 0 || y == 0 )
            return 0;
        else 
            return x + multiply(x, y-1);
    }
    public static int exponent(int base, int power){
        if (base == 1 || power == 1){
            return base;
        } else if (power == 0){
            return 1;
        } else {
             return base * exponent(base, power-1);
        }
    }
    public static void main(String args[])throws IOException{
        FileReader read = new FileReader("mtp.in");
        Scanner sc = new Scanner(read);
        MidLab3_Genise funcs = new MidLab3_Genise();
        int size = sc.nextInt();
        sc.nextLine();
        int a,b,first,second,third;
        while(size > 0){
            String[] strings = sc.nextLine().split(" ");
            a = Integer.parseInt(strings[0]);
            b = Integer.parseInt(strings[1]);
            first = funcs.multiply(a,b);
            second = funcs.exponent(a,b);
            third = funcs.multiply(first,second);
            System.out.println( first +" "+ second +" "+ third );
            size--;
        }
    }
}
