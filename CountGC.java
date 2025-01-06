import java.util.*;
public class CountGC {
    public static int counter(int days){
        int cnt = 0;
          if(days%8 == 0){
            cnt=cnt+1;
          }
          int award = 0;
          award = days -cnt +cnt*8;

          return award;
    }
public static void main(String args[]){

    System.out.println(counter(8)*10);
}
}
