import java.util.*;
public class Calculator {
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number :");
    int a = sc.nextInt();
    System.out.println("Enter the second Number: ");
    int b = sc.nextInt();
int sum = a+b;
int dif = a-b;
int mul = a*b;
float rem = a/b;
int mod = a%b;
     System.out.println("Select the opertion to be performed = 1-Add;  2-Subtract   , 3- multiply , 4-Divide ,-modulo :-");
     
     int op = sc.nextInt();
     switch (op) {
            case 1: System.out.println("The sum is :"+sum);
            
            break;
            case 2: System.out.println("The diffrence is :"+dif);
            
            break;    
            case 3: System.out.println("The multiplication is :"+mul);
            
            break;
            case 4: System.out.println("The division is :"+rem);
            
            break;
            case 5: System.out.println("The Modulus is :"+mod);
            
            break;
        default:System.out.println("No option is selected");
            break;
     }
   }
}
