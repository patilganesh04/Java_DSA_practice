package sorting1;

import java.util.Arrays;

public class kthsmallest {
     public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
         int k=2;
        for(int i=0;i<k;i++){
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
         System.out.println(arr[k-1]);
    }
}
