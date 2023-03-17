import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class buildPQ {

// Using JCF
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(4);
        pq.add(2);
        pq.add(12);
        pq.add(5);
        pq.add(9);

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}