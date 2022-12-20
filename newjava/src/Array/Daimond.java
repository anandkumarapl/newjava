package Array;
public class Daimond {
   public static void main(String args[]){
      int i,j,space,n=4;
      for(i=1;i<=n;i++){
         for(space=n;space>=i;space--){
              System.out.print(" ");
         }
         for(j=1;j<=i;j++){
              System.out.print("*"+" ");
         }
         System.out.println(" ");
      }
       for(i=n-1;i>=1;i--){
           for(space=i;space<=n;space++){
               System.out.print(" ");
           }
           for(j=1;j<=i;j++){
               System.out.print("*"+" ");
           }
           System.out.println(" ");
       }
   }
}
      
   

