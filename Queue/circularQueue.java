public class circularQueue {

    static class queue
    {

       static int arr[];
       static int size;
       static int rear;
       static int front;

        queue(int n)
        {
            arr=new int [n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty() 
        {
            return rear==-1 && front==-1;
        }

        // checking for circular queue

        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }

        // add

        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is full");
                return;
            }

            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data; // data is added from back in queue

        }
        // remove 
        public static int remove ()
        {
            if(isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }

            int res= arr[front];
            front=(front+1)%size;
            if(rear==front)
            {
                rear=front=-1;
            }
            else
            {
                front=(front+1)%size;
            }
            return res;
        }

        // peek

        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[])
    {
        queue q= new queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }

} 