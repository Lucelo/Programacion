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
        super.credito=100;
    }

}
