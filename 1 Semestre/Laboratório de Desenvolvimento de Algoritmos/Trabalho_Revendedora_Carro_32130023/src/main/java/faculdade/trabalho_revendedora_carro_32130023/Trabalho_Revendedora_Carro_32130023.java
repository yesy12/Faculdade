package faculdade.trabalho_revendedora_carro_32130023;

/**
 *
 * @author Alison
 */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Trabalho_Revendedora_Carro_32130023 {

    public static void main(String[] args) {       
        int quantidadeValorReajustado = 0, quantidadeValorFinanciamento = 0;
        float aumentoAtual = 0f, valorAtual;
        Carro carAtual;
        
        String mensagemReajustada = "\tOpção\tAno\tCor\t  Valor\tFinanciamento\tMarca\t\n";
        mensagemReajustada += "\n\t------------------------------------------------------------------------------------------------------------------\n";
        
        String mensagemFinanciamento50k = "\tOpção\tAno\tCor\t  Valor\tFinanciamento\tMarca\t\n";
        mensagemFinanciamento50k += "\n\t------------------------------------------------------------------------------------------------------------------\n";
        
        Carro car01 = new Carro(2017, "Azul", 15620.18f,true, "Toyota");
        Carro car02 = new Carro(2018, "Preto", 35670.00f,false, "Ford");      
        Carro car03 = new Carro(2018, "Cinza", 15070.85f,false, "Honda");
        
        Carro car04 = new Carro(2019, "Vermelho", 10202.24f,true, "Ford");       
        Carro car05 = new Carro(2019, "Amarelo", 10353.00f,true, "Fiat");
        
        Carro car06 = new Carro(2020, "Roxo", 356630.06f,false, "Fiat");       
        Carro car07 = new Carro(2020, "Verde", 105039.06f,false, "Peugeot");
        
        Carro car08 = new Carro(2021, "Marrom", 400560.40f,false, "Mercedes");
        Carro car09 = new Carro(2022, "Lilas", 100400.00f,true, "Peugeot"); 
        Carro car10 = new Carro(2022, "Branco", 730500.00f,true, "Mercedes"); 
        
        Carro [] carrosArray = { car01, car02, car03, car04, car05, car06, car07, car08, car09, car10 };       
        
        //Reajuste
        for(int indice = 0; indice < carrosArray.length; indice++){
            carAtual = carrosArray[indice];            
            valorAtual = carAtual.getValor();
            
            if(carAtual.getAnoModelo() >= 2021){
                aumentoAtual = 0.05f;
            }
            else if(carAtual.getAnoModelo() == 2019 || carAtual.getAnoModelo() == 2020){
                aumentoAtual = 0f;
            }
            else if(carAtual.getAnoModelo() == 2017 || carAtual.getAnoModelo() == 2018){
                aumentoAtual = -0.05f;
            }
            
            valorAtual *= (aumentoAtual +1);
            carrosArray[indice].setValorReajustado(valorAtual);                        
        }
        
        //Resoluçoes A e B;
        for(int indice = 0; indice < carrosArray.length; indice++){                    
            carAtual = carrosArray[indice];                                 
            
            if(carAtual.getAnoModelo() > 2020 && carAtual.getValorReajustado() > 100000){                
                quantidadeValorReajustado+=1;
                mensagemReajustada += "\t"+quantidadeValorReajustado+"\t"  +carAtual.getAnoModelo()+"\t" +carAtual.getCor()+"\tR$: " +carAtual.getValorReajustado()+"\t    " 
                        +carAtual.getSituacaoFinanciamento()+"\t" +carAtual.getMarcaModelo();                                                              
                mensagemReajustada += "\n\t------------------------------------------------------------------------------------------------------------------\n";
            }
            
            if(carAtual.getSituacaoFinanciamento() == false && carAtual.getValorReajustado() < 50000){
                quantidadeValorFinanciamento+=1;
                mensagemFinanciamento50k += "\t"+quantidadeValorFinanciamento+"\t"  +carAtual.getAnoModelo()+"\t" +carAtual.getCor()+"\tR$: " +carAtual.getValorReajustado()+"\t    " 
                        +carAtual.getSituacaoFinanciamento()+"\t" +carAtual.getMarcaModelo();                                                              
                mensagemFinanciamento50k += "\n\t------------------------------------------------------------------------------------------------------------------\n";
            }
            
        }
        
        JOptionPane.showMessageDialog(null, new JTextArea(mensagemReajustada),"A)Carro depois de 2020, com valores acima de R$ 100.000,00",1);
        JOptionPane.showMessageDialog(null, new JTextArea(mensagemFinanciamento50k), "B)Carros que não aceitam financiamento, custando menos de R$ 50.000",1);
    }
}
