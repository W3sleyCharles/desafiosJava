package Desafios.PrimeiroDesafio;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita o nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();

        System.out.println("Adicione um valor inicial a conta: ");
        int saldo = scanner.nextInt();

        scanner.close();


        Conta conta = new Conta(numero, agencia, nomeCliente, saldo);

        conta.contaCriada();
    }
}
