public class towerofHanoi {
    public static void towerHanoi(int n, String src, String help, String dest)
    {
        // int size=0;
        if(n==1)
        {
            System.out.println("Transfer disk "+ n + " From "+ src + " to " + dest);
            // size++;
            return ;
        }
        towerHanoi(n-1, src, dest, help);
        // size++;
        System.out.println("Transfer disk "+ n + " From "+ src + " to " + dest);
        towerHanoi(n-1, help, src, dest);
        // size++;
    }
    public static void main(String args[]) {
        int n=3;
        // int size=0;
        towerHanoi(n, "S", "H","D");
        // System.out.println("Total Steps "+ size );
    }
    
}
