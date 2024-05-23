import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Informe o número de sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o numero da Agência: ");
        String agenciaBancaria = scanner.next();

        System.out.println("Insira o valor do depósito: ");
        double valorDeposito = scanner.nextDouble();

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaBancaria + ", conta " + numeroConta + " e seu saldo " + valorDeposito + " já está disponível para saque.");
    }
}
