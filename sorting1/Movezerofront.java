package sorting1;

import java.util.Arrays;

public class Movezerofront {
  public static void main(String[] args) {
        int arr[]={0,-2,0,7,0,2,7};
         int j=arr.length-1;
         for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                arr[j--]=arr[i];
            }
         }
         while(j>=0){
            arr[j--]=0;
         }

        
        System.out.println(Arrays.toString(arr));
    }   
}
