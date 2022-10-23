/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.exemplo3_aula4;
import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exemplo3_Aula4 {
    
    static float raio, comprimento, pi = 3.141592f, volume;

    public static void main(String[] args) {
        /*
        3) Faça um programa que solicite o valor do raio de uma esfera
        e calcule e mostre o seu comprimento, sabendo que:
        C = 2*pi*raio
        E calcule e mostre também o seu volume, sabendo que:
        V = 3/4*pi*raio3
        Utilize as funções matemáticas da classe Math para resolver 
        as expressões acima
        */
        
        System.out.print("Digite o raio da esfera: ");
        Scanner leitura = new Scanner(System.in);
        raio = leitura.nextFloat();
        
        comprimento = 2 * pi * raio;
        volume = (float) ((3/4f*pi) * Math.pow(raio, 3));
        
        System.out.println("O comprimento é de: "+comprimento);
        System.out.println("O volume é de: "+volume);
        
    }
}
