
import java.util.Scanner;

public class Number_Sqaure {
   public static void main(String[] args) {
    Scanner sc1=new Scanner(System.in);
    System.out.println("Enter a number:" );
    int n=sc1.nextInt();
         for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print(j);
        }
        System.out.println();
      }
   } 
}
