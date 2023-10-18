class ContaBancaria {
    private double saldo;
    private double rendimentoMensalPercentual;

    public ContaBancaria(double saldoInicial, double rendimentoMensalPercentual) {
        this.saldo = saldoInicial;
        this.rendimentoMensalPercentual = rendimentoMensalPercentual;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    public void calcularRendimentoMensal() {
        double rendimento = saldo * (rendimentoMensalPercentual / 100);
        saldo += rendimento;
        System.out.println("Rendimento mensal de R$" + rendimento);
    }

    public double preverRendimentoMensalComAporte(int meses, double aporteMensal) {
        for (int i = 0; i < meses; i++) {
            calcularRendimentoMensal();
            saldo += aporteMensal;
        }
        return saldo;
    }

    public double preverRendimentoMensal(int meses) {
        for (int i = 0; i < meses; i++) {
            calcularRendimentoMensal();
        }
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
