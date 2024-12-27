package Desafios.PrimeiroDesafio;

public class Conta {
    private int numero = 0000;
    private String agencia = "067-8";
    private String nomeCliente = " ";
    private int saldo = 0;


    public Conta(int numero, String agencia, String nomeCliente, int saldo) {
        
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void contaCriada() {
        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo: " + saldo + ", já está disponível para saque");
    }
}
