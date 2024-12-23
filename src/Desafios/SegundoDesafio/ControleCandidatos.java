package Desafios.SegundoDesafio;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ControleCandidatos {

    public static void main(String[] args) {
        

        String candidatos[] = {"FELIPE","MATHEUS","JOYCE","ARTHUR","WESLEY","MARIA","MILY", "HENRIQUE", "PEDRO", "AMANDA", "ISABELA", "HELLEN", "RODRIGO", "JOSE", "GUSTAVO", "IAGO", "VITOR"};

        double salarioBase = 2000.0;
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        List<String> ultimaEtapa = new ArrayList<>();

        List<String> contratado = new ArrayList<>();
        int possivelContratado = 0; 
        int entrevista = 0;

        while (candidatosSelecionados < 5) {

            if (candidatoAtual >= candidatos.length) {
                candidatoAtual = 0;
            }

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("-------------------------------------");
            System.out.println("O candidato " + candidato + " Solicitou o valor de " + salarioPretendido);
            analisarCandidatos(salarioPretendido);
            
            if(salarioBase >= salarioPretendido) {
                System.out.println("Parabéns " + candidato + ", você foi um dos candidatos selecionados, aguarde a ligação para maiores instruções");
                atenderLigacao();
                if(atenderLigacao() == true){
                    System.out.println("Parabéns " + candidato + " selecionamos você para a próxima etapa, agora aguarde o dia da entrevista");
                    candidatosSelecionados++;
                    ultimaEtapa.add(candidato);}
                else {
                    System.out.println("Infelizmente o candidato " + candidato + " não atendeu as ligações");
                    continue;
                }
                
            }
            candidatoAtual++;
        }
        System.out.println("-------------------------------------");
        System.out.println("Obrigado a todos que participaram, os canditados escolhidos para a próxima fase foram os: " + ultimaEtapa);

        while (entrevista < 1) {
            String concorrente = ultimaEtapa.get(possivelContratado);

            Random random = new Random();
            boolean valorAleatorio = random.nextBoolean();

            if(valorAleatorio == true){
                System.out.println("O candidato " + concorrente + " foi selecionado para a vaga");
                entrevista++;
                contratado.add(concorrente);
                break;
            }

            System.out.println("Infelizmente o candidato " + concorrente + " não foi aprovado para a vaga");

            if(possivelContratado == 4){
                System.out.println("Infelizmente não teremos aprovados para essa entrevista :(" );
                break;
            }
            possivelContratado++;


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
    
    static boolean atenderLigacao () {
        return new Random().nextInt(3)==1;
    }
}
