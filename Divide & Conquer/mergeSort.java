public class mergeSort{
    public static void mergesort(int arr[], int si,int end) {
         if(si>=end){
            return;
        }
        int mid= si+(end-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, end);
        merge(arr, si, mid, end);
        // return 0;
    }

    public static void merge(int arr[],int si,int mid,int end){
        int i=si;
        int j=mid+1;
        int k=0;
        int temp[]= new int[end-si+1];
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        for( k=0,  i=si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
            
        }
    }

    public static void main(String [] args)
    {
        int arr[]={2,3,8,2,3,4,8,7,9,65,2};
                // System.out.println(arr);
                mergesort(arr, 0, arr.length-1);
                printArr(arr);
        // System.out.println(mergesort(arr, 0, arr.length-1));
    }
}