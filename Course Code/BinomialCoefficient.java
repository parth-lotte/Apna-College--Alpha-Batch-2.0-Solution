public class BinomialCoefficient {
    public static int Factorial(int a)
    {
        int f=1;

        for(int i=1;i<=a;i++)
        {
            f*=i;
        }
        return f;
    }

    public static int binomialCoefficient(int n,int r)
    {
        int fact_n=Factorial(n);
        int fact_r=Factorial(r);
        int fact_nmr=Factorial(n-r);

        int bc= fact_n/(fact_r*fact_nmr);

        return bc;

    }
    public static void main(String args[])
    {
        int ans=binomialCoefficient(5, 2);
        System.out.println("The Coefficient is :"+ans);
    }
    
}
