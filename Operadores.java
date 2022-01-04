/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cursojavabasico;
/*Classe de explicação e demonstração dos operadores*/
/**
 *
 * @author jardi
 */
public class Operadores {
    public static void main(String[] args){
        int numero1=10,numero2=8;
        System.out.println("Operadores aritméticos");
        //Operadores aritméticos + - * / %
        //soma
        int resultado1 = numero1 + numero2;
        System.out.println("Soma");
        System.out.println(numero1+" + "+numero2+" = "+resultado1);
        //subtração
        System.out.println("Subtração");
        int resultado2 = numero1 - numero2;
        System.out.println(numero1+" - "+numero2+" = "+resultado2);
        //Multiplicação
        int resultado3 = numero1 * numero2;
        System.out.println("Multiplicação");
        System.out.println(numero1+" * "+numero2+" = "+resultado3);
        //Divisão
        double resultado4 = (double)numero1 / numero2;
        System.out.println("Divisão");
        System.out.println(numero1+" / "+numero2+" = "+resultado4);
        //Módulo
        int resultado5 = numero1 % numero2;
        System.out.println("Módulo");
        System.out.println(numero1+" % "+numero2+" = "+resultado5);
        
        System.out.println("Operadores de incrementação e decrementação");
        //Operadores de incrementação e decrementação
        numero1 = numero1 + 1;
        System.out.println(numero1++);
        System.out.println(++numero1);
        System.out.println(numero1=+10);
        System.out.println(numero1*=3);
        System.out.println(numero1/=4);
        
        System.out.println("Opedores de igualdade");
        //Operadores de igualdade
        System.out.println(numero1==numero2);
        System.out.println(numero1!=numero2);
        
        System.out.println("Operadores de relação");
        //Operadores de relação
        System.out.println(numero1>numero2);
        System.out.println(numero1>=numero2);
        System.out.println(numero1<numero2);
        System.out.println(numero1<=numero2);
        
        System.out.println("Operadores lógicos");
        //Operadores Lógicos
        //e
        System.out.println(false&&false);
        System.out.println(false&&true);
        System.out.println(true&&false);
        System.out.println(true&&true);
        //ou
        System.out.println(false||false);
        System.out.println(false||true);
        System.out.println(true||false);
        System.out.println(true||true);
    }
}