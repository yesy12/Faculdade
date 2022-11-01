/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.aula9exercicio1;

/**
 *
 * @author Alison
 */
public class Aula9Exercicio1 {

    public static void main(String[] args) {
        int numerosNegativos = 0,quantidadePositiva = 0, soma = 0;
        float mediaPositiva, valorAtual;
        float [][] matriz = { 
            {24.32f, 4.1f, -12.7f,    6.5f,   0f},
            { 5.2f,   -1f,   0.23f,   7.8f,   9.9f},
            { 3.1f,   2.3f,  -4.5f,   102.1f, -3.8f}
        };
       
        for( int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                valorAtual = matriz[i][j];
                
                if(valorAtual > 0){
                    quantidadePositiva += 1;
                    soma += valorAtual;
                }
                else if(valorAtual < 0){
                    numerosNegativos +=1;
                }
            }
        }
        mediaPositiva = (float)soma/quantidadePositiva;
        
        System.err.println("A quantidade de negativa é: "+numerosNegativos);
        System.out.print("A média é: "+mediaPositiva);
        
    }
}
