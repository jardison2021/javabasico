/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cursojavabasico;
/*Classe demoonstrativa de variáveis e constantes*/
/**
 *
 * @author jardi
 */
public class VariaveisEConstantes {
   public static void main(String[] args){
       //criação de constants
       final double ACELERACAO_DA_GRAVIDADE_NA_TERRA = 9.80665;
       //criação de variáveis
       String nome="José";
       int idade=48;
       double peso=73.4, altura=1.73;
       char sexo='m', cnh='a';
       boolean doadordeOrgaos=true;
       //impriminado as variáveis
       System.out.println("Nome: "+nome);
       System.out.println("Idade: "+idade);
       System.out.println("Peso: "+peso);
       System.out.println("Altura: "+altura);
       System.out.println("Sexo: "+sexo);
       System.out.println("CNH: "+cnh);
       System.out.println("Doador de órgãos: "+doadordeOrgaos);
       //imprimindo a constante
       System.out.println("Aceleração da gravidade na terra: "+ACELERACAO_DA_GRAVIDADE_NA_TERRA+" m/s²");
   } 
}
