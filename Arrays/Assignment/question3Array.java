public class question3Array {

    public static int stockPrices(int prices[])
    {
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(buy<prices[i])
                {
                    profit=Math.max(prices[i]-buy,profit);

                }
                else 
                {
                    buy=prices[i];
                }
        }
        return profit;
    }

    public static void main(String args[])
    {
        int prices []={10,20,30,50,60,90};
        System.out.println("The answer is:" +stockPrices(prices));

    }
    
}
