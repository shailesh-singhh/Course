import java.util.*;
public class RevArray {
    public static void Reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;
        while(first<last){
          int temp = numbers[last];
          numbers[last] = numbers[first];
          numbers[first] = temp;
          first++;
          last--;
        }
    }
    public static void printPairs(int numbers[]){
      for(int i = 0; i<numbers.length; i++){
      int curr = numbers[i]; // 2,4,6,8,10
for(int j = i+1; j<numbers.length ; j++){
     System.out.print("("+curr+","+numbers[j]+")");
      }
      System.out.println();
    }
  }
  public static void printSubarrays(int numbers []){
    int ts = 0;
                 for(int i = 0 ; i < numbers.length ; i++){
                  int start = i;
            
                  for(int j = i ; j<numbers.length; j++){
                    int end = j;
                    for(int k = start ;k <= end; k++ ){
                         System.out.print(numbers[k]+" ");
                    }
                    ts++;
                    System.out.println();
                  }
                  System.out.println();
                 }
                 System.out.println("Total sub arrays : "+ts);
  }
    public static void main(Strings args[]){
      int numbers[]={2, 4, 6, 8, 10};
      // Reverse(numbers);
      // for(int i = 0; i<numbers.length ;i++){
      //   System.out.print(numbers[i]+" ");
      // }
      // System.out.println();
      // printPairs(numbers);
      printSubarrays(numbers);
    }
}
