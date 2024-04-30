public class Posnet {
    private String numeroTarjeta;
    private String entidademisora;
    private String entidadbancaria;
    private double saldodisponible;
    private String datostitular;


   public void cobrar (TarjetadeCredito tarjeta, int monto, int cantidacuoatas){
        tarjeta.tienesaldo(monto);

        if (tarjeta.tienesaldo(monto)){
            System.out.println("Se ha realizado el pago de " + monto + " pesos");;
            
        }else{
            System.out.println("No se ha realizado el pago de " + monto + " pesos");
        }
   } 


}
