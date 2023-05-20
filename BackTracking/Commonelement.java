import java.util.HashMap;

public class Commonelement {



    public static void contains(int mat[][], int r, int c)
    {
        HashMap<Integer,Integer> ans= new HashMap<>();

        for(int i=0; i<c; i++)
        {
            ans.put(mat[0][i],1);
        }

       for (int i = 1; i < r; i++) {
        for(int j = 0; j < c; j++)
        {
            if(ans.containsKey(mat[i][j]) && ans.get(mat[i][j])==1 )
            {
                ans.put(mat[i][j],ans.get(mat[i][j])+1);
            }
        

        if(i==r-1 && ans.containsKey(mat[i][j]) && ans.get(mat[i][j])==r)
        {
            System.out.println(mat[i][j]);
        }
    }
 }
    }
    public static void main(String args[])
    {
        int mat[][]= { 

            {1, 2, 3, 4, 5},
            {2, 4, 5, 8, 10},
            {3, 5, 7, 9, 11},
            {1, 3, 5, 7, 9},

        };

        contains(mat, mat.length,mat[0].length);
    }
    
}
