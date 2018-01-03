public class IntSLList{
    protected IntSLLNode head, tail;
    public IntSLList() {
        head = tail = null;
    }
    public IntSLList Insertion(){ //create Insertion as IntSLList datatype
        IntSLLNode current = head; //assign head to current IntSLLNode dataype 
        IntSLLNode tail = null; //assign a null to tail IntSLLNode dataype
        while(current != null&& tail != head ){ //while current is not null AND tail is not head
            IntSLLNode next = current; //assign current as the next
            for( ; next.next != tail;  next = next.next){ // for while next.next is not equal to tail continue
                if(next.info <= next.next.info){ // if next.info is less than or equal to the next.next.info
                    int temp = next.info; //assign next.info to a temp
                    next.info = next.next.info; //let the next.next.info be the new next.info
                    next.next.info = temp; //then the previous next.info which was assigned to temp be the next.next.info
                }//then make the first next to be next.next so as to move to the next node
            } //when next.next. is equal to tail end for loop
            tail = next; // assign next to tail
            current = head; // assign head to current
        } 
        // while loop ends because it is EITHER current is not null OR tail is equal to head
        return this;
    }
    public void getPwrLvl(){
        IntSLLNode current = head;
        IntSLLNode tail = null;
        int counter = 0;
        while(current != null && tail!= head){
            IntSLLNode next = current;
            for( ; next.next != tail;  next = next.next){
                if(next.info > 9000){
                    counter++;
                }
            }
            tail = next;
            current = head;
        }
        if(counter > 0){
			System.out.println("It's Over 9000!");
			} else {
				System.out.println("No one is over 9000!");
    		}
    }
        public boolean isEmpty(){
        return head == null;
    }
    public void addToHead(int el){
        head = new IntSLLNode(el, head);
        if (tail == null)
            tail = head;
    }
    public void addtoTail(int el){
        if (!isEmpty()){
            tail.next = new IntSLLNode(el);
            tail = tail.next;
        }
        else head = tail = new IntSLLNode(el);
    }
    public int deleteFromHead(){
        int el = head.info;
        if(head == tail)
            head = tail = null;
        else head = head.next;
        return el;
    }
    public int deleteFromTail(){
        int el = tail.info;
        if (head == tail)
            head = tail = null;
        else {
            IntSLLNode tmp;
            for (tmp = head; tmp.next != tail; tmp=tmp.next);
            tail = tmp;
            tail.next = null;
        }
        return el;
    } 
        public void printAll(){
        for(IntSLLNode tmp = head; tmp != null; tmp = tmp.next)
            System.out.println(tmp.info + " ");
        
    }
}