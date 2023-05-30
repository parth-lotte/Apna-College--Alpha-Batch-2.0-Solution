import java.util.*;
public class fractionalKnapsack {
    public static void main(String args[])
    {
        int val[]={60,100,120};
        int weight[]= {10,20,30};
        int tW=50;
        double ratio[][]= new double [val.length][2];
        // oth= idx;
        // 1th col=> ratio 
        for (int i = 0; i < val.length; i++) {
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
             }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
// ascending order sort
        int cap= tW;
        int finVal=0;
        for(int i=ratio.length-1; i>=0; i--)
        {
            int idx= (int)ratio[i][0];
            if(cap>=weight[idx])
            {
// include full item'
                finVal+=val[idx];
                cap-=weight[idx];
            }
            else
            {
            // include fractional item
            finVal+=(ratio[i][1]*cap);
            cap=0;
            break;
            }
        }
     System.out.println("Final Value ="+ finVal);    
    }
    
}
