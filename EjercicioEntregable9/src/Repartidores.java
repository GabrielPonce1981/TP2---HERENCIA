public class Repartidores extends Empleado {
    private int repartosExtras;

        public Repartidores(String dni, String nombre, String domicilio, int fechaIngreso, double sueldoBasico, int repartosExtras) {
            super( dni, nombre, domicilio, fechaIngreso, sueldoBasico);
            this.repartosExtras = repartosExtras;
        }


        public double calcularSueldoMensual() {
            return sueldoBasico +( repartosExtras * 500);
        }


        public int getRepartosExtras() {
            return repartosExtras;
        }


        public void setRepartosExtras(int repartosExtras) {
            this.repartosExtras = repartosExtras;
        }

        
}

