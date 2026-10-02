public class Alphabet_Triangle2 {
   public static void main(String[] args) {

       int n=4;
        for(int i=0;i<n;i++ ){
            for(int j=0;j<=i;j++){
                 int l=65+j;
                System.out.print( (char) l + " ");
            }
            System.out.println();
        }
    }  
}
