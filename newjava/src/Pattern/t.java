/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern;

/**
 *
 * @author Anand
 */
public class t {
public static void main(String args[]){
    int i,j,n=5;
    for(i=0;i<=n;i++){      
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
        }
     for(int k=0;k<=n;k++){
        System.out.print(" ");
    }
     for(i=n;i>=0;i--){ 
          for(int k=n;k>=i;k--){
        System.out.print(" ");
    }
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       for(i=n;i>=0;i--){      
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
         }
      
}}


