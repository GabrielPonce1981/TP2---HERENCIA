
public class Administrativos extends Empleado {
    private String jornadaLaboral;

        public Administrativos(String dni, String nombre,  String domicilio, int fechaIngreso, String categoria, String jornadaLaboral) {
            super(dni, nombre, domicilio, fechaIngreso, categoria);
            this.jornadaLaboral = jornadaLaboral;

        }


        public double calcularSueldomensual() {
            if(jornadaLaboral.equalsIgnoreCase("completa")){
                return getSueldoBasico();
            }
            else if(jornadaLaboral.equalsIgnoreCase("media jornada")){
                return getSueldoBasico()/2;
            }
            else
            {
                return getSueldoBasico();
            }
        }

        @Override
        public void imprimirRecibo() {
            System.out.println("Recibo de sueldo Administrativo");
            super.imprimirRecibo();
            System.out.println("Sueldo Mensual: " + calcularSueldomensual());
        }



        public String getJornadaLaboral() {
            return jornadaLaboral;
        }

        public void setJornadaLaboral(String jornadaLaboral) {
            this.jornadaLaboral = jornadaLaboral;
        }


        



}
