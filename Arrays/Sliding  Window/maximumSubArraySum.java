class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        
        // Using sliding window concept we will solve thefollowing questions 
    
    if(N<K)
    {
        return -1;
    }
            int i=0;
            int j=0; 
            long currSum=0; 
            long maxSum=0;
            
            while(j<N)
            {
                currSum+=Arr.get(j);
                
                if(j-i+1<K)
                {
                    j++;
                }
                else if(j-i+1==K)
                {
                    maxSum= Math.max(currSum,maxSum);
                    currSum-=Arr.get(i);
                    i++;
                    j++;
                }
            }
    
        return maxSum;
    }
}