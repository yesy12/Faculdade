/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.exemplo1;
//import java;

import java.util.Scanner;

/**
 * 
 * @author Alison 
 */

// Aula 4
public class Exemplo1 {
    
    static final float pi = 3.141592f;
    static float altura, raio, areaTanque, totalLatas, totalPagar, totalTanques;

    public static void main(String[] args) {
    /*
        Construa um algoritmo que calcule a quantidade de
        latas de tinta necessárias e o custo para pintar
        tanques cilíndricos onde são fornecidos a altura e
        o raio do tanque.
        
        sabe-se que:
        i) a lata de tinta custa R$ 100,00.
        ii) cada lata contém 20 litros.
        iii) cada litro de tinta pinta 10 metros quadrados.
    */
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escreva a altura do cilindro");
        altura = leitura.nextFloat();
        
        leitura = new Scanner(System.in);
        System.out.println("Escreva o raio do cilindro");
        raio = leitura.nextFloat();
 
        leitura = new Scanner(System.in);
        System.out.println("Escreva a quantidade de cilindro");
        totalTanques = leitura.nextFloat();        
       
        
        areaTanque =  (pi * raio * raio ) + (2 * pi * raio * altura); 
        totalLatas = (areaTanque * totalTanques);
        totalPagar = totalLatas * 100;
        
        System.out.println("A pessoa terá que gastar: R$ "+totalPagar + " e comprar: " + totalLatas + " para pintar uma area de: " + areaTanque);
        
    }
}
