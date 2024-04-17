package OnlineQuestions;
public class ValueEqualToIndexValue {
    public static void main(String args[]){
        int arr[] = {1, 20, 3, 12, 5};
     int n=arr.length-1;
     for(int i=0;i<=n;i++){
         if(arr[i]==i+1){
             System.out.print(arr[i]+",");
         }
     }
    }
}
