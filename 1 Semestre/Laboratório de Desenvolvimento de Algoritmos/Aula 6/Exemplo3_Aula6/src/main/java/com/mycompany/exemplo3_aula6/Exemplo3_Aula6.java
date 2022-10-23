/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplo3_aula6;

import javax.swing.JOptionPane;

/**
 *
 * @author Alison
 */
public class Exemplo3_Aula6 {

    public static void main(String[] args) {
        int numero_raiz = 1;
        float raiz;
        String mensagem; 
        
        System.out.println("Numero\tRaiz Quadrada");
        mensagem ="Numero------Raiz Quadrada";
        while (numero_raiz <= 20){
            
            raiz = (float) Math.sqrt(numero_raiz);
            System.out.println(numero_raiz+"\t"+raiz);
            mensagem += "\n   " +numero_raiz+"\t        "+raiz ;
            
            numero_raiz += 1;
        }
        JOptionPane.showMessageDialog(null,mensagem);
    }
}
