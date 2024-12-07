import java.util.*;
public class Strings {
    public static void printLetters(String str){
        for(int i = 0 ; i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println(); 
    }
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i = 0  ; i < n/2 ; i++){
             if(str.charAt(i) == str.charAt(n-i-1)){

             }
             else{
                return false;
             }
        }
        return true;
    }
    public static float shortestPath(String path){
        int x = 0 ;
        int y = 0;
        for(int i = 0 ; i < path.length(); i++){
         char dir = path.charAt(i);
          
         //SOUTH

            if(dir =='S'){
                   y--;
            }

            //NORTH

            else if(dir == 'N'){
                y++;
            }

            // WEST
            else if(dir == 'W'){
                x--;
            }

            //EAST

            else {
                x++;
            }
        }
        int x2 = x*x;
        int y2= y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        // char arr[]={'a','b','c','d'};
        // Strings str = "abcd";
        // Strings str2 = new String"xyz");

    //     System.out.println("Enter Your name :"); 

    //     Scanner sc = new Scanner(System.in);
       
    //    String name = sc.nextLine();
    //    System.out.println(name.length());
    // String fname = "Shailesh";
    // String lname = "Singh";
    // String fullname = fname+" "+lname;
    // System.out.println(fullname.charAt(2));

//  printLetters(fullname);
// String str = "NooN";
// System.out.println(isPalindrome(str));
String path = "WNEENESENNN";
System.out.println(shortestPath(path));
    }
    
}
 