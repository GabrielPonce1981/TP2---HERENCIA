public class LocalComercial extends Comercial {

  public String centroComercial;
  private static final double precioMetroCuadrado = 3000000;
  //Constructor
  public LocalComercial(char[] id, float valorM2, float tamanioM2, String direccion, boolean aLaCalle, String centroComercial) {
    super(id, valorM2, tamanioM2, aLaCalle, direccion);
    this.centroComercial = centroComercial;
  }

  public void imprimir() {
  }

}