package Conta;

public class Conta {
    int numero;
    Cliente titular;
    // String titular;
    private double saldo;
    double salario;

   // void saca(double quantidade){
     //   double novoSaldo = this.saldo - quantidade;
   //     this.saldo = novoSaldo;
  //  }

    void deposita (double quantidade){
        this.saldo += quantidade;
    }

    boolean saca(double valor){
        if(this.saldo < valor){
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return false;
        }
    }

    //void transfere (Conta.Conta destino, double valor) {
      //  this.saldo = this.saldo - valor;
      //  destino.saldo = destino.saldo + valor;
    //}

    boolean transfere(Conta destino, double valor){
        boolean retirou = this.saca(valor);
        if(retirou == false){
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }

    public void mudaCPF(String cpf){
        //if(this.idade <= 60){
         //   validaCPF(cpf);
        //}
        //this.cpf = cpf;
    }



}
