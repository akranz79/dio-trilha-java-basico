import java.util.Scanner;
public class ContaTerminal {
    private int numeroCC;
    private String agencia;
    private String nomeCliente;
    private double saldoCC;

    
    public static void main(String[] args) {

        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();
        
        System.out.print("Por favor, digite o seu nome: ");
        conta.nomeCliente = scanner.nextLine();
        
        System.out.print("Por favor, digite o numero da Agencia: ");
        conta.agencia = scanner.nextLine();

        System.out.print("Por favor, digite o numero da Conta: ");
        conta.numeroCC = scanner.nextInt();

        System.out.print("Por favor, digite o seu Saldo: ");
        conta.saldoCC = scanner.nextDouble();

        //Exibir as mensagens para o usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        System.out.println("Olá "+conta.nomeCliente+" , obrigado por criar uma conta em nosso banco, sua agencia é " + conta.agencia + ", conta "+conta.numeroCC+" e seu saldo R$ "+conta.saldoCC+" já está disponível para saque.");

        scanner.close();
    }
}
