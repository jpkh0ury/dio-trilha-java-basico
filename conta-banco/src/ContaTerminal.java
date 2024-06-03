import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência!");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Digite seu nome!");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor do saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
