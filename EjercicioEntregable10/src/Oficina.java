public class Oficina extends Comercial {

  private static final double precioMetroCuadrado = 1500000;
  //Constructor
  public Oficina(char[] id, float valorM2, float tamanioM2, String direccion, boolean aLaCalle) {
    super(id, valorM2, tamanioM2, aLaCalle, direccion);
  }

  public void imprimir() {
  }

}