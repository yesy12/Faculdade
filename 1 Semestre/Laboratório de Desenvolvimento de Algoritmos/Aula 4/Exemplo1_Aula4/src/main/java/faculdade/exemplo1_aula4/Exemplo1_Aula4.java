/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.exemplo1_aula4;
import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exemplo1_Aula4 {

    static float valor_aumentado, valor_total, salario, percentual;

    public static void main(String[] args) {
        /*
        1) Faça um programa que obtenha o salário de
        uma pessoa e o valor da porcentagem de
        aumento. Calcule e mostre o valor do aumento e o
        novo salário acrescido de aumento.
        */
        
        System.out.print("Digite o salário do trabalhador: ");
        Scanner leitura = new Scanner(System.in);
        salario = leitura.nextFloat();
        
        System.out.print("Digite o percentual de aumento do trabalhador: ");
        leitura = new Scanner(System.in);
        percentual = leitura.nextFloat();
        
        valor_aumentado = salario * (percentual/100);
        valor_total = salario + valor_aumentado;
        
        System.out.print("\nO trabalhador teve: "+percentual + "% de aumento. \nTendo um aumento bruto de: "+valor_aumentado);
        System.out.println("\nO salário total é: "+valor_total);
        
        
    }
}
