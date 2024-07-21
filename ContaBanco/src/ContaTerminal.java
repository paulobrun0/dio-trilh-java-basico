import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String customerName = scanner.nextLine();

        System.out.println("Olá, " + customerName + ". Por favor, digite o número da agência:");
        String agency = scanner.nextLine();

        System.out.println("Olá, " + customerName + ". Por favor, digite o número da conta:");
        int accountNumber = scanner.nextInt();

        System.out.println("Olá, " + customerName + ". Por favor, digite o seu saldo inicial:");
        double balance = scanner.nextDouble();

        CriarConta criarConta = new CriarConta(customerName, accountNumber, agency, balance);

        String welcomeMessage = criarConta.showInformation();
        System.out.println(welcomeMessage);
    }
}
