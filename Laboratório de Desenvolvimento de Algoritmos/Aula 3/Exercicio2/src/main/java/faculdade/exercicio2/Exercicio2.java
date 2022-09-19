/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.exercicio2;

import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exercicio2 {

    static int n1,n2, resto;

    public static void main(String[] args) {
        
        //System.out.println("dj");
        
        Scanner leitura= new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = leitura.nextInt();
        
        leitura= new Scanner(System.in);
        System.out.println("Digite o segundo número: ");
        n2 = leitura.nextInt();      
        
        resto = n1 % n2;
        
        System.out.println("O resto da divisão de " +n1 +" por " +n2 +" é igual a: " + resto);
       
    }
}
