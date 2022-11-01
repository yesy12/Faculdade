/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.aula5;
import javax.swing.JOptionPane;

/**
 *
 * @author Alison
 */
public class Aula5 {

    static int num;
    
    public static void main(String[] args) {
        
        //Numero par
        num = Integer.parseInt( JOptionPane.showInputDialog("Digite um número: ")
        );
        
        if(num%2 == 0){
            JOptionPane.showMessageDialog(null,"Valor é par");
            System.out.println("Valor par");
        }
        else{
            System.out.println("Valor impar");
            JOptionPane.showMessageDialog(null, "Valor é impar");
        }
    }
}
