import java.util.*;
public class Assinment3 {
    public static void main(Strings args[]){
      //   Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // if(a>=0){
        //     System.out.println("Positive");
        // }
        // else{
        //     System.out.println("Negative");
      //   double temp = 103.5;
      //        if(temp>100){
      //           System.out.println("You have fever");
      //        }
      //        else{
      //           System.out.println("You don't have a fever");
      //        }

      // System.out.println("Enter the day number : ");
      // int day = sc.nextInt();
      // switch (day) {
      //    case 1:System.out.println("Today is Monday ");
            
      //       break;
      //       case 2:System.out.println("Today is Tuesday ");
            
      //       break;
      //       case 3:System.out.println("Today is Wednesday ");
            
      //       break;
      //       case 4:System.out.println("Today is  Thursday");
            
      //       break;
      //       case 5:System.out.println("Today is Friday ");
            
      //       break;
      //       case 6:System.out.println("Today is Saturday ");
            
      //       break;
      //       case 7:System.out.println("Today is Sunday ");
            
      //       break;
      //    default:System.out.println("Enter correct day number :");
      //       break;
      // }

      // System.out.println("Enter the year :");
      // int year = sc.nextInt();

      // if(year%4==0 || year%100 == 0 || year%400==0){
      //    System.out.println("The year is a leap year ");
      // }
      // else{
      //    System.out.println("It is not a leap year.");
      // }
              
              Scanner sc = new Scanner(System.in);
            //   int odd=0;
            //   int even = 0;
            //   System.out.println("Enter the number of set upto 10 numbers");
            //   for(int i = 1;i<=10;i++){
            //    int num = sc.nextInt();
            //    if(num%2==0){
            //       even+=num;
            //    }
            //    else{
            //       odd+=num;
            //    }
            //   }
            //   System.out.println( "Sum of odd terms are "+odd);
            //   System.out.println("The sum of even terms are "+even);

// System.out.println("Enter the number whose factorial is to be calculated :");
//         int n = sc.nextInt();
//          int fact = 1;
//         for(int i=n; i>=1; i--){                        FACTORIAL OF A NUMBER
//              fact*=i;
//         }
//         System.out.println("The factorial of "+n+" is: "+fact);

int tb = 0;
System.out.println("Enter the number whose table you want to print : ");
int n = sc.nextInt();
for(int i = 1; i <= 10; i++){
   tb=n*i;
   System.out.println(n+" * "+i+" = "+ tb);
}




           


      
    }

}
