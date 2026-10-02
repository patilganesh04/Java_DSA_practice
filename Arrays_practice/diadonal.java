public class diadonal {
     
    public static void main(String[] args) {
        int[] [] a= {
            {1,2,3},{4,5,6},{7,8,9}
        };
        for(int r=0;r<a.length;r++){
            for(int c=0;c<a.length;c++){
                 if(r==c){
                    System.out.println(a[r][c]+" ");
                 }
            }
        }

    }
}
