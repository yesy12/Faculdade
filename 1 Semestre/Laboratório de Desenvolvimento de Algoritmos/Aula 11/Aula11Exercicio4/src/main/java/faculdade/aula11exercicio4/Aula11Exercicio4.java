/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.aula11exercicio4;

/**
 *
 * @author Alison
 */
import java.util.Scanner;

public class Aula11Exercicio4 {

    public static void main(String[] args) {
        int numero;
        
        System.out.print("Digite um número: ");
        Scanner leitura = new Scanner(System.in);
        numero = leitura.nextInt();
        
        System.out.println("A soma do numero é: "+numero +" é igual a: " +somaNumeros(numero,0));
    }
    
    static int somaNumeros(int n, int soma){
        if(n < 1){
            return soma;
        }
        soma += (n% 10);
        return somaNumeros(n/10, soma);            
       
    }
        
}
