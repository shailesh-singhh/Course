import java.util.*;
public class Loop {
    public static void main(Strings args[]){
      
        // int n =1;
        // while(n<=count){
        //     System.out.print(n +" ");
        //     n++;
        // }
         
        // int i = 1;                                    WHILE LOOP
        // int sum = 0;

        // while(i<=n){
        //     sum +=i;22
        //     i++;
        // }

        //   System.out.println("The sum of first "+n+" Natural number is "+sum);
       
            
        // for(int i = 1 ; i<=n ; i++){
        //     System.out.println("Hello World");
        // }
        
    //  for(int i =1;i<=line;i++){
    //     System.out.println("****");
    //  }
        
    // int i=1;
    // while(i<=line){
    //     System.out.println("*****");
    //     i++;
    // }
     //    
     //                      Reverse a number 


        // while(number>0){
        //     int lastdigit=number%10;
        //     number=number/10;
        //     System.out.print(lastdigit);
        // }
        //    int rev = 0;
        // while(number>0){
        //     int lastdigit = number%10;
        //     number = number/10;
        //      rev = (rev*10)+lastdigit;
        // }
        // System.out.println(rev);

        //  DO WHILE LOOP

        // int counter = 1;

        // do{
        //     System.out.println(counter);
        //     counter ++;
        // }while(number>=counter);

    //    do{
    //     int a = sc.nextInt();
    //     if(a % 10 == 0 ){
            
    //         continue;
    //     }
        // if(a%10==0){
        //     break;
        // }
    //     System.out.println(a);
    //    }while(true);
        //   System.out.println("Multiple of 10 , So out of the loop");
       
        // if(number==0 || number ==1){
        //     System.out.println("Not a prime number ");
        // }
        // else{
        //     for(int i = 2 ;i<number-1;i++){
        //        if(number % i == 0){
        //         System.out.println("Not a Prime Number");
        //        }
        //        else{
        //         System.out.println("It is a Prime number.");
        //        }
        //     }
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be checked :");
        int number =  sc.nextInt();
       boolean isPrime = true;
       for(int i = 2 ; i<=number ; i++){
        if( number % i == 0){
            isPrime=false;
        }
       }
       if(isPrime == true){
        System.out.println("It is a Prime Number.");
       }
       else{
        System.out.println("Not a Prime Number");
       }
    }
}
