package sorting1;

public class Sum_of_pair {
   public static void main(String[] args) {
         
        int arr[]={0,3,0,7,0,2,7};
        int i=0;
        int j=arr.length-1;
        int target=10;
        while(i<j){
            if(arr[i]+arr[j]==target){
               System.out.println(true); break;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
          
        } 
         
         
          
         
   } 
}
