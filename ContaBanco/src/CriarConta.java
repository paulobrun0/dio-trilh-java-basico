public class CriarConta {
    String customerName;
    int accountNumber;
    String agency;
    double balance;

    public CriarConta(String customerName, int accountNumber, String agency, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.balance = balance;
    }

    public String showInformation() {
        return "Olá " + customerName + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agency +
                ", conta " + accountNumber + " e seu saldo " + balance + " já está disponível para saque.";
    }

}