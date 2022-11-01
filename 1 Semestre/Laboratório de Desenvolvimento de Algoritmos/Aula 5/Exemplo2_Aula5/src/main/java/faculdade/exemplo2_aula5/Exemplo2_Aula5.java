/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.exemplo2_aula5;
import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exemplo2_Aula5 {

    static float n1, n2, media;
    
    public static void main(String[] args) {
        
        System.out.print("Escreva a primeira nota: ");
        Scanner leitura = new Scanner(System.in);
        n1 = leitura.nextFloat();
        
        System.out.print("Escreva a segunda nota: ");
        leitura = new Scanner(System.in);
        n2 = leitura.nextFloat();   
        
        media = (n1+n2)/2;
        
        if(media >= 6){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
