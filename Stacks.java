public class Stacks{
    IntSLList stack = new IntSLList();
    public void charNames(String s){
        stack.addtoHead(s);
    }
    public void killChar(){
        stack.deleteFromHead();
    }
    public void showNames(){
        stack.printAll();
    }
}
