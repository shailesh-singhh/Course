import java.util.*;
public class OpArray {

    // public static int LarNum(int number[]){
    //     int largest = Integer.MIN_VALUE;
    //     for(int i = 0 ; i<number.length ; i++){
    //         if(largest < number[i]){
    //             largest = number[i];
    //         }
    //     }
    //     return largest;
    public static int BinarySearch(int num [], int key){
        int start = 0;
        int end = num.length -1;
        int mid = (start+end)/2;
        while (start <= end) {
            if(num[mid]==key){
                  return mid;
            }
            else if (num[mid] < key) {
                start = mid +1;
                
            }
            else{
                end = mid - 1;
            }
             
        }
        return -1;
    }
    public static void main(String args[]){
    //     int number [] = {1,2,3,6,4,5};
    //   int res = LarNum(number);
    //   System.out.println("The largest of the array is : "+res);
    // }

    int num[]={2,4,6,8,10,12,14};
    int key = 10;
    int res = BinarySearch(num, key);
    System.out.println("The element is at "+res);
  }
    
}
