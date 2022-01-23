/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cursojavabasico;

import java.util.Scanner;

/**
 *
 * @author jardi
 */
public class EstruturaRepeticao {
    public static void main(String[] args){
        /*
        //Estrutura de repetição controlada por flag
        boolean flag = true;
        Scanner leitor = new Scanner(System.in);
        while (true){
            System.out.println("true");
            flag = leitor.nextBoolean();
        }
        */
        /*
        //Estrutura de repetição por contador
        int contador = 0;
        while(contador<10){
            //System.out.println(contador++);//pos incremento
            System.out.println(++contador);//pré incremento
        }
        */
        
        boolean flag = false;
        do{
            System.out.println("Testando o do-while");
        }while(false);
    }
}
