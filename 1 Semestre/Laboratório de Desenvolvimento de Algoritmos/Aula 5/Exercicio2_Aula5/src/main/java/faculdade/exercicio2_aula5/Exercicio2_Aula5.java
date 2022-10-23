/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.exercicio2_aula5;
import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exercicio2_Aula5 {

    static float salario, conta1, conta2, conta3, contas_total,resto, falta;
            
    public static void main(String[] args) {
        System.out.print("Escreva o seu salario R$: ");
        Scanner leitura = new Scanner(System.in);
        salario = leitura.nextFloat();
        
        System.out.print("Escreva o valor de uma conta R$: ");
        leitura = new Scanner(System.in);
        conta1 = leitura.nextFloat();     
        
        System.out.print("Escreva o valor de outra conta R$: ");
        leitura = new Scanner(System.in);
        conta2 = leitura.nextFloat();

        System.out.print("E escreva o último valor para uma conta R$: ");
        leitura = new Scanner(System.in);
        conta3 = leitura.nextFloat();
        
        contas_total = conta1 + conta2 + conta3;
        resto = salario - contas_total;
        
        if(salario > contas_total){
            System.out.println("\nCom o salário de: R$ "+salario + ", tendo que pagar: R$ "+contas_total + " em contas, sobrou R$: "+resto);
        }
        else{
            falta = contas_total - salario;
            System.out.println("\nCom o salário de: R$ "+salario + ", tendo que pagar: R$ "+contas_total + " em contas, faltou R$: "+falta);
        }
        
        
    }
}
