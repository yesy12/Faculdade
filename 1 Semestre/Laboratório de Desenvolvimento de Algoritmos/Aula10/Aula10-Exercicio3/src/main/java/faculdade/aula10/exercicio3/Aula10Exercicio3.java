/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.aula10.exercicio3;

/**
 *
 * @author Alison
 */
public class Aula10Exercicio3 {

    public static void main(String[] args) {
        float graos = 0;
        
        for(int expoente = 0; expoente < 65; expoente++){
            graos += (float)Math.pow(2,expoente);
        }
        System.out.println("A quantidade de grãos de Arroz é: "+graos);
    }
}
