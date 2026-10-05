package sorting1;

import java.util.ArrayList;
import java.util.Arrays;

public class Commanelement {
    public static void main(String[] args) {
        
         int[] a1={3,6,1,7,9,8,2,2};
         Arrays.sort(a1);
         int[] a2={9,7,3,4,9};
         Arrays.sort(a2);
         
         ArrayList<Integer> arr=new ArrayList<>();
int i=0;
int j=0;
         while(i<a1.length && j<a2.length){
          if(a1[i]==a2[j]){
            arr.add(a1[i]);
            i++;
            j++;
          }
          else if(a1[i]<a2[j]){
            i++;
          }else if(a1[i]>a2[j]){
            j++;
          }
         }
         System.out.println(arr);
    }
}
