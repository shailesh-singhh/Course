import java.util.*;
public class Question{
public static int trappedRainwater(int height[]){
int n = height.length;
    // Calculate the left max boundary
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for(int i = 1 ; i<n; i++){
         leftMax[i]=Math.max(height[i], height[i-1]);
    }
    //calculate the  right max boundry
    int rightMax []= new int [n];
    rightMax[n-1] = height[n-1];
    for(int i = n-2; i>=0 ; i--){
        rightMax[i]=Math.max(height[i], rightMax[i+1]);
    }
     //loop
       int trappedWater = 0;
     for(int i = 0 ; i<n ; i++){
        //waterlevel = min(leftmax bound , rightmax bound)
      int waterLevel = Math.min(leftMax[i],rightMax[i]);
         //trapped water = waterLevel - height[i];
      trappedWater+=waterLevel-height[i];
     }
     
  return trappedWater;
}



    public static void main(Strings args[]){
        int height [] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}
