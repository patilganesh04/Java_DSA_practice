public class sumof {
     
    public static void main(String[] args) {
        
    
    int[] [] a= {
            {1,2,3},{4,5,6},{7,8,9}
        };
        int sum=0;
        for(int r=0;r<a.length;r++){
            for(int c=0;c<a.length;c++){
          sum=sum+a[r][c];                
        }
}
System.out.println("sum is:"+sum);
}

}