/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.exemplo2_aula4;
import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exemplo2_Aula4 {

    static int caixas250, caixas750, caixas1000; 
    static float perda = 0.02f, quantidadeSucoLitrosTotal,
            quantidadeSucoLitros250, quantidadeSucoLitros750, quantidadeSucoLitros1000;;
    
    public static void main(String[] args) {
        /*
        2) A fábrica de sucos ADOS vende seus produtos
        em três tamanhos diferentes: caixa de 250 ml, caixa
        de 750 ml e caixa de 1000 ml. Faça um programa
        que obtenha a quantidade de cada produto
        comprada por um comerciante (lembre-se que os
        produtos possuem tamanhos diferentes). Calcule e
        mostre quantos litros de suco o comerciante
        comprou, sabendo que 1 mililitro = 0,001 litros.
        Considere que existe uma perda de 2% sobre o total
        comprado, mostre também quantos litros de suco
        serão perdidos pelo comerciante.
        */
        
        System.out.print("Digite Quantos sucos de 250ml serão comprados: ");
        Scanner leitura = new Scanner(System.in);
        caixas250 = leitura.nextInt();
        
        System.out.print("\nDigite Quantos sucos de 750ml serão comprados: ");
        leitura = new Scanner(System.in);
        caixas750 = leitura.nextInt();                
        
        System.out.print("\nDigite Quantos sucos de 1000ml serão comprados: ");
        leitura = new Scanner(System.in);
        caixas1000 = leitura.nextInt(); 
        
        quantidadeSucoLitros250 =  (caixas250)*(float)(250f /1000f);        
        quantidadeSucoLitros750 =  (caixas750)*(float)(750f /1000f);        
        quantidadeSucoLitros1000 =  (caixas1000)*(float)(1000f /1000f);
        quantidadeSucoLitrosTotal = quantidadeSucoLitros250 + 
                quantidadeSucoLitros750 + quantidadeSucoLitros1000;
        
        perda *= quantidadeSucoLitrosTotal  ;
        
        System.out.println("---------------------------");
        System.out.println("\nForam comprados: "+quantidadeSucoLitros250 + " Litros do suco de 250ml");        
        System.out.println("Foram comprados: "+quantidadeSucoLitros750 + " Litros do suco de 750ml");
        System.out.println("Foram comprados: "+quantidadeSucoLitros1000 + " Litros do suco de 1000ml");        
        System.out.println("Foram comprados: "+quantidadeSucoLitrosTotal + " Litros de suco no total");             
        System.out.println("---------------------------");
        
        System.out.println("Sua perda será de: "+perda +" Litros de sucos");
    
    }
}
