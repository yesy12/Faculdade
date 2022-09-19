/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.exemplo1_aula5;
import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exemplo1_Aula5 {

    static int idade; 
    
    public static void main(String[] args) {
        
        System.out.print("Digite a sua idade: ");
        Scanner leitura = new Scanner(System.in);
        idade = leitura.nextInt();
        
        if(idade >= 18){
            System.out.println("Maior de Idade");
        }
        else if(idade >= 0){
            System.out.println("Menor de Idade");
        }else{
            System.out.println("Valor Invalido");
        }
    }
}
