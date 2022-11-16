package Array;
public class EqualOrNot {
    public static void main(String args[]){
  int   A[] = {1,2,5,4,0,9,11};
  int   B[] = {2,4,5,0,1};
  int equals=0;
  for(int i=0;i<A.length;i++){  
    for(int j=0;j<B.length;j++){
       if(A[i]==B[j]){
           equals=A[i];
           A[i]=B[j];
           equals=B[j];
       } 
    }
    System.out.print(equals);
}
    }}
