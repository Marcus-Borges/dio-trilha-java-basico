import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Conhecer e importar a classe Scanner
        // Exibir as mensagens para o usuário
        // Obter pela classe Scanner os valores digitados no terminal
        // Exibir a mensagem da conta criada
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();  // Usar nextLine() para capturar o nome completo

        System.out.println("Digite sua agência: ");
        String agencia = scanner.nextLine();  // Usar nextLine() para capturar a agência com espaços

        System.out.println("Digite sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        // Use nextLine() para evitar problemas com o buffer e faça parsing manual do valor
        double saldo = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível.");
    }
}