package sorting1;

import java.util.Arrays;

public class Moveallzero {
    public static void main(String[] args) {
        int arr[]={0,-2,0,7,0,2,7};
        //  int j=0;
        //  for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=0){
        //         arr[j++]=arr[i];
        //     }
        //  }
        //  while(j<arr.length){
        //     arr[j++]=0;
        //  }

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(i!=j){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
