public class Inmueble {
    private int id;
    private double valorM2;
    private double tamanioM2;
    private String direccion;
  
    //Constructor
    public Inmueble(int id, double valorM2, double tamanioM2, String direccion) {
      this.id = id;
      this.valorM2 = valorM2;
      this.tamanioM2 = tamanioM2;
      this.direccion = direccion;
    }

    
    public double calcularPrecioInmueble() {
      return getValorM2() * getTamanioM2();
    }
  

    public void imprimir() {
      System.out.println("ID Inmueble: " + getId());
      System.out.println("Valor en metros cuadrados: " + getValorM2());
      System.out.println("Tamanio en metros cuadrados: " + getTamanioM2());
      System.out.println("Direccion: " + getDireccion());
      System.out.println("Precio de venta: " + calcularPrecioInmueble());
  
    }
  
  
    public int getId() {
      return id;
    }
  
    public void setId(int id) {
      this.id = id;
    }
  
    public double getValorM2() {
      return valorM2;
    }
  
    public void setValorM2(float valorM2) {
      this.valorM2 = valorM2;
    }
  
    public double getTamanioM2() {
      return tamanioM2;
    }
  
    public void setTamanioM2(float tamanioM2) {
      this.tamanioM2 = tamanioM2;
    }
  
    public String getDireccion() {
      return direccion;
    }
  
    public void setDireccion(String direccion) {
      this.direccion = direccion;
    }
  
    
  
}
