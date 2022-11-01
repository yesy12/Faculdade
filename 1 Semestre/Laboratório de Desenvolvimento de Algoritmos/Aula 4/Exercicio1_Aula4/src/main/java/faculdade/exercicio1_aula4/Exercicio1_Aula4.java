/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.exercicio1_aula4;

import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exercicio1_Aula4 {
    
    static float raio, area, altura, volume, pi = 3.141592f;

    public static void main(String[] args) {
        /*
        1. Faça um programa em Java que solicite o valor do raio e
        a altura de cilindro e calcule e mostre a sua área,
        sabendo que:
        A = 2*pi*raio*altura
        E calcule e mostre também o seu volume, sabendo que:
        V = pi*raio2
        *altura
        Utilize as funções matemáticas da classe Math para resolver
        as expressões acima
        */
        
        System.out.print("Digite o raio da esfera: ");
        Scanner leitura = new Scanner(System.in);
        raio = leitura.nextFloat();
        
        System.out.print("Digite a altura da esfera: ");
        leitura = new Scanner(System.in);
        altura = leitura.nextFloat();        
        
        area = 2 * pi * raio * altura;
        volume = (float) (pi * Math.pow(raio, 2) * altura);
        
        System.out.println("\nA area é de: "+ area);
        System.out.println("O volume é de: "+volume);
    }
}
