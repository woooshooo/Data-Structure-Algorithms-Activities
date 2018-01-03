import java.util.Scanner;
public class Java_Diamond{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int x,y;
        System.out.println("User Input: ");
        int input = s.nextInt();
        for (x=0;x<=input;x++){
            for(y=input;y>x;y--)
                System.out.print(" ");
            for(int c=0;c<x;c++)
                System.out.print("* ");
            System.out.println();
        }
        for (x=0;x<input;x++){
            for(y=0;y<x+1;y++)
                System.out.print(" ");
            for(int c=input;c>x+1;c--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
