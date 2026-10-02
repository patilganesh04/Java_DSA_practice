public class Capital_Small_Alphabet_Square {
    public static void main(String[] args) {
         int n=4;
        for(int i=0;i<n;i++ ){
            for(int j=0;j<n;j++){
                 int l=65+i;
                 int m=97+i;
             if(i%2==0){
                System.out.print( (char) m + " ");}
                else{
                    System.out.print( (char) l + " ");} 
                }
                System.out.println();
            }
             
        } 
    }

