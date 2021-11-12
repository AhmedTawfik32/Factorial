/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author AhmedTawfik
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        int num = input.nextInt();

        System.out.println("The Factorial of number is: " + factorial(num));
    }

    public static int factorial(int number) {
        if (number > 0) {
            return number * factorial(number - 1);
        } else {
            return 1;
        }
    }

}
