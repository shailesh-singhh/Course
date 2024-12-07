import java.util.*;
public class Assinment2 {
    public static void main(Strings args[]){
    
        // int a=5;
        // int b=6;
        // int c = 15;                                  QUESTION 1
        // float avg=(a+b+c)/3;
        // System.out.println("Average is :"+avg);
         
        // Scanner sc = new Scanner(System.in);
        //   System.out.println("Input the first number : ");
        //   float a = sc.nextInt();
        //   System.out.println("Input the second number : ");
        //   float b = sc.nextInt();
        //   int $=5;                                                     Question 2
        //   System.out.println($);
        // float area = a*b;
        // System.out.println("The area is :"+area);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pencil: ");
        float a = sc.nextFloat();
        System.out.println("Enter the price of pen : ");
        float b = sc.nextFloat();
        System.out.println("Enter the price of erase :");
        float c = sc.nextFloat();
        float total ;
        total = a+b+c;
        float gst ;
        gst = total*18/100;
        System.out.println("The total bill  with gst :"+total);

    }
}
