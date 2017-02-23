/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import calculadora.logica.Calculadora;
import java.util.Scanner;
/**
 *
 * @author LiliamC
 */
public class Principal {


    
    public static void main(String[] args) {
        
    
    Calculadora  calculadora =new Calculadora() {};
    Scanner sc=new Scanner (System.in);
    System.out.println("Ingrese operando1");
    calculadora.setOperando1(sc.nextInt());
    System.out.println("Ingrese operando2");
    calculadora.setOperando2(sc.nextInt());
    System.out.println("las operaciones son:");
    System.out.println("sumar");
    calculadora.sumar();
    System.out.println(calculadora.getResultado());
    System.out.println("restar");
    calculadora.restar();
    System.out.println(calculadora.getResultado());
    System.out.println("Multiplicacion");
    calculadora.multiplicacion();
    System.out.println(calculadora.getResultado());
    System.out.println("Dividir");
    calculadora.dividir();
    System.out.println(calculadora.getResultado());
}
}

