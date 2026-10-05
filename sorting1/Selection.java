package sorting1;

import java.util.Arrays;

public class Selection {
    
   public static void main(String[] args) {
        int arr[]={5,-2,6,7,8,2,7};
         
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
                 
            } int t=arr[i];
                arr[i]=arr[min];
                arr[min]=t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
