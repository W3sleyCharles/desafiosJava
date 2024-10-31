package SegundoDesafio;
import java.util.concurrent.ThreadLocalRandom;


public class ControleCandidatos {

    public static void main(String[] args) {

        String candidatos[] = {"FELIPE", "HENRIQUE", "PEDRO", "AMANDA", "ISABELA", "HELLEN", "RODRIGO", "JOSE", "GUSTAVO", "IAGO", "VITOR"};

        double salarioBase = 2000.0;
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            /* System.out.println("O candidato " + candidato + " Solicitou o valor de " + salarioPretendido); */ 
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }



    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidatos (double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PRO CANDIDATO");
        }
        else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PRO CANDIDATO COM CONTRA PROPOSTA");
        }
        else {
            System.out.println("NÃO RETORNAR COM LIGAÇÃO");
        }

    }
}
