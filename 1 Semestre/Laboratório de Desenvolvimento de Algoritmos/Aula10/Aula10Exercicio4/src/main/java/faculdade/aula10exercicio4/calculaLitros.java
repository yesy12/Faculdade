/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.aula10exercicio4;

/**
 *
 * @author Alison
 */
public class calculaLitros {
    
    public static double calcula_Litros(double distancia_, double consumo_){
        double litros = distancia_/consumo_;
        return Math.ceil(litros);
    }
}
