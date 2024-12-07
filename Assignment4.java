import java.util.*;
public class Assignment4 {
    public static void CountSevens(int arr[][]){
        int count = 0;
        for(int i = 0 ; i< arr.length; i++){
            for(int j = 0 ; j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void Sum(int arr[][]){
        int ad = 0;
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0 ; j<arr[0].length ; j++){
                if(i != 0 && i != arr.length-1){
                    ad = ad +arr[i][j];
                }
            }
        }
        System.out.println(ad);
    }
    public static void Transpose(int arr[][]){
        
    }
    public static void main(Strings args[]){
            int arr[][]={{1,4,9},{11,4,3}};
            // CountSevens(arr);
            Sum(arr);
    }
}
