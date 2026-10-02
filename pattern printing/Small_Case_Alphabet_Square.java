public class Small_Case_Alphabet_Square {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++ ){
            for(int j=0;j<n;j++){
                 int l=97+j;
                System.out.print( (char) l + " ");
            }
            System.out.println();
        }
    }
}
