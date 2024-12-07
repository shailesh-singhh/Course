import java.util.*;
public class maxSumArray {
    public static void MaxSum(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int prefix[] = new int[arr.length];
            prefix[0] = arr[0];
        // calculate prefix array
        for(int i = 1  ; i<prefix.length ; i++){
            prefix[i] =prefix[i-1] + arr[i];
        }
                for(int i = 0 ; i<arr.length ; i++){
            int start = i ;
            for(int j = i ; j<arr.length ; j++){
                int end = j;
             cs = start==0 ? prefix[end] : prefix[end] - prefix[start -1];
            if(ms < cs){
                ms = cs;
            }
            
        }
       
    }
    System.out.println("Max sum  = "+ ms);
    }
    public static void KadaneAlgo(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currmax = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
           currmax = currmax + arr[i];
           if(currmax < 0){
            currmax = 0;
           }
           maxsum = Math.max(currmax,maxsum);
        }
        System.out.println("The max sum is : "+maxsum);
    }
    public static void main(Strings args[]){
        int arr [] ={-2, -3, 4, -1, -2, 1, 5, -3};
        KadaneAlgo(arr);
    }
}
