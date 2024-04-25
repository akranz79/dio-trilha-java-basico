import java.util.Scanner;

public class ContaTerminal {
    private int numeroCC;
    private String agencia;
    private String nomeCliente;
    private double saldoCC;

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.lerDadosConta();
        conta.exibirMensagemContaCriada();
    }

    private void lerDadosConta() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o seu nome: ");
        this.nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o numero da Agencia: ");
        this.agencia = scanner.nextLine();

        System.out.print("Por favor, digite o numero da Conta: ");
        this.numeroCC = scanner.nextInt();

        System.out.print("Por favor, digite o seu Saldo: ");
        this.saldoCC = scanner.nextDouble();

        scanner.close();
    }

    private void exibirMensagemContaCriada() {
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " 
                            + this.agencia + ", conta " + this.numeroCC + " e seu saldo R$ " + this.saldoCC + " já está disponível para saque.");
    }
}
