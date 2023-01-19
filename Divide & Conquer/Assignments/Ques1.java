public class Ques1
{
    public static String [] mergesort(String [] arr, int lo, int hi)
    {
        if(lo==hi)
        {
            String [] A= {arr[lo]};

            return A;

        }

        int mid = lo +(hi-lo)/2;
        String [] arr1= mergesort(arr, lo, mid);
        String [] arr2= mergesort(arr1, mid+1, hi);
        String [] arr3= merge(arr1,arr2);
        return arr3;
    
    }
         static String[] merge(String []arr1, String []arr2)
        {
            int m=arr1.length;
            int n=arr2.length;

            String [] arr3 = new String[m+n];

            int i=0;
            int j=0;
            int idx=0;

            while(i<m && j<n)
            {
                if(isalphabetically(arr1[i], arr2[j]))
                {
                    arr3[idx]=arr1[i];
                    i++;
                    idx++;
                }
                else
                {
                    arr3[idx]=arr2[j];
                    j++;
                    idx++;
                }
            }
            while(i<m){
                arr3[idx]=arr1[i];
                    i++;
                    idx++;
            }
            while(j<m){
                arr3[idx]=arr1[i];
                    j++;
                    idx++;
            }
            return arr3;
        }

    public static boolean isalphabetically(String str1, String str2 )
    {
        if(str1.compareTo(str2)<0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args)
    {
        String [] arr={"mouse","Apple","Mice","Lion"};
        String [] a = mergesort(arr, 0, arr.length-1);
        for(int i=0;i<a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}


