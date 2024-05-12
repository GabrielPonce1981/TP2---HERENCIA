public class Comercial extends Inmueble {

  public boolean aLaCalle;
  
  //Constructor
  public Comercial(int id, float valorM2, float tamanioM2, boolean aLaCalle, String direccion) {
    super(id, valorM2, tamanioM2, direccion);
    this.aLaCalle = aLaCalle;
  }

  public boolean getaLaCalle() {
    return aLaCalle;
  }

  public void setaLaCalle(boolean aLaCalle) {
    this.aLaCalle = aLaCalle;
  }

  

}