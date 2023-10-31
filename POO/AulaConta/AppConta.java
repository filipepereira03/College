public class AppConta {

    public Conta criaConta(double saldoInicial, int numeroConta) {
        return new Conta(saldoInicial, numeroConta);
    }

    public Conta sacarDinheiro(Conta conta, double valor) {
        conta.sacar(valor);
        return conta;
    }

    public Conta depositarDinheiro(Conta conta, double valor) {
        conta.depositar(valor);
        return conta;
    }
}