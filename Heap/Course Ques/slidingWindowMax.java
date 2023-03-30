import java.util.*;
public class slidingWindowMax {

    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public Pair (int val, int idx)
        {
            this.val=val;
            this.idx=idx;
        }
        @Override 
        public int compareTo(Pair p2)
    {
        // ascending 
        // return this.val-p2.val;
        // desecnding 
        return p2.val-this.val;
    }
    }
    public static void main(String args[])   //O(nlogk)
    {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[]= new int[arr.length-k+1];   // n-k+1

        PriorityQueue<Pair> pq= new PriorityQueue<>();

        //1st window
         for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i],i));
         }
         res[0]=pq.peek().val;

         for(int i=k; i<arr.length;i++)
         {
            while(pq.size()>0 && pq.peek().idx<=(i-k))
            {
                pq.remove();
            }
            pq.add(new Pair(arr[i],i));
            res[i-k+1]=pq.peek().val;
         }

         // print result 
         for(int i=0;i<res.length;i++)
         {
            System.out.println(res[i]+" ");
         }
         System.out.println();
    }
}



// using deque 
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n=nums.length;
        int r[]= new int [n-k+1];
        // store index 
        int ri=0;

        // creating a deque

        Deque<Integer> q= new ArrayDeque<>();
        for(int i=0; i<nums.length;i++)
        {
            // remove number out of the range in k 
            if(!q.isEmpty() && q.peek()==i-k)
            {
                q.poll();
            }
            // remove smaller Number

            while(!q.isEmpty() && nums[q.peekLast()] <nums[i])
            {
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1)
            {
                r[ri++]=nums[q.peek()];
            }
        }
        return r;
    }
}