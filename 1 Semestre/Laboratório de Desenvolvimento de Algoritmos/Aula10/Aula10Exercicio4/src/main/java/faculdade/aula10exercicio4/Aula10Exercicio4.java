/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.aula10exercicio4;
import java.util.Scanner;
import faculdade.aula10exercicio4.calculaDistancia;
/**
 *
 * @author Alison
 */
public class Aula10Exercicio4 {

    public static void main(String[] args) {
        int tempo, velocidade;
        final double consumo = 10.5;//km/litro
       
        System.out.print("Digite o tempo: ");
        Scanner leitura = new Scanner(System.in);
        tempo = leitura.nextInt();
        
        System.out.print("Digite a velocidade: ");
        leitura = new Scanner(System.in);
        velocidade = leitura.nextInt();
        
        double d = calculaDistancia.calcula_Distancia(tempo, velocidade);
        
        System.out.println("Precisa de "+ calculaLitros.calcula_Litros(d,consumo) +" litros");
    }
   
    
}
