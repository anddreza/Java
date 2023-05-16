package Banco;

public class ContaCorrente extends Conta {

    public double calculaTributos(){
        return this.getSaldo() * 0.01;
    }

    private double getSaldo() {
        return 0;
    }
}
