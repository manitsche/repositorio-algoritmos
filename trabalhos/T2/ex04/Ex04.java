public class Ex04 {

    public static void main(String[] args) {

        int multiplicando, multiplicador;

        for (multiplicando = 1; multiplicando <= 10; multiplicando++) {
            for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
                System.out.println(multiplicando + " X " + multiplicador + " = " + (multiplicando * multiplicador));
            }
        }
    }
}