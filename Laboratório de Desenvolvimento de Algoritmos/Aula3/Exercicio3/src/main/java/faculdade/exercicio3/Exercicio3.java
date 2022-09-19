/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.exercicio3;

import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exercicio3 {

    static float prestacao, multa, prestacao_atualizada, dias;
    
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor da prestação: ");
        prestacao = leitura.nextFloat();
        
        leitura = new Scanner(System.in);
        System.out.println("Digite o valor da multa: ");
        multa = leitura.nextFloat();
             
        leitura = new Scanner(System.in);
        System.out.println("Digite a quanto dias esta atrasada: ");
        dias = leitura.nextInt();
        
        prestacao_atualizada =  (float) (prestacao + (prestacao*(multa * 0.01)* dias));
        
        System.out.println("O Valor atualizado da prestação é: "+prestacao_atualizada);
        
    }
}
