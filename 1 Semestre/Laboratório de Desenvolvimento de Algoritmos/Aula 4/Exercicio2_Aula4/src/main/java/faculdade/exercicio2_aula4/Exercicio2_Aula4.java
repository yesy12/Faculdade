/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.exercicio2_aula4;

import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exercicio2_Aula4 {
    
    static float taxa_dolar, valorDolar,resultado;

    public static void main(String[] args) {
        /*
        2. Elaborar um programa em Java que efetue a apresentação do valor da
        conversão em real (R$) de um valor lido em dólar (US$). O programa deverá
        solicitar ao usuário o valor da cotação do dólar e também a quantidade de
        dólares disponíveis e não esqueça de mostrar o valor correspondente em
        real (R$).
        */
        
        System.out.print("Digite a taxa do dolar: ");
        Scanner leitura = new Scanner(System.in);
        taxa_dolar = leitura.nextFloat();
        
        System.out.print("\nDigite quanto dolar quer converter: ");
        leitura = new Scanner(System.in);
        valorDolar = leitura.nextFloat();   
        
        resultado = valorDolar * taxa_dolar;
        
        System.out.println("O valor de U$: "+valorDolar + " para R$: "+resultado);
    }
}
