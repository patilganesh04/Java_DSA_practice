public class VerticallyFlippedAlphabetTriangle2 {
     
    public static void main(String[] args) {
        int n=5;
        int d=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
             for(int j=1;j<=i;j++){
                System.out.print( (char)(64+d)+" ");
               
            }
              d++;
 System.out.println();
        }
    }
}


