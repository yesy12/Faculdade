/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.exercicio1_aula5;
import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Exercicio1_Aula5 {
    
    static float desconto_percentual = 0.2f, preco, preco_desconto,desconto ;

    public static void main(String[] args) {
        
        System.out.print("Digite o preço do produto: ");
        Scanner leitura = new Scanner(System.in);
        preco = leitura.nextInt();
        
        if(preco > 200){
            desconto = preco* desconto_percentual;  
            
            preco_desconto = preco - desconto;
            
            System.out.println("A compra ficará no valor de: R$ "+preco_desconto + " já com o desconto de: R$ "+ desconto +"(20%)");
        }
        else{
            System.out.println("A compra ficará no valor de R$: "+preco);
        }
        
        
        
    }
}
