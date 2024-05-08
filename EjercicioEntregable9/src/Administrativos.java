public class Administrativos extends Empleado {
    public String jornadaLaboral;    

        public Administrativos(String dni, String nombre,  String domicilio, int fechaIngreso, String jornadaLaboral, double sueldoBasico) {
            super(dni, nombre, domicilio, fechaIngreso, sueldoBasico);
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