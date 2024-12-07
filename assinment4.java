import java.util.*;
public class assinment4 {
    // public static void Average(int a ,int b, int c){
    //        int avg = (a+b+c)/3;
    //        System.out.println("The average of the three numbers is : "+avg);
    // }
    //  public static boolean isEven(int n){
    //         boolean e = true;
    //         if(n%2==0){
    //             e = true;
    //         }
    //         else{
    //             return false;
    //         }
    //         return e ;
    //  }
    public static void Panidrome(int n){
        int mn = n;
        int rev = 0;
      
        int rem = n%10;
        while(n!=0){
            rev = rev *rem+10;
        
            n = n/10;
        }
        if(mn == rev){
            System.out.println("Palindome ");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
    // public static void sumOfdigit(int n){
    //     int sum = 0;
    //     while(n>0){
    //         int ld = n % 10;
    //         sum = sum + ld;
    //         n = n/10;
    //     }
    //     System.out.println("The sum of the digits is : "+sum);
    // }
    public static void main(Strings args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the numbers to test even or not : ");
 int n = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();
//  Average(a, b, c);

// System.out.println(isEven(n));
Panidrome(n);

// sumOfdigit(n);
    }
}
