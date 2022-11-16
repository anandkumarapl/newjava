package Pattern;
public class Daimoond {
    public static void main(String args[]){
        int i,j,space=0;
        for(i=0;i<=5;i++){
            for(space=5;space>=i;space--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out .print("*"+" ");
            }
             System.out .println();
        }
        for(i=4;i>=0;i--){
            for(space=i;space<=5;space++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out .print("*"+" ");
            }
             System.out .println();
        }
        }
    }
