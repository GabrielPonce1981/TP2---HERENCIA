public class TarjetaDeCredito {
    private String entidadFinancieraEmisora;
    private String entidadBancaria;
    private String numeroDeTarjeta;
    private double saldoDisponible;
    private Titular titular;

    public TarjetaDeCredito(String entidadFinancieraEmisora, String entidadBancaria, String numeroDeTarjeta, double saldoDisponible, Titular titular){
        this.entidadFinancieraEmisora = entidadFinancieraEmisora;
        this.entidadBancaria = entidadBancaria;
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.titular = titular;
    
    }

    public String getEntidadFinancieraEmisora() {
        return entidadFinancieraEmisora;
    }

    public void setEntidadFinancieraEmisora(String entidadFinancieraEmisora) {
        this.entidadFinancieraEmisora = entidadFinancieraEmisora;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public String getNumeroDeTarjeta() {
        return numeroDeTarjeta;
    }

    public void setNumeroDeTarjeta(String numeroDeTarjeta) {
        this.numeroDeTarjeta = numeroDeTarjeta;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    



}

