package Aprendizado.Construtor;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("157.654.321.24", "Felipe");
      

        System.out.println("O aluno " + pessoa1.getNome() + " tem " + pessoa1.getCpf() + " anos ");
    }

}
