import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("de: ");
        String from = scanner.nextLine();
        System.out.println("a: ");
        String to = scanner.nextLine();
        System.out.println("monto: ");
        String amount = scanner.nextLine();

        ConsultaCambioMoneda consulta = new ConsultaCambioMoneda();
        try {
            Cambio cambio = consulta.obtenerCambio(from, to, amount);
            System.out.println(cambio.conversion_result());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void menu(){

    }
}
