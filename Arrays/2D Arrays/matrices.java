import java.util.Scanner;

public class matrices {

    public static boolean search(int matrix[][],int key)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j]==key){
                    System.out.println("Found at index="+i+ " "+j);
                    return true;
                }
                
            }
            
        }
        return false;
    }
    public static void main(String args[])
    {
        int matrix[][]=new int [3][3];
        Scanner sc= new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix [i][j]=sc.nextInt();
                
            }
            
        }

        search(matrix, 4);
    }
    
}
