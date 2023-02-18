/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import java.util.Scanner;

/**
 *
 * @author sangram
 */
public class user {
    public static void main(String[] args) {
        int i ;
        System.out.println("Enter the value of Number:");
        Scanner sc =  new Scanner(System.in);
        i=sc.nextInt();
        System.out.println("Square of the value :"+(i*i));
    }
    
}
