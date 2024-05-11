public class Comercial extends Inmueble {

  public boolean aLaCalle;
  
  //Constructor
  public Comercial(char[] id, float valorM2, float tamanioM2, boolean aLaCalle, String direccion) {
    super(id, valorM2, tamanioM2, direccion);
    this.aLaCalle = aLaCalle;
  }

  public void imprimir() {
  }

}