import java.util.Scanner;

class Compromisso {
    String compromisso;
    Horario horario = new Horario();
    Data data = new Data();

    void print() {
        System.out.println("\n----- Compromisso -----");
        System.out.println("Compromisso: " + compromisso);
        System.out.println("Horário: " + horario.hora + ":" + horario.minuto + ":" + horario.segundo);
        System.out.println("Data: " + data.dia + "/" + data.mes + "/" + data.ano + " - " + data.diadasemana);
    }
}

class Horario {
    int hora;
    int minuto;
    int segundo;
}

class Data {
    int dia;
    int mes;
    int ano;
    String diadasemana;
}

public class Main2 {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Compromisso compromisso = new Compromisso();

        System.out.print("Digite o compromisso: ");
        compromisso.compromisso = entrada.nextLine();
        System.out.print("Digite a hora: ");
        compromisso.horario.hora = entrada.nextInt();
        entrada.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite os minutos: ");
        compromisso.horario.minuto = entrada.nextInt();
        System.out.print("Digite os segundos: ");
        compromisso.horario.segundo = entrada.nextInt();
        entrada.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite o dia: ");
        compromisso.data.dia = entrada.nextInt();
        entrada.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite o mês: ");
        compromisso.data.mes = entrada.nextInt();
        entrada.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite o ano: ");
        compromisso.data.ano = entrada.nextInt();
        entrada.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite o dia da semana: ");
        compromisso.data.diadasemana = entrada.nextLine();
        compromisso.print();
    }
}
