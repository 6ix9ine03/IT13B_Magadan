/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BasicCalcu_Magadan {
    


    public static void main(String []args){
        
        Scanner in= new Scanner(System.in);
        
        System.out.println("First Number");
        double c1= in.nextDouble();
        System.out.println("Second Number");
        double c2= in.nextDouble();
        System.out.println("Operators(+,-,*,/):");
        char Operators= in.next().charAt(0);
        
        double result;
        switch(Operators){
            case'+' -> result = c1+c2;
                case'-' -> result = c1-c2;
                case'*' -> result = c1*c2;
                case'/' -> result = c1/c2;
                        
                default -> {
                    System.out.println("Invalid");
                    return;
            }
        }
        System.out.println("Total:" + result);
        }

}

