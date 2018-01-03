/* Webster Kyle B. Genise
 * InTech 3-B
 * 
 */
import java.util.Scanner;
public class MidLab2_Genise{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        IntSLList sortedList = new IntSLList();
        IntSLList unsortedList = new IntSLList();
        MidLab2_Genise m = new MidLab2_Genise();
        int numToAdd = 0;
        String s = "";
        System.out.println("Input nums ");
        while(!(s.contains("Bubble")||s.contains("Insert"))){
            if(sc.hasNextInt()){
                numToAdd=sc.nextInt();
                unsortedList.addtoTail(numToAdd);
            }
            else{
                s=sc.nextLine();
            }
        }
        System.out.print("List before Sorting: ");
        unsortedList.printAll();
        System.out.println();
        if(s.contains("Bubble")){
            System.out.print("List after Bubble Sort: ");
            m.bubbleSort(unsortedList);
            unsortedList.printAll();
        }
        if(s.contains("Insert")){
            System.out.print("List after Insertion Sort: ");
            m.insertionSort(unsortedList);
            unsortedList.printAll();
        }
    }
    public void bubbleSort(IntSLList list){  
       for(IntSLLNode current=list.head; current!=null ; current=current.next){
           for(IntSLLNode next=list.head; next!=null ; next=next.next){
               if(current.info < next.info){
                   int swap = current.info ;
                   current.info = next.info;
                   next.info = swap;
                }
            }
        }      
    }
    public IntSLLNode getNodePos(IntSLList list, int compare){
        IntSLLNode position=list.head;        
        while(compare>position.info){
            position=position.next;               
        }
        return position;
    }
    public int remainingUnsorted(IntSLList list, int compare)
    {
        IntSLLNode position=list.head;
        int k=0;
        while(compare>position.info){
            position=position.next;
            k++;
        }
        k++;
        return k;
      }
    public void insertionSort(IntSLList list){
        IntSLLNode tmp2;
        int index=0;
        for(IntSLLNode tmp=list.head;tmp!=null;tmp=tmp.next){   
            tmp2=getNodePos(list, tmp.info);
             if(tmp2.info>=tmp.info)
            {   int store=tmp.info;
                int store2=tmp2.info;
                tmp2.info=store;
                store=store2;
                tmp2=tmp2.next;
                for(int i=remainingUnsorted(list,tmp.info);i<=index;i++)
                {                    
                    store2=tmp2.info;
                    tmp2.info=store;
                    store=store2;
                    tmp2=tmp2.next;
                }      
            }
            index++;
        }
    }
}
