import java.util.Arrays;
import java.util.Collections;
public class SortingAlgorithms {
    public static void bubbleSort(int arr[]){
        for(int turn = 0 ; turn < arr.length-1;turn++){
             for(int j = 0 ; j< arr.length-1-turn ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp; 
                }
             }
        }
    }
    public static void printArr(Integer arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void selectionSort(int arr[]){
       
      for(int i = 0 ; i<arr.length-1;i++){
        int smallest = i;
       for(int j =i+1 ; j<arr.length;j++){
        if(arr[smallest]<arr[j]){
            smallest = j;
        }
       }
    int temp = arr[smallest];
    arr[smallest] = arr[i];
    arr[i] = temp; 
      }
    }
    public static void insertionSort(int arr[]){
          for(int i = 1 ; i < arr.length ; i++){
            int curr = arr[i] ;
            int prev = i-1;
            while(prev >= 0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //INSERTION

            arr[prev+1] = curr;
          }
    }
    public static void main(String args[]){
        Integer arr[] = {5,4,1,3,2};
        //insertionSort(arr);

        // Arrays.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
}
 