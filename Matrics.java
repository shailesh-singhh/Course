import java.util.*;
public class Matrics {
    public static void Search(int matrics[][] ,int key){
          for(int i = 0 ; i < matrics.length ; i++){
            for(int j = 0 ; j < matrics[0].length; j++){
                if(matrics[i][j]==key){
                    System.out.println(i+" "+j);
                }
            }
          }
    }
    public static void spiralMatrix(int matrics[][]){
        int n = matrics.length;
        int m = matrics[0].length;
   int startRow = 0;
   int endRow = n-1;
   int startColumn = 0;
   int endColumn = m-1;
   while(startRow <= endRow && startColumn <= endColumn ){
    //top
         for(int j = startColumn ; j <= endColumn;j++ ){
            System.out.print(matrics[startRow][j]+" ");
         }
         
         //right
         for(int i = startRow+1 ; i<= endRow ;i++){
            System.out.print(matrics[i][endColumn]+" ");
         }
          //bottom
          for(int j = endColumn-1; j >= startColumn  ;j--){
            if(startRow == endRow){
                break;
            }
            System.out.print(matrics[endRow][j]+" ");
          }

          //Left 

          for(int i = endRow-1; i>=startRow+1; i--){
            if(startColumn == endColumn){
                break;
            }
            System.out.print(matrics[i][startColumn]+" ");
          }
               startRow++;
               endRow--;
               startColumn++;
               endColumn--;

      }
      System.out.println();
    }
    public static int digonalSun(int matrics[][]){
        int sum = 0;
        // for(int i = 0 ; i <matrics.length ; i++){
        //     for(int j = 0 ; j < matrics[0].length ; j++){
        //         if(i == j){
        //             sum += matrics[i][j];                  BRUTEFORCE CODE
        //         }
        //        else if(i+j == matrics.length-1){
        //         sum += matrics[i][j];
        //        }
        //     }
        // }
        for(int i = 0 ; i<matrics.length; i++){
            sum += matrics[i][i];
            if(i != matrics.length-1-i){
                sum += matrics[i][matrics.length-i-1]; 
            }
        }
        return sum;
    }
    public static boolean stairCaseSearch(int matrics[][], int key){
        int row = 0; int col = matrics.length-1;
        while(row < matrics.length && col >= 0){
            if(matrics[row][col] == key){
                System.out.println("Found key at ("+row +","+col +")");
                return true;
            }

            else if(key < matrics[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found !");
        return false;
    }
    public static void main(String args[]){
        int matrics [][] = {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};
                            int key = 33;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the elements of the matrics ");
        // int n = 3;
        // int m = 3;
        // for(int i = 0 ; i < n; i++){
        //     for(int j = 0 ; j < m ; j++){
        //         matrics[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("The entered elements are as follows: ");
        // for(int i = 0 ; i<n ; i++){
        //     for(int j = 0 ; j<m ; j++){
        //         System.out.print(matrics[i][j]+" ");
        //     }
        //     System.out.println();
        // }
       
        // System.out.println("Enter the number to be searched : ");
        // int key=sc.nextInt();
        // Search(mat rics, key);
          

        // spiralMatrix(matrics);
        // System.out.println(digonalSun(matrics));
        stairCaseSearch(matrics, key);

    }
}
