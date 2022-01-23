/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cursojavabasico;

/**
 *
 * @author jardi
 */
public class RepeticaoContinuacao {
    public static void main(String[] args){
        
        String frutas[] = "maçã","abacaxi","abacate","laranja","uva";
        for(int x = 0; x<5; x++){
            System.out.println(frutas[x]);
        }
        for(String fruta : frutas){
            System.out.println(fruta);
        }
    }
}
