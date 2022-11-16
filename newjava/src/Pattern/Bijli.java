package Pattern;
public class Bijli {
    public static void main(String args[]){
       int n=5;
       for(int i=1;i<=n;i++){
           for(int space=n-1;space>=i;space--){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
                System.out.print("*");
           }
            System.out.println();
        }
       for(int i=n;i>=1;i--){
           for(int space=1;space<=n;space++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
                System.out.print("*");
           }
            System.out.println();
    }
}
}
