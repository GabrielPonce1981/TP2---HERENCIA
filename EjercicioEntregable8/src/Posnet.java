public class Posnet {
    private double monto;
    private int cantidadCuotas;
    
    double montoTotal, montoCuota;

    public void efectuarCobro(TarjetaDeCredito tarjeta, double monto, int cantidadCuotas) {

        if (cantidadCuotas > 1 && cantidadCuotas <= 6) {

            montoTotal = monto * cantidadCuotas * 0.3 + monto;
            montoCuota = montoTotal / cantidadCuotas;

            if (tarjeta.getSaldoDisponible() >= montoTotal) {
                tarjeta.setSaldoDisponible(tarjeta.getSaldoDisponible() - montoTotal);
                imprimirTicket(tarjeta, montoTotal, cantidadCuotas);
            } 
            else 
            {
                System.out.println("No posee saldo suficiente para realizar la operacion en esa cantidad de cuotas --- NULL---");
                System.out.println("\n");
            }
        } else if (cantidadCuotas == 1) 
        {
            montoTotal = monto;
            imprimirTicket(tarjeta, montoTotal, cantidadCuotas);
            
        } else 
        {
            System.out.println("La cantidad de cuotas deben ser minimo 1 y no exeder de 6");
            System.out.println("\n");
        }
    }

    public void imprimirTicket(TarjetaDeCredito tarjeta, double monto, int cantidadCuotas) {
        System.out.println("------Ticket-----");
        System.out.println("Nombre: " + tarjeta.getTitular().getNombre());
        System.out.println("Apellido: " + tarjeta.getTitular().getApellido());
        System.out.println("El monto a pagar es: " + montoTotal);
        System.out.println("Numero de cuotas: " + cantidadCuotas);
        System.out.println("Valor por cuota: " + montoCuota);
        System.out.println("Gracias por su compra");
    }

}
