import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua Agencia");
        int agencia = scanner.nextInt();
        System.out.println("Digite sua Conta");
        int conta = scanner.nextInt();
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        System.out.println("Digite seu saldo");
        int saldo = scanner.nextInt();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!");
    }
}