package Arrays;
// Crie uma classe TestaArrays e no método main crie um array de contas do tamanho 10. Em seguida, faça um
// laço para criar 10 contas cm saldos distintos e coloca-las no array
public class Main {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5];

        // crie 3 contas com saldos distintos e coloca-las no array
        contas[0] = new Conta();
        contas[0].deposita(10);
        contas[1] = new Conta();
        contas[1].deposita(20);
        contas[2] = new Conta();
        contas[2].deposita(30);

        for (int i = 0; i < contas.length; i++) {
            Conta conta = contas[i];
            if (contas != null) {
                System.out.println("Saldo da conta" + i + " "
                        + conta);
            } else {
                System.out.println("Nulo");
            }
        }

    }
}
