import java.util.ArrayList;
import java.util.Collections;

public class Addingone {
    
    public static void main(String[] args) {
        int arr[]={9,9,9};

        String n="";
        for(int i=0;i<arr.length;i++){
              n+=arr[i];
        }
        int num= Integer.parseInt(n)+1;
       
 ArrayList<Integer> arr1 = new ArrayList<>();

while (num != 0) {
    int rem = num % 10;
    arr1.add(rem);
    num /= 10;
}

Collections.reverse(arr1);

System.out.println(arr1);
        

      
}

 

 
}
