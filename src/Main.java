public class Main {
    public static void main(String[] args) {
//        Conta c1;
//         c1 = new Conta();
//        c1.numero = 123;
//        c1.titular = "Andreza";
//        c1.saldo = 2.000;
    Conta minhaConta = new Conta();
    Cliente c = new Cliente();
    minhaConta.titular = c;


    Cliente clientedaMinhaConta = minhaConta.titular;
    clientedaMinhaConta.nome = "Duke";
    // outra forma: minhaConta.titular.nome = "Duke";
    }
}