
import java.util.LinkedList;
import java.util.Queue;
public class queueJCF {

    public static void main(String args[])
    {
        // Queue<Integer> q= new LinkedList <>();
         // queue is an interface thats why we have created like as we cant
                                        // cant create object for Que
                                        
                                        
        Queue<Integer> q= new LinkedList<>();                                
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
