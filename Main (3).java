class Main {
  public static void main(String[] args) {
    
    
    Automovel carro1 = new Automovel();
    carro1.setMarca("Fiat");
    carro1.setModelo("Uno");
    carro1.setCor("Branco");
    carro1.setCombustivel("Gasolina");
    System.out.println("Marca do carro: " + carro1.getMarca());
    System.out.println("Modelo: " + carro1.getModelo());
    System.out.println("Cor: " + carro1.getCor());
    System.out.println("Tipo de combustível: " + carro1.getCombustivel());
    
    System.out.println("_____________________________________________");
    
    Automovel carro2 = new Automovel();
    carro2.setMarca("GM");
    carro2.setModelo("Corsa");
    carro2.setCor("Azul");
    carro2.setCombustivel("Alcool");
    System.out.println("Marca do carro: " + carro2.getMarca());
    System.out.println("Modelo: " + carro2.getModelo());
    System.out.println("Cor: " + carro2.getCor());
    System.out.println("Tipo de combustível: " + carro2.getCombustivel());
    
    
  }
}