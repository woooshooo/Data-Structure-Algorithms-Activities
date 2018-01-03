import java.util.*;
import java.io.*;
public class Main extends BSTree{
    public static void main(String arg[])throws IOException{
        FileReader read = new FileReader("bst.in");
        Scanner sc = new Scanner(read);
        BSTree b = new BSTree();
        String[] bookName = new String[2];
        String[] searchCommands = new String[2];
        String[] deleteCommands = new String[2];
        ArrayList<String> listofBooks = new ArrayList<String>();
        int bookPage = 0;
        int bookNum = 0;
        int counter = 0;
        while(sc.hasNextLine()){
          String s = sc.nextLine();          
          if(s.contains("SEARCH")){
              s.replace("DISPLAY","");
              searchCommands = s.split(" ");
              bookNum = Integer.parseInt(searchCommands[1]);
              b.search(bookNum);
          }
          else if(s.contains("DISPLAY")){
              System.out.println();
              System.out.println("The books available: ");
              b.display(root);
              System.out.println();
              System.out.println(listofBooks);
          }
          else if(s.contains("DELETE")){
              deleteCommands = s.split(" ");
              bookNum = Integer.parseInt(deleteCommands[1]);
              b.delete(bookNum); 
              listofBooks.remove(bookNum-1);
              System.out.println();
              System.out.println("Deleted book # "+ bookNum +" in the inventory.");
          } else {
              bookName = s.split("-");
              bookPage = Integer.parseInt(bookName[0]);
              b.insert(bookPage);
              listofBooks.add(bookName[1]);
              counter++;
          }
        }
    }
}
