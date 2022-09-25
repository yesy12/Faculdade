/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio2_aula6;
import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exercicio2_Aula6 {

    public static void main(String[] args) {
        float preco_Atual, novo_preco, aumento = 0;
        int quantidade_vendas;
        
        System.out.print("Digite o preço do produto: ");
        Scanner leitura = new Scanner(System.in);
        preco_Atual = leitura.nextFloat();
        
        System.out.print("Digite a quantidade de vendas do produto: ");
        leitura = new Scanner(System.in);
        quantidade_vendas = leitura.nextInt();
        
        if( quantidade_vendas < 500 && preco_Atual < 30){
            aumento = 0.1f;
        } // c1
        else if( (quantidade_vendas >= 500 & quantidade_vendas < 1200) && (preco_Atual >=30 && preco_Atual < 80) ){
            aumento = 0.15f;
        }// c2
        else if( (quantidade_vendas >= 1200) && (preco_Atual >= 80)){
            aumento = -0.2f;
        }
        
        novo_preco = preco_Atual * (1+aumento);
        System.out.println("\nO preço antigo era de: R$ "+preco_Atual+" agora o novo preço é de: R$ "+novo_preco+", "
                + "teve aumento de: "+aumento*100+"%");
        
        
    }
    
}
