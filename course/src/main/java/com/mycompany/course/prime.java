/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course;

/**
 *
 * @author Basmala
 */
public class prime extends calculation{
    
    public prime(long n){
        setN(n);
    }
    
    public boolean isPrime(long n){
        if(n<2)
            return false;
        for(long i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
            
}
