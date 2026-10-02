public class matrixeachcol {
    public static void main(String[] args) {
         int[] [] a= {
            {1,2,3},{4,5,6},{7,8,9}
        };
    for(int c=0;c<a[0].length;c++){ 
        int sum=0;
        for(int r=0;r<a.length;r++){
            sum+=a[r][c];
            }
            System.out.println("sum of column is:"+ sum);
        }

    }
}
