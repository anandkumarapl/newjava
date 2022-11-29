package Array;
public class potdtoday {
    public static void main(String args[]){
        int a[]={10,0,9,11,15,17,19,0,1};
        int n=a.length;
        int i;
        for(i=0;i<n;i++){
            System.out.print(i);
        }
        n+=1;
       int p0=-1;
        if(a[i]<a[i-1]){
            System.out.print(a[i]+""+a[i-1]);
        }
        int p1=i-1;
        int length=p1-p0;
        System.out.print(p1);
        }
}
