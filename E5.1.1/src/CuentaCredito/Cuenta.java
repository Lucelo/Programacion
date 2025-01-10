package CuentaCredito;

public class Cuenta {

    private double saldo;

    public Cuenta() {
        this.saldo=0;
    }

    public Cuenta(double saldo) {
        this.saldo=saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

}