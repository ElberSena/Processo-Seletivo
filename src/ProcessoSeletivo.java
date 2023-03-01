import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCanditados();
        analiseCanditado(2000.0);
    }
    static void selecaoCanditados(){
        String [] canditados = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO","MONICA", "FABRICIO", "MIRELA", "DANIELA", "GESSICA"};

        int canditadosSelecionados = 0;
        int canditadoAtual = 0;
        double salarioBase= 2000.0;
        while (canditadosSelecionados < 5 && canditadoAtual < canditados.length){
            String canditado = canditados[canditadoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O canditado "+ canditado + " solicitou este valor de salário "+ salarioPretendido);
            if (salarioBase>=salarioPretendido){
                System.out.println("O canditado " + canditado + " foi selecionado");
                canditadosSelecionados++;
            }
            canditadoAtual++;
        }

    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analiseCanditado(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("lIGAR PARA CANDITADO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDITADO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGARDAR O RESULTADO DOS DEMAIS CANDITADOS");
        }
    }

}