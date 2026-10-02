public class Binary_Triangle {
    public static void main(String[] args) {
         int n=5;
         int l =1;
        for(int i=1;i<=n;i++ ){
              
            for(int j=1;j<=i;j++){
            if(i==j || (i+j)%2==0){
                System.out.print(1+" ");
            }else{
                System.out.print(0+" ");
            }
            }
            System.out.println();
    }
}
}