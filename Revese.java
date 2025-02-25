public class Revese {
    public static void revArr( int arr[], int start,int end){
        int n = arr.length;
        // int start = 0;
        // int end = n-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start+=1;
            end-=1;
        }

    }

    public static void main(String args[]){
           int arr[]={1,2,3,4,5,6};
           int n = arr.length;
           int k = 10e0;
           if(k>n){
            k= k%n;
           }
        //    revArr(arr,0,n-1);
        //    revArr(arr , 0 , k-1);           For rotating the array to right
        //    revArr(arr, k , n-1);
        revArr(arr ,0,k-1);
        revArr(arr, k, n-1);                // For rotating the array to left
        revArr(arr, 0,n-1);
         
         for(int i = 0 ; i< n ; i++){
            System.out.print(arr[i]);
         }
    }
}
