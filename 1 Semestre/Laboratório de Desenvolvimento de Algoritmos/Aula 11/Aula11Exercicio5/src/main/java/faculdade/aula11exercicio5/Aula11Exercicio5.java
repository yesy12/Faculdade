/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.aula11exercicio5;

/**
 *
 * @author Alison
 */

import java.util.Scanner;
public class Aula11Exercicio5 {

    public static void main(String[] args) {
        int numero;
        System.out.println("Fibonacci");
        

        System.out.print("Digite um número: ");
        Scanner leitura = new Scanner(System.in);
        numero = leitura.nextInt();
        
        //System.out.println("A sequência é:" +fibonacci(numero));
        
        for(int i = 0; i <= numero;i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    static int fibonacci(int n){
        if(n == 0 || n == 1){
           return n;
        }
                
        return fibonacci(n -1) + fibonacci(n - 2);
    }
}
