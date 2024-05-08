public class Administrativos extends Empleado {
    private String jornadaLaboral;

        public Administrativos(String dni, String nombre,  String domicilio, int fechaIngreso, String jornadaLaboral, double sueldoBasico, Categoria categoria) {
            super(dni, nombre, domicilio, fechaIngreso, sueldoBasico, categoria);
            this.jornadaLaboral = jornadaLaboral;

        }

        public double calcularSueldomensual() {
            if(jornadaLaboral.equalsIgnoreCase("completa")){
                return sueldoBasico;
            }
            else if(jornadaLaboral.equalsIgnoreCase("media jornada")){
                return sueldoBasico/2;
            }
            else
            {
                return sueldoBasico;
            }
        }

        public String getJornadaLaboral() {
            return jornadaLaboral;
        }

        public void setJornadaLaboral(String jornadaLaboral) {
            this.jornadaLaboral = jornadaLaboral;
        }


        



}
