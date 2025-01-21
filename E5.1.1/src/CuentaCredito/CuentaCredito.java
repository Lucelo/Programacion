package CuentaCredito;

public class CuentaCredito extends Cuenta {
    private double credito;

    public  CuentaCredito(){

        if(credito<300){
            this.credito=100;
        }

    }

    public CuentaCredito(double saldo, double credito){
        super(saldo);
        this.credito=credito;

    }

    public  CuentaCredito(double saldo){
        super(saldo);

        this.credito= 100;

    }

    public double getCredito() {
        return credito;
    }

    public void setCredito (double credito) {

    }

    public void ingresardinero(Double cantidad) throws CuentaException {
        if (cantidad <= 0){
            throw new CuentaException();
        } else if (creditoDisponible - creditoInicial) {
            setSaldo(getSaldo() + cantidad);
        } else {
            cantidad += creditoDisponible - creditoInicial;
            setSaldo(getSaldo()+cantidad);
            setCreditoDisponible(creditoInicial);
        }
    }

    public void retirarDinero (double cantidad) throws CuentaException {
        if (cantidad <= 0) {
            throw new CuentaException();
        } else if(cantidad > saldo + creditoDisponible) {
            throw new CuentaException();
        } else if (cantidad <= saldo) {
            setSaldo(saldo - cantidad);
        } else {
            cantidad = saldo - cantidad;
            setCreditoDisponible(getCreditoDisponible() + cantidad);        
            setSaldo(0);
        }

    }

}














