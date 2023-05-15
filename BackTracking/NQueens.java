import java.util.*;
public class NQueens {


    public static boolean isSafe(char board [][], int row , int col)
    {
        // vertical 

        for(int i=row-1; i>=0; i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        // Diagonal left up

        for(int i=row-1,  j= col-1; i>=0 && j>=0;i-- ,j-- )
        {
            if(board[i][j]=='Q')
            {
            return false;
            }
        }

        // Diagonal right up
        for(int i=row-1,  j= col+1; i>=0 && j<board.length;i-- ,j++ )
        {
            if(board[i][j]=='Q')
            {
            return false;
            }
        } 
        return true;
    }
    public static void printBoard(char board[][])
    {
        System.out.println("-------board------");
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                System.out.print(board[i][j]+ " ");
            }

            System.out.println();
        }
    }

public static void nQueens(char board[][], int row)
{


    // Base case 

    if(row==board.length)
    {
        printBoard(board);
        return;
    }
    // Now will iterate the loop for column 

    for(int j=0; j<board.length; j++)
    {
        if(isSafe(board, row, j)){
        board[row][j]= 'Q';       // will place Q in each row 
        nQueens(board, row+1);       //  iterate 
        board[row][j]='X'; 
        }      // back track with X

    }
}
    public static void main(String args[])
    {
        int n=4;

        char board[][]= new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='X';
            }
            
        }

        nQueens(board,0);
        printBoard(board);
    }
    
}
