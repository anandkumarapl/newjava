/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class IfElse {
    public static void main(String args[]){
        int pass;
        System.out.println("Enter Pass");
        Scanner s=new Scanner(System.in);
        pass=s.nextInt();
        if(pass==1234){
            System.out.println("name : Anand Kumar Pal");
        }
        else{
            System.out.println("Not Match");
        }
    }
    
}
