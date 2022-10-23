package faculdade.trabalho_revendedora_carro_32130023;

/**
 *
 * @author Alison
 */
public class Carro {
    private int anoModelo;
    private String cor;
    private float valor;
    private float valorReajustado;
    private boolean aceitaFinanciamento;
    private String marcaModelo;
    
    public Carro(int anoModelo_, String cor_,float valor_,boolean financiamento_, String marca_modelo){
        this.setAnoModelo(anoModelo_);
        this.setColor(cor_);
        this.setValor(valor_);
        this.setSituacaoFinanciamento(financiamento_);
        this.setMarcaModelo(marca_modelo);
    }
    
    public int getAnoModelo(){
        return anoModelo;
    }
    public void setAnoModelo(int model){
        anoModelo = model;
    }
 
    public String getCor(){
        return cor;
    }
    public void setColor(String color){
        cor = color;
    }
      
    public float getValor(){
        return valor;
    }    
    public void setValor(float value){
        valor = value;
    }
    
    public float getValorReajustado(){
        return valorReajustado;
    }
    
    public void setValorReajustado(float valor){
        valorReajustado = valor;
    }
    
    public boolean getSituacaoFinanciamento(){
        return aceitaFinanciamento;
    }
    public void setSituacaoFinanciamento(boolean financiamento){
        aceitaFinanciamento = financiamento;
    }
      
    public String getMarcaModelo(){
        return marcaModelo;
    }    
    public void setMarcaModelo(String modelo){
        marcaModelo = modelo;
    }
    
}
