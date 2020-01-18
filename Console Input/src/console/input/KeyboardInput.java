package console.input;


import console.input.Keyboard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dansk
 */
public class KeyboardInput {
   
    public static void main (String args[]) {
        System.out.println("Enter a number:");
        int a = Keyboard.readInt();
        System.out.println("Enter a second number:");
        int b = Keyboard.readInt();
        System.out.println("Enter a third number:");
        int c = Keyboard.readInt();
        System.out.println("The average is " + (a+b+c)/3);
    }
}
