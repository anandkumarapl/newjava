package Pattern;
public class Prymid {
 public static void main (String args[]){
int n=5;
int space=0;
for(int i=1;i<=n;i++){
    for(space=n;space>=i;space--){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("*" +" ");
    }
     System.out.println(" ");
}
 }
 }
