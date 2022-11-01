/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.aula11;

/**
 *
 * @author Alison
 */
import java.util.Scanner;

public class Aula11 {

    public static void main(String[] args) {
        int hora, minutos;
        
        do{
            System.out.print("Digite as horas: ");
            Scanner leitura = new Scanner(System.in);
            hora = leitura.nextInt();

            System.out.print("Digite os minutos: ");
            leitura = new Scanner(System.in);
            minutos = leitura.nextInt();
            
            mostraErro(hora, minutos);            

        }while(hora > 23 || hora < 0 || minutos < 0 || minutos > 59);
        
        horaAtual(hora, minutos);
        
    }
    
    static void horaAtual(int hora, int minutos){
        int minutosTotais = (hora*60)+minutos;
        System.out.print("Se passaram tantos " + minutosTotais +" minutos");
    }
    
    static void mostraErro(int h, int m){
        if(h > 23 || h < 0){
            System.out.println("Valor Invalido para hora");
        }
        if(m < 0 || m > 59){
            System.out.println("Valor Invalido para hora");
        }
    }
}
