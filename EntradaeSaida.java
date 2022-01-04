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
public class EntradaeSaida {
    public static void main(String[] args){
        //criando as variáveis
        String nome;
        int idade;
        double altura;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu nome:");
        nome = leitor.nextLine();
      
        System.out.println("Digite sua idade:");
        idade = leitor.nextInt();
        
        System.out.println("Digite sua altura:");
        altura = leitor.nextDouble();
       
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
        
        System.out.printf("Nome: %s \nIdade: %d \nAltura: %.2f",nome,idade,altura);
    }
}
