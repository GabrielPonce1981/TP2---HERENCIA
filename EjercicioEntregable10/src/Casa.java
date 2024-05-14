public class Casa extends Vivienda{
    public Casa( int id, double valorM2, double tamanioM2, String direccion, int numeroHabitaciones, int numeroBanios) {
        super(id, valorM2, tamanioM2, direccion, numeroHabitaciones, numeroBanios);
    }

    @Override
    public void imprimir() {
        super.imprimir();  
    }
}
