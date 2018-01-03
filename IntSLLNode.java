public class IntSLLNode{
    int info;
    IntSLLNode next;
    IntSLLNode(int i){
        this(i,null);
    }
    public IntSLLNode(int i, IntSLLNode n){
        info = i;
        next = n;
    }
}
