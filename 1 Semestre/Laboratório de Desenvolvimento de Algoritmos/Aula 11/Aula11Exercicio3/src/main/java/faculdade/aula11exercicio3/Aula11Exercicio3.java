/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.aula11exercicio3;

/**
 *
 * @author Alison
 */
import java.util.Scanner;

public class Aula11Exercicio3 {

    public static void main(String[] args) {
        int mes, dia;
        int[] duracao = {
            31, 28, 31,
            30, 31, 30,
            31, 31, 30,
            31, 30, 31
        };
               
        do{
            System.out.print("Digite o mês: ");
            Scanner leitura = new Scanner(System.in);
            mes = leitura.nextInt();  
            
            System.out.print("Digite o dia: ");
            leitura = new Scanner(System.in);
            dia = leitura.nextInt();  
            
            mostraErro(mes, dia, duracao);
            
        }while(mes < 1 || mes > 12 || (dia > duracao[mes-1]) || dia < 1);
        somaDias(dia, mes, duracao);
    }
    
    static void mostraErro(int m, int d, int[] perido){
        if(m < 1 || m > 12){
            System.out.println("Mês Inválido");
        }
        else{           
            if( (d > perido[m-1] || d < 1)){
                System.out.println("Dia Inválido");
            } 
        }

    }
    
    static void somaDias(int d, int m, int[] dias){
        int soma = 0;
        
        for(int mes = 0; mes < m-1; mes++){
            soma += dias[mes];
        }
        soma += d;
        System.out.print("A soma de dias é: "+soma);
    }
}
