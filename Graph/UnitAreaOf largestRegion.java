//{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    class GFG
    {
        public static void main(String[] args) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine().trim());
            while(T-->0)
            {
                String[] s = br.readLine().trim().split(" ");
                int n = Integer.parseInt(s[0]);
                int m = Integer.parseInt(s[1]);
                int[][] grid = new int[n][m];
                for(int i = 0; i < n; i++){
                    String[] S = br.readLine().trim().split(" ");
                    for(int j = 0; j < m; j++){
                        grid[i][j] = Integer.parseInt(S[j]);
                    }
                }
                Solution obj = new Solution();
                int ans = obj.findMaxArea(grid);
                System.out.println(ans);
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution
    {
        int []dx={1,1,1,-1,-1,-1,0,0};
            int [] dy={1,0,-1,1,0,-1,1,-1};
        public  int dfs(int[][] grid, int i, int j,int row, int col)
        {
            
            
            if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 )
            {
                return 0;
            }
            
            // if(grid[i][j]==0)
            // {
            //     return 0;
            // }
            grid[i][j]=0;
            int ans=1;
            
            for(int k=0;k<8;k++)
            {
                int newx= i+dx[k];
                int newy= j+dy[k];
                
                
                ans+=dfs( grid,  newx, newy, row,col);
                
            }
            
            return ans;
            
            
            
            
        }
        
        //Function to find unit area of the largest region of 1s.
        public int findMaxArea(int[][] grid)
        {
            // boolean[][] visited = new boolean[grid.length][grid[0].length];
            int ans=0;
            int row=grid.length;
            int col= grid[0].length;
             for(int i=0; i<row; i++)
             {
                 for(int j=0 ; j<col; j++)
                 {
                     if(grid[i][j]==1 )
                     {
                        //  count++;
                        ans= Math.max(ans, dfs(grid,i,j,row,col));
                         
                     }
                 }
             }
             return ans;
        }
    }