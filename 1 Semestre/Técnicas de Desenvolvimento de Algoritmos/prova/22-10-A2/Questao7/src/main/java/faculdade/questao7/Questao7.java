/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.questao7;

/**
 *
 * @author Alison
 */
public class Questao7 {

    public static void main(String[] args) {
        int num1, num2, i;
        double resultado;
        
        num1 = 1;
        num2 = 5;


        for(i = 0; i < num2; i++)
            num1 *= 2;

            if(num2 >=i)
                num1++;

            else
                num1--;


        System.out.println(num1);
    }
}
