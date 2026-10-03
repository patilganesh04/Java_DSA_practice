import java.util.Arrays;

class Segregate_0sand_1s{
    public static void main(String[] args) {
     int arr[]={0, 0, 1, 1, 0};
     int low=0;
     int high=arr.length-1;
     while(low<high){
        while(arr[low]==0 && low<high){
            low++;
        }
          while(arr[high]==1 && low<high){
            high--;
        }
        if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
     }
     System.out.println(Arrays.toString(arr));
    }

}