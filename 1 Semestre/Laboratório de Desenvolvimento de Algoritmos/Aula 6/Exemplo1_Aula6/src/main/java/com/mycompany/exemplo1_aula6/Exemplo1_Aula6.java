/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplo1_aula6;
import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exemplo1_Aula6 {

    static String nome, mensagem;
    static float peso, imc;
    static int altura;
    
    public static void main(String[] args) {
        System.out.print("Digite o seu nome:  ");
        Scanner leitura = new Scanner(System.in);
        nome = leitura.nextLine();
        
        System.out.print("Digite a sua altura em cm:  ");
        leitura = new Scanner(System.in);
        altura = leitura.nextInt();
        
        System.out.print("Digite o seu peso:  ");
        leitura = new Scanner(System.in);
        peso = leitura.nextFloat();        
        
        imc = peso/(altura/100f*altura/100f);
        
        if( imc < 20){
            mensagem = "Abaixo do Peso";
        }
        else if( imc <= 24.9){
            mensagem = "Peso normal";
        }
        else if( imc <= 29.9){
            mensagem = "Sobrepeso";
        }
        else if( imc <= 39.9){
            mensagem = "Obeso";
        }
        else{
            mensagem = "Obeso Mórbido";
        }
        
        System.out.print("Olá "+nome +" Você está na categória: "+mensagem );
    }
}