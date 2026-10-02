public class Sumofdiagno {
    public static void main(String[] args) {
         int[] [] a= {
            {1,2,3},{4,5,6},{7,8,9}
        };
        int sum1=0;
        int sum2=0;
        for(int i=0;i<a.length;i++){
             sum1=sum1+a[i][i];
             sum2+=a[i][a.length-1-i];
        
            }
         System.out.println("sum of diagnol:"+sum1);
         System.out.println("sum of antidiagnol:"+sum2);

        }
}
