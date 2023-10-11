public class ContaBancária {
    private double saldo;
    private double rendimentoMensal;

    public ContaBancária(double saldo, double rendimentoMensal) {
        this.saldo = saldo;
        this.rendimentoMensal = rendimentoMensal;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    public void setRendimentoMensal(double novoRendimentoMensal) {
        this.rendimentoMensal = novoRendimentoMensal;
    }

    public void deposito(double deposito) {
        saldo += deposito;
    }

    public boolean sacar(double saque) {
        if (saldo >= saque) {
            saldo -= saque;
            return true;
        } else {
            return false;
        }
    }

    public double calcularRendimento() {
        return saldo * rendimentoMensal;
    }

    public double preverRendimento(int n) {
        return saldo * n * rendimentoMensal;
    }
}
