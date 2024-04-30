public class TarjetadeCredito {
    private String numeroTarjeta;
    private String entidademisora;
    private Titular titular;
    private double saldodisponible;
    
    
    
    
    public TarjetadeCredito(String numeroTarjeta, String entidademisora, double monto, Titular titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.entidademisora = entidademisora;
        this.titular = titular;
        this.saldodisponible = monto;
    }

    public boolean tienesaldo(int montoacobrar) {
        return saldodisponible >= montoacobrar;
    }

    
}
