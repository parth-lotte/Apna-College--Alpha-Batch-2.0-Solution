import java.util.*;
public class questionOnearray
{
    public static int countArray(int matrix[][])
    {
        int count =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j]==7)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static int secondRowsum(int matrix[][])
    {
        int sum=0;
        // for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum+=matrix[1][j];
            }
            
        // }
        return sum;
    }

    public static void transpose_matrix(int arr[][])
    {
        int [][] transpose= new int [column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println(transpose[j][i]);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array=");
        int matrix[][]=new int [4][4];
        // int n=4, m=4;
        for (int i = 0; i < matrix.length; i++) {
            {
                for (int j = 0; j < matrix.length; j++) {
                    matrix [i][j]=sc.nextInt();
                }
            }
            
        }
        System.out.println(countArray(matrix));
        System.out.println(secondRowsum(matrix));
        transpose_matrix(matrix);
    }

}