import java.util.PriorityQueue;

public class pqforObject {

    static class Student implements Comparable<Student> {
        // overriding

        String name;
        int rank;

        public Student (String name, int rank)
        {
            this.name=name;
            this.rank=rank;
        }

        // overriding objects 

        @Override 
        public int compareTo(Student s2)
        {
            return this.rank-s2.rank;
        }
    }

    public static void main(String args[])
    {
        PriorityQueue<Student> pq= new PriorityQueue<>();
        pq.add(new Student ("A",4));
        pq.add(new Student ("B",423));
        pq.add(new Student ("C",47));
        pq.add(new Student ("S",45));
        pq.add(new Student ("G",42));
        pq.add(new Student ("R",40));
        pq.add(new Student ("P",41));

        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().name + " ->" + pq.peek().rank);
            pq.remove();

        }
    }
}