
public class Repartidores extends Empleado {
    private int repartosExtras;
    private final double precioReparto = 500.0;

        public Repartidores(String dni, String nombre, String domicilio, int fechaIngreso, String categoria, int repartosExtras) {
            super( dni, nombre, domicilio, fechaIngreso,categoria);
            this.repartosExtras = repartosExtras;
        }

        public double calcularsueldoReparto(){
            return getRepartosExtras() * precioReparto ;
        }

        public double calcularSueldoMensual() {
            return getSueldoBasico() + calcularsueldoReparto();
        }

        @Override
        public void imprimirRecibo(){
            System.out.println("Recibo de suledo Repartidor");
            super.imprimirRecibo();
            System.out.println("Comision por repartos: " + calcularsueldoReparto());
            System.out.println("Sueldo total: " + calcularSueldoMensual());
        }


        public int getRepartosExtras() {
            return repartosExtras;
        }

        
        public void setRepartosExtras(int repartosExtras) {
            this.repartosExtras = repartosExtras;
        }


        
}

