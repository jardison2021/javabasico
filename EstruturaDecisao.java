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
public class EstruturaDecisao {
    public static void main(String[] args){
        //String texto = 10==7?"Dez é igua a sete":"Dez é diferente de sete";
        
        //if
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();
        System.out.println("Qual a sua idade?");
       /*if(idade>=18){
            System.out.println("Já pode tirar a CNH");
        }*/
        
        //if else
        if(idade>=18){
            System.out.println("Já pode tirar a CNH");
        }else{
            System.out.println("Ainda não pode tirar a CNH");
        }
        
        String semaforo = "Vermelho";
        
        if(semaforo=="Verde"){
            System.out.println("Siga em frente");
        }else if(semaforo=="Amarelo"){
            System.out.println("Tenha atenção");
        }else if(semaforo=="Vermelho"){
            System.out.println("Pere");
        }else{
            System.out.println("Chame a autarquia de trânsito");
        }
        
        char opcao = 'b';
        switch(opcao){
            case 'a':System.out.println("Cadastrar produto");break;
            case 'b':System.out.println("Visualizar produto");break;
            case 'c':System.out.println("Editar produto");break;
            case 'd':System.out.println("Apagar produto");break;
            default:System.out.println("Opção de inválida");
        }
    }
}
