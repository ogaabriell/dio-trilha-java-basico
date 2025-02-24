import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicita e lê o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha para evitar problemas na próxima leitura

        // Solicita e lê o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo da conta
        System.out.println("Por favor, digite o saldo:");
        while (!scanner.hasNextDouble()) {
            // Se a entrada não for um número válido, solicita novamente
            System.out.println("Entrada inválida. Por favor, digite um valor numérico para o saldo:");
            scanner.next(); // Descartar a entrada inválida
        }
        double saldo = scanner.nextDouble();

        // Concatena as informações em uma mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        // Exibe a mensagem final
        System.out.println(mensagem);

        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}
