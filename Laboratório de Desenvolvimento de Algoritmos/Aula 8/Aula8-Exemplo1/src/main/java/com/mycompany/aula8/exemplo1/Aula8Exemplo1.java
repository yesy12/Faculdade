/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula8.exemplo1;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Alison
 */
public class Aula8Exemplo1 {

    public static void main(String[] args) {
        int num_notas = -1, quantidadeNotas = 0, soma = 0;
        float media,notaAtual = -1;
        boolean error = false, passNoError  = false;
        
        System.out.print("\nDigite a quantidade de notas para a média: ");
        Scanner leitura = new Scanner(System.in);
        

        
            
            try{
                num_notas = leitura.nextInt();     
                passNoError = true;
            }
            catch(InputMismatchException e){
                System.out.print("Valor Invalido "+e.toString()+"\n");
            }
            
        
   
               
        if(num_notas > 0 && passNoError){
        
            do {          
                do{
                    System.out.print("Digite a "+(quantidadeNotas+1)+"º Nota: ");
                    leitura = new Scanner(System.in);
                    try{
                        notaAtual = leitura.nextFloat();
                    }
                    catch(InputMismatchException e){
                        System.out.print("Valor Invalido "+e.toString()+"\n");
                    }


                    if(notaAtual >= 0 && notaAtual < 6){
                        soma += notaAtual;
                        error = false;
                    }
                    else{
                        System.out.print("Valor Invalido: ("+notaAtual+") para a: "+(quantidadeNotas+1)+"º Nota\n");
                        error = true;
                    }

                } while(error == true);      

                quantidadeNotas += 1;

            } while (quantidadeNotas < num_notas && num_notas != 0);

            media = (float)soma/quantidadeNotas; 

            System.out.println("A Média é: "+media+", com a quantidade de notas: "+num_notas);
        }
    }
}
