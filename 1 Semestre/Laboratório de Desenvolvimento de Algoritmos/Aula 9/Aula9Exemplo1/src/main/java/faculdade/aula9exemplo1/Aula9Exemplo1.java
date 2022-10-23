/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package faculdade.aula9exemplo1;

/**
 *
 * @author Alison
 */

import java.util.Scanner;

public class Aula9Exemplo1 {

    public static void main(String[] args) {
        int lines = 5, columns = 4, valorAtual,buscado;
        int [][] matriz = new int[5][4];
        boolean encontrado = false;
        
        Scanner leitura;
        for(int i = 0; i < lines; i++){
            for(int j = 0; j < columns; j++){
                System.out.print("Digite o valor para "+(i+1)+"x"+(j+1)+": ");
                leitura = new Scanner(System.in);
                valorAtual = leitura.nextInt();
                matriz[i][j] = valorAtual;
            }
        }
        
        System.out.print("\nDigite o valor a procurar: ");
        leitura = new Scanner(System.in);
        buscado = leitura.nextInt();
        
        for(int i = 0; i < lines; i++){
            for(int j = 0; j < columns; j++){
                valorAtual = matriz[i][j];
                if(valorAtual == buscado){
                    encontrado = true;
                    break;
                }
            }
            if(encontrado == true){
                break;
            }
        }
        if(encontrado){
            System.out.print("O valor de: {"+buscado+"} foi encontrado");    
        }
        else{
            System.out.print("O valor de: {"+buscado+"} não foi encontrado");    
        }
        
        
    }
}
