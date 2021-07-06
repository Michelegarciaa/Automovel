public class Automovel{
  private String marca;
  private String modelo;
  private String cor;
  private String combustivel;
  private double velocidade;
  
  
  public String getMarca(){
    return marca;
  }
  
  public void setMarca(String marca){
    this.marca = marca;
  }
  
  public String getModelo(){
    return modelo;
  }
  
  public void setModelo(String modelo){
    this.modelo = modelo;
  }
  
  public String getCor(){
    return cor;
  }
  
  public void setCor(String cor){
    this.cor = cor;
  }
  
  public String getCombustivel(){
    return combustivel;
  }
  
  public void setCombustivel(String combustivel){
    this.combustivel = combustivel;
  }
  
  public void ligar(){
    System.out.println("VRUUUUUMMMMM");
  }
  
  public void desligar(){
    System.out.println("Shhhhhhhhhh");
  }
  
  public void acelerar(double valor){
    this.velocidade += valor;
  }
  
  public void frear(double valor){
    this.velocidade -= valor;
  }
  
}