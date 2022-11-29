package newjava;

import static newjava.Array.getarray;

public class Array {
public static void getarray(){
        int a[]={1,2,3};
        int n=a.length-1;
        for(int i=n;i>=0;i--){
        System.out.print(a[i]);
    }
}
public static void main(String args[]){
}
}