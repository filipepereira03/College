public class Main {
public static void main(String[] args) {
        AppConta app = new AppConta();

        
        Conta conta1 = app.criaConta(1000.0, 39274);

        
        System.out.println("Saldo antes do saque: " + conta1.getSaldo());
        conta1 = app.sacarDinheiro(conta1, 200.0);
        System.out.println("Saldo após o saque: " + conta1.getSaldo());

        
        System.out.println("Saldo antes do depósito: " + conta1.getSaldo());
        conta1 = app.depositarDinheiro(conta1, 500.0);
        System.out.println("Saldo após o depósito: " + conta1.getSaldo());

        
        System.out.println("Número da Conta: " + conta1.getNumeroConta());
        System.out.println("Saldo atual: " + conta1.getSaldo());
    }
}







