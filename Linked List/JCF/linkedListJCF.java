import java.util.LinkedList;
public class linkedListJCF {
    public static void main(String args[])
    {
        LinkedList<Integer> ll = new LinkedList<>();
        //add elements

        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        //0->1->2   
        System.out.println(ll);
        //remove
        ll.removeLast();
        System.out.println(ll);
    }
}