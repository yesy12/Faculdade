/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.aula4;

/**
 *
 * @author Alison
 */
public class Aula4 {
    
    static final float pi = 3.14159f;

    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("Hello World! is the new pi "+pi);
        
        try {
            pi = 3.14f;
        } catch (Exception e) {
            System.err.println("Pi is constant");
        }
        
        
        System.out.println("---------------------------");
        System.out.print("Raiz Quadrada de 16 é igual a: ");
        System.out.println(Math.sqrt(16));
    }
}
