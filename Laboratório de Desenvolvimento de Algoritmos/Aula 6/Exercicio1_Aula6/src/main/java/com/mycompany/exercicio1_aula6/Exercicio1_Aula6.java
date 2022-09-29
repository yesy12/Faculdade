/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio1_aula6;

import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exercicio1_Aula6 {
    


    public static void main(String[] args) {
        int codigo;
        float salario_antigo, salarioNovo, aumento;
        
        System.out.println("Código\tCargo\n1\tEscriturario\n2\tSecretario\n3\tCaixa\n4\tGerente\n5\tDiretor\n");
        
        System.out.print("Digite o código para o cargo: ");
        Scanner leitura = new Scanner(System.in);
        codigo = leitura.nextInt();
        
        System.out.print("Digite o salário antigo: ");
        leitura = new Scanner(System.in);
        salario_antigo = leitura.nextFloat();
        
        switch(codigo){
            
            case 1:
                aumento = 0.5f;
                break;
            case 2:
                aumento = 0.35f;
                break;
            case 3:
                aumento = 0.2f;
                break;
            case 4:
                aumento = 0.1f;
                break;
            case 5:
                aumento = 0f;
                break;
            default:
                aumento = 0f;
                System.out.println("Valor Inválido");
                break;
        }
        
        salarioNovo = salario_antigo * (1+aumento);
        System.out.print("O aumento foi de: "+aumento*100+"%, no seu anitgo salário de: R$ "+salario_antigo);
        System.out.println(",Agora com o seu novo salário é de: R$ "+salarioNovo);
        
    }
}
