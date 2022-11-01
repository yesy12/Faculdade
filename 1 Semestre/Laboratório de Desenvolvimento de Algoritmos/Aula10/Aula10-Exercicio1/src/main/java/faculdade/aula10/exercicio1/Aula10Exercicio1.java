/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.aula10.exercicio1;

/**
 *
 * @author Alison
 */
public class Aula10Exercicio1 {

    public static void main(String[] args) {
        int arbustoA = 125, arbustoB = 108, crescimentoA = 2, crescimentoB = 3, ano=0;
        
        do{
            arbustoB += crescimentoB;
            arbustoA += crescimentoA;
            ano += 1;
        }while(arbustoB < arbustoA);
        
        System.out.println("Vai levar: "+ano+" anos para que B supere A");
    }
    
}
