public class Inmueble {

  private char id [] = new char[5];
  private float valorM2;
  private float tamanioM2;
  private String direccion;

  //Constructor
  public Inmueble(char[] id , float valorM2, float tamanioM2, String direccion) {
    this.id = id;
    this.valorM2 = valorM2;
    this.tamanioM2 = tamanioM2;
    this.direccion = direccion;
    
  }
  
  public void imprimir() {
    System.out.println("ID Inmueble: " + String.valueOf(id));
    System.out.println("Valor en metros cuadrados: " + valorM2);
    System.out.println("Tamanio en metros cuadrados: " + tamanioM2);
    System.out.println("Direccion: " + direccion);


  }


  public void calcularPrecioVenta() {
  }

  public char[] getId() {
    return id;
  }

  public void setId(char[] id) {
    this.id = id;
  }

  public float getValorM2() {
    return valorM2;
  }

  public void setValorM2(float valorM2) {
    this.valorM2 = valorM2;
  }

  public float getTamanioM2() {
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