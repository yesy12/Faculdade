/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplo2_aula6;
import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exemplo2_Aula6 {

    
    
    public static void main(String[] args) {
        int nota;
        String mensagem;
        
        System.out.println("--------------------------------");
        System.out.print("Digite a nota entre 1 e 5: ");
        Scanner leitura = new Scanner(System.in);
        nota = leitura.nextInt();
        
        System.out.println("--------------------------------");
        
        
        switch(nota){
            
            case 0:
            
            case 1:
                mensagem = "E";
                break;
            case 2:
                mensagem = "D";
                break;                                  
            case 3:
                mensagem = "C";
                break;            
            case 4:
                mensagem = "B";
                break;            
            case 5:
                mensagem = "A";
                break;                      
            default:
                System.out.println("Valor Inválido");
                mensagem = "Nota Inválida";
        }
        System.out.println("--------------------------------");
        System.out.println("O Conceito da nota do aluno foi: "+mensagem);
        
        
        System.out.println("--------------------------------");
    }
}

        //System.out.print(`O valor de {var1} + {var2} é igual a = {resultado}`);


