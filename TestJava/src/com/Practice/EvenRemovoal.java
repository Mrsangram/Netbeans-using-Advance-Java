/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Practice;

/**
 *
 * @author sangram
 */

public class EvenRemovoal {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8,10,11};
        int OddC=0;

        for(int j=0; j<arr.length; j++){
            if(arr[j]%2!=0){
//            System.out.println(" "+arr[j]);
            OddC =j;

                System.out.println(" "+arr[OddC]);
            
            }
        }
        for (int ele : arr) {
            System.out.println(" "+arr[ele]);
            
        }
        
    }
    
}
