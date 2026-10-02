public class Flipped_Alphabet_Triangle {
     public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++ ){
            for(int j=1;j<=n+1-i;j++){
            System.out.print((char)(96+j)+" ");
            }
            System.out.println();
        }
    }
}
