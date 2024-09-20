import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        System.out.println("\n Seja bem vindo, \n Por favor, digite o número da Agência! ");
        int numero = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Digite a sua agencia");
        String agencia = leitor.next();
        leitor.nextLine();
        System.out.println("Digite o nome do Cliente");
        String nome = leitor.nextLine();
        System.out.println("Digite o seu saldo: ");
        double saldo = leitor.nextDouble();
        leitor.nextLine();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +" , sua conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
