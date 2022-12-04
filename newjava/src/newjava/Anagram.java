package newjava;
public class Anagram {
  public static void main(String args[]){
     char a[] = { 'g','r', 'a', 'm' };
      for(int i=0;i<=a.length-1;i++){
         int temp=a[i];
             System.out.print(temp);
      }
      {
                    System.out.println();

      }
      for(int j=a.length-1;j>=0;j--){
        int temp=a[j];
        
        System.out.print(temp);
      }
  }  
}
