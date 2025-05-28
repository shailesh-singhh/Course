import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void swap(ArrayList<Integer> list ,int idx1 , int idx2){
        int temp = list.get(idx1);
        list.set(idx1 , list.get(2));
        list.set(idx2 , temp);
    }
    public static void main(String args[]){
        ArrayList<ArrayList> mainlist = new ArrayList<>();
          ArrayList<Integer> list1 = new ArrayList<>();
          list1.add(1);
          list1.add(2);
          list1.add(3);
          list1.add(4);
          list1.add(5);
          mainlist.add(list1);
           ArrayList<Integer> list2 = new ArrayList<>();
           list2.add(2);
           list2.add(4);
           list2.add(6);
           list2.add(8);
           list2.add(10);
           mainlist.add(list2);
           ArrayList<Integer> list3 = new ArrayList<>();
            list3.add(3);            
            list3.add(6);
            list3.add(9);
            list3.add(12);
            list3.add(15);
            mainlist.add(list3);
    for(int i = 0 ; i<mainlist.size();i++){
        ArrayList<Integer>currlist = mainlist.get(i);
        for(int j = 0 ; j< currlist.size();j++){
            System.out.print(currlist.get(j)+" ");
        }
        System.out.println();
    }
        //    System.out.println(list);
        //    list.add(2,5);
        //    System.out.println(list);
        //    //Getting the element at 4;
        //    list.get(4);
        //    System.out.println(list.get(2));
        // list.remove(2);
        // list.set(2,10);
        // System.out.println(list);
        // System.out.println(list.size());
        // for(int i=0; i<list.size();i++){
        //     System.out.println(list.get(i));
        // }
    
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);
        // int n = list.size();
        // int max = Integer.MIN_VALUE;
        // for(int i = 0 ; i<n ; i++){
        //     // if(list.get(i)>max){
        //     //     max = list.get(i);
        //     // }
        //     max = Math.max(max , list.get(i));
        // }
        // System.out.println(max);
        // for(int i=n-1; i>=0 ;i--){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        // Swapp two numbers 

        // int temp = list.get(1);
        // list.set(1,list.get(2));
        // list.set(2,temp);
        // System.out.println(list);
        //     int idx1 = 1;
        //     int idx2=3; 
        //     System.out.println(list);
        // //  swap(list ,idx1 , idx2);
        // //  System.out.println(list);
        //  Collections.sort(list);
        //  System.out.println(list);
 
        //  Collections.sort(list,Collections.reverseOrder());
        //  System.out.println(list);

    }
}
