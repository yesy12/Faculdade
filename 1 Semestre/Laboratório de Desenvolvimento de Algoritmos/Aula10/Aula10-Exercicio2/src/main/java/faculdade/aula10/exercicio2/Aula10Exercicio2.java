/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.aula10.exercicio2;

/**
 *
 * @author Alison
 */
public class Aula10Exercicio2 {

    public static void main(String[] args) {
        int numeroAleatorio, dividorPor=0;
        boolean numeroPrimo = false;
        
        numeroAleatorio = (int)Math.ceil((Math.random()*100));
        
        for(int i = 1; i <= numeroAleatorio; i++){
            if(numeroAleatorio % i == 0){
                dividorPor +=1;                        
            }
            if(dividorPor > 2 || i == 1){
                numeroPrimo = false;
            }
            else{
                numeroPrimo = true;
            }
                
        }
        
        if(numeroPrimo == true){
            System.out.println("O Número: "+numeroAleatorio+" é primo");
        }
        else{
            System.out.println("O Número: "+numeroAleatorio+" não é primo");
        }
    }
}
