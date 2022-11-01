/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.exercicio4;
import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exercicio4 {

    static float raio, comprimento;
    
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        raio = leitura.nextFloat();
        
        comprimento = (float) (2 * 3.14 * raio);
        
        System.out.println("O raio de: "+ raio + " é igual ao comprimento de: " + comprimento);
        
        
    }
}
