/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console.input;

import java.util.Scanner;

/**
 *
 * @author dansk
 */
public class ScannerInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = input.nextInt();
        System.out.print("Enter second number :");
        int b = input.nextInt();
        System.out.print("Enter third number :");
        int c = input.nextInt();
        System.out.print("Average is " + (a+b+c)/3);
    }      
}
