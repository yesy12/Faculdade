/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio1_sala_de_aula6;

import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exercicio1_Sala_de_Aula6 {

    public static void main(String[] args) {
        int nota;
        String mensagem;
        
        System.out.println("--------------------------------");
        System.out.print("Digite um número entre 1 e 10: ");
        Scanner leitura = new Scanner(System.in);
        nota = leitura.nextInt();
        
        System.out.println("--------------------------------");
        
        switch(nota){    
            
            case 1:
                mensagem = "UM";
                break;
            case 2:
                mensagem = "DOIS";
                break;                                  
            case 3:
                mensagem = "TRÊS";
                break;            
            case 4:
                mensagem = "QUATRO";
                break;            
            case 5:
                mensagem = "CINCO";
                break;            
            case 6:
                mensagem = "SEIS";
                break;
            case 7:
                mensagem = "SETE";
                break;            
            case 8:
                mensagem = "OITO";
                break;            
            case 9:
                mensagem = "NOVE";
                break;            
            case 10:
                mensagem = "DEZ";
                break;            
            default:
                System.out.println("Valor Inválido");
                mensagem = "Número Inválido";
        }

        System.out.println("--------------------------------");
        System.out.println("Número escolhido foi: "+mensagem);
        System.out.println("--------------------------------");        
        
    }
}


