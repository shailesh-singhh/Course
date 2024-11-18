import java.util.*;
public class Function {
    public static void printhelloworld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;



    }
    public static int  Product(int a , int b ){
        int mult = a*b;
         return mult;
    }
    public static void Swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    //  public static int sum(int a , int b){
    //     int sum = a+b;
    //     return sum;
    // }
    public static void main(String args[]){
      
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Numbers to be multiplied : ");
     int a = sc.nextInt();
     int b = sc.nextInt();

    
    int mult =  Product( a , b );
    System.out.println("The product of two number is : "+ mult);
    //  Swap(a, b);

    //  int sum = sum(a,b);
    //  System.out.println("Sum is "+ sum);


    }
}