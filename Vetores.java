/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cursojavabasico;

import java.util.ArrayList;

/*
    Classe que especifica a criaçãode arrays
    Versão: 1.0
*/
/**
 *
 * @author jardi
 */
public class Vetores {
    public static void main(String[] args){
        // Declaração de vetor vazio
        int numeros[] = new int[5];
        numeros[0]= 10;
        numeros[1]= 20;
        numeros[2]= 30;
        numeros[3]= 40;
        numeros[4]= 50;
        
       System.out.println(numeros[2]);
       
       char consoantes[] = {'b','c','d','f','g'};
       
       System.out.println(consoantes[4]);
       
       ArrayList<Integer> pares = new ArrayList<>();
       
       pares.add(2);
       pares.add(6);
       pares.add(1,4);// o número 1 indica a posição do núemero 4
       pares.add(24);
       pares.add(10);
       pares.add(8);
       pares.sort(null);
       pares.remove(4);
       
       System.out.println(pares.get(5));
    }
}
