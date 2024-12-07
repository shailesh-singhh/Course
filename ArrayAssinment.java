import java.util.*;
public class ArrayAssinment {
    public static void Distinct(int arr[]){
        boolean istrue = true;
        for(int i = 0 ; i<arr.length; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                   if(arr[i]==arr[j]){
                    istrue=false;
                   }
                   else{
                   istrue = true;
                   }
            }
          
        }
        System.out.println(istrue);
       
    }
    public static void main(Strings args[]){
        int arr[]= {1,2,3,4};
        Distinct(arr);
    }
}
