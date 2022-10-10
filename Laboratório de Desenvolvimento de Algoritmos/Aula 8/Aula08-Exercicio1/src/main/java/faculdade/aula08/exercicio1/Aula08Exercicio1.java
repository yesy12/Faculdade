/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.aula08.exercicio1;

/**
 *
 * @author Alison
 */

import java.util.Scanner;

public class Aula08Exercicio1 {
    
    public static void main(String[] args) {
        String string, palavra, palavraSubstituida, stringNova;
        
        System.out.print("Digite uma frase: ");           
        Scanner leitura = new Scanner(System.in);
        string = leitura.nextLine();
        
        System.out.print("Digite uma palavra, que será trocada no texto: ");           
        leitura = new Scanner(System.in);
        palavra = leitura.nextLine();

        System.out.print("Digite uma palavra para colocar no texto: ");           
        leitura = new Scanner(System.in);
        palavraSubstituida = leitura.nextLine();
        
        string = string.toLowerCase();
        palavra = palavra.toLowerCase();
        
        stringNova = string.replace(palavra, palavraSubstituida);
        
        if(string.equals(stringNova)){
            System.out.println("Não foi possível alterar a frase");
            System.out.println("A frase é:{ " +string + " }");
        }
        else{
            System.out.println("Foi possível alterar a frase");
            System.out.println("A frase Antiga é:{ " +string + " }");
            System.out.println("A frase Nova é:{ "+stringNova+" }");
        }
        
        
        
        
        
    }
}
