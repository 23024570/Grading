/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grading;

/**
 *
 * @author Mmakgaogelo
 */
import java.util.Scanner;
public class Grading {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mark;
        System.out.println("please enter mark: ");
        mark=input.nextInt();
        
        if (mark>=80 && mark <=100)
        {
            System.out.println("LEVEL 7 Outstandinding Achievement ");
        }
        else if (mark>=70 && mark <=79)
        {
            System.out.println("LEVEL 6 Meritorios Achievement ");
        }
        else if (mark>=60 && mark <=69)
        {
            System.out.println("LEVEL 5 Substantial Achievement ");
        }
        else if (mark>=50 && mark <=59)
        {
            System.out.println("LEVEL 4 Moderate Achievement ");
        }
        else if (mark>=40 && mark <=49)
        {
                System.out.println("LEVEL 3 Adequate Achievement ");
        }
        else if (mark >=30 && mark <=39)
        {
            System.out.println("LEVEL 2 Moderate Achievement ");
        }
        else if  (mark >=0 && mark <=29)
        {
            System.out.println("LEVEL 1 Not Achieved");
        }   
    } 
}
