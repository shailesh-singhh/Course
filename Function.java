import java.util.*;
public class Function {
    // public static void printhelloworld(){
    //     System.out.println("Hello World");
    //     System.out[].println("Hello World");
    //     return;
    // }

    public static boolean IsPrime(int n){
        if(n==2){
            return true;
        }
        boolean isprime = true;
        for(int i = 2 ; i <= Math.sqrt(n)  ;i++){
            if(n%i == 0){
                isprime= false;
                break;
            }
        }
        return isprime;
    }
    public static void primeInrange(int n){
        for(int i = 2 ;i <= n ;i++){
            if(IsPrime(i)== true){
                System.out.println(i);
            }
            else{
                continue;
            }
         }
         
    }
    // public static int sum(int a , int b ){
    //     return a+b;
    // }
    //  public static float sum(float a , float b){
    //     return a+b;
    //  }
    // public static int Fact(int num){
    //     int f =1 ;
    //     for(int i = 1; i<=num; i++){
    //         f= f*i;
    //     }
       
    //     return f;
    // }
    // public static int binCoeff(int n , int r){
    //     int nfact = Fact(n);
    //     int rfact = Fact(r);
    //     int nrfact = Fact(n-r);
    //     int bin = nfact/(rfact*nrfact);
    //      return bin;

    // }
    // public static int  Product(int a , int b ){
    //     int mult = a*b;
    //      return mult;
    // }
    // public static void Swap(int a , int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("a = "+a);
    //     System.out.println("b = "+b);
    // }
    //  public static int sum(int a , int b){
    //     int sum = a+b;
    //     return sum;
    // }
    public static void main(String args[]){
      
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the Numbers to find the binomial Expression : ");
    // // int num = sc.nextInt();
    // int n = sc.nextInt();
    // int r = sc.nextInt();

    // int bin = binCoeff(n, r);
    // System.out.println("The binomial is : "+bin);
    //  int a = sc.nextInt();
    //  int b = sc.nextInt();

    
    // int mult =  Product( a , b );
    // System.out.println("The product of two number is : "+ mult);
    //  Swap(a, b);

    //  int sum = sum(a,b);
    //  System.out.println("Sum is "+ sum);
    // System.out.println(Fact(num));

    // System.out.println(sum(5,6));
    // System.out.println(sum(5.6f,8.9f));

    // System.out.println("Enter the number to check the number " );
    // int n = sc.nextInt();
    // System.out.println(IsPrime(n));
    System.out.println("Enter the number till where you want to find the prime :");
     int n = sc.nextInt();
     primeInrange(n);
    }
}