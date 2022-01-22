/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cursojavabasico;
/*
    Classe explique as funções
    versão: 1.0
*/
/**
 *
 * @author jardi
 */
public class Funcoes {
    public static void main(String[] args){
        int result = soma(10,60);
        
        System.out.println(result);
        
        quadrado(7);
        
        String texto = mensagem();
        System.out.println(texto);
        
        olamundo();
        
        //operador ternário
        
        int nota = 8;
        String resultado = nota > 7?"Aprovado":"Reprovado";
        System.out.println(resultado);
    }
    //função do tipo int que recebe dois parêmetros
    static int soma(int a, int b){
        return a+b;
    }
    /*
        Função que recebe parâmetro,
        mas não retorna nada
    */
    static void quadrado(int numero){
        System.out.println(numero*numero);
    }
    /*
        Não recebe parâmetro, mas retorna
        alguma coisa
    */
    static String mensagem(){
        return "Mensagem de sistema";
    }
    static void olamundo(){
        System.out.println("Olá mundo!");
    }
}
