package Array;
public class S00tring {
public static void main(String args[]){
String []names ={"Virendra Sehwag", "Sachin Tendulkar", "Rahul Dravid", "Sourav Ganguly"};
int n=names.length-1;
for(int i=0;i<=n;i++){
    if(n<=1 || n>=names.length){
        System.out.println("bound of array");
    } else {
        System.out.println(names[i]);
    }
}
}    
}
