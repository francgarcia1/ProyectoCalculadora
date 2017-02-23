/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author LiliamC
 */
public class opbinario {
    

public static void main(String[] args) {
        int num;
        System.out.println("ingrese el numero ");
        Scanner sc=new Scanner(System.in);
        num=Integer.parseInt(sc.nextLine(),2);  
        String decimal=Integer.toString(num);
        System.out.println("el numero en decimal es="+decimal);
        
    }
}

