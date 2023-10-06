import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta!");
        numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo inicial!");
        saldo = sc.nextDouble();
        sc.nextLine();

        
        //Exibir a mensagem conta criada

        String message = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(message);

        sc.close();
    }
}
