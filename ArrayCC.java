import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class ArrayCC {
    // public static int linearSearch(int num[] , int key){
    //     for(int i = 0 ; i<=num.length ;i++){
    //         if(num[i]==key){
    //            return i;
    //         }
    //     }
    //     return -1;
    // }
    public static int getLargest(int num[] ){
       int larg = Integer.MIN_VALUE;
        for(int i = 0 ; i <= 5; i++){
            if(num[i]>larg){
                larg=num[i];
            }
            else{
                continue;
            }

        }
     return larg;
    }
    public static void main(String args[]){
    //     int marks [] = new int[50];
    //     // int num[] ={2,4,6,6,7};''
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the size of the array : ");
    //     int n = sc.nextInt();
    //     System.out.println("Enter the marks :");
    //     for(int idx = 0 ; idx<= n; idx++){
    //          marks [idx] = sc.nextInt();
    //     }
    //     for(int i = 1; i<=n ; i++ ){
    //         System.out.println("Marks of SUbject no."+i+" = "+marks[i] );
    //     }
    //     System.out.println("The length of the array is :"+ marks.length);

        int num[] = {1,2,6,3,5};
    //     int key = 20 ;
    //    int index = linearSearch(num, key);
    //     if(index == -1){
    //         System.out.println("Not Found");
    //     }
    //     else{
    //         System.out.println("The key is at index "+ index);
    //     }
     
   int largest= getLargest(num) ;
   System.out.println("The largest is :"+largest);

     }
     
}
