/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.course;

import java.util.Scanner;

/**
 *
 * @author Basmala
 */
public class program {
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       long n=in.nextLong();
        
       prime calc= new prime(n);
       if(calc.isPrime(calc.getN())){
           System.out.println(calc.getN()+" is prime number");
       }else{
           System.out.println(calc.getN()+" is not prime number");
       }
       
    }

}
/*
String s= in.nextLine();
       s+=in.nextLine();
       in.close();

read string in java with space
*/
