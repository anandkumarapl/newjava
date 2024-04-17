
package problems;
public class max {
    public static void main(String args[]){
        int a[]={3,2,49,45,60,1,1,70};
        
    int max=a[0];
        for (int i = 0; i <= a.length-1; i++)
            if (a[i] > max)
                max = a[i];
        System.out.println(max);
}
}
