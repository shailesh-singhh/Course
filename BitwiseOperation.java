import java.util.*;
public class BitwiseOperation {
    public static void oddOrEven(int n ){
        int bitMask = 1;
        if( (n & bitMask) == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void GetithBit(int n ,int i){
        int bitmask = 1<<i;
        int ithbit = n & bitmask ;
        int bit = 0;
        if(ithbit > 0){
              bit = 1;
        }
        else{
            bit = 0;
        }
        System.out.println(bit);
    }
    public static int setBit(int n, int i){
        int bitmask = 1<<i;

        int setbit = n | bitmask;
        return setbit;
    }
    public static int  clearBit(int  n , int i){
        int bitmask = ~(1<<i);
        return n & bitmask; 
    }
    public static int Updatebit(int n  , int i , int newbit ){
        if(newbit==0){
            return clearBit(n, i);
        }
        else{
            return setBit(n, i);
        }
    }
    public static int clearLastiBit(int n , int i ){
        int bitmask = (~0) << i;
        return ( n & bitmask) ;
    }
    public static int clearInrange(int n , int i , int j ){
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;
        int bitmask = a|b;
         return (n & bitmask);

    }
    public static void checkPower( int n ){
        if((n & (n-1))==0){
            System.out.println("It is a power of 2");
        }
        else{
            System.out.println("It is not a power of 2");
        }
    }
    public static int countSetBits(int n ){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
          n = n >> 1;
        }
        return count;
    }
    public static void fastexpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n & 1 ) != 0){
                ans = ans *a;
            }
            a = a*a;
            n = n>>1;
        }
        System.out.println(ans); 
    }
    public static void main(String args[]){
        //  System.out.println((6>>2 ));
        // oddOrEven(56);
        // GetithBit(15, 2);
        // setBit(10, 2);
        // System.out.println(Updatebit(10 , 2,1 ));

    //    System.out.println(clearLastiBit(15, 2));
    //  System.out.println(clearInrange(10, 2, 4));

    // checkPower(11);
    // System.out.println(countSetBits(15));
    fastexpo(3, 5);

    }
}
