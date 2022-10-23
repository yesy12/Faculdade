/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faculdade.aula3;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Alison
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    
    static int idade;
    static float dez = 10f;
    static float pagamento = 2f;
    static float receber = dez * pagamento;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //teste();
    }
    
    public static void teste(){
        System.out.println("Hello World");
        
        System.out.println("New Hello");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa: "));
                
        System.out.println("A idade dessa pessoa é: "+idade);;
        System.out.println(receber );
        JOptionPane.showMessageDialog(null, "Hoje é um novo dia");
    }
    
    
    
}
