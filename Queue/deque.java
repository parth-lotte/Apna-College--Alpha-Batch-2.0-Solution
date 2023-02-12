import java.util.Deque;
import java.util.LinkedList;
// import java.util.*;
public class deque {
    public static void main(String args[])
    {
        Deque<Integer> deque= new LinkedList<>();
        deque.addFirst(2);
        deque.addFirst(1);
        deque.addLast(3);
        deque.addLast(4);

        System.out.println(deque);


    }
    
}
