import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monedaOrigen, monedaDestino, monto;

        boolean continuar= true;
        
        mostrarMensajeBienvenida();
        while (continuar){
            mostrarMenu();

            String opcion= scanner.nextLine();

            switch (opcion) {
                case "1":
                    monedaOrigen="USD";
                    monedaDestino="ARS";
                    break;
                case "2":
                    monedaOrigen="ARS";
                    monedaDestino="USD";
                    break;
                case "3":
                    monedaOrigen="USD";
                    monedaDestino="BRL";
                    break;
                case "4":
                    monedaOrigen="BRL";
                    monedaDestino="USD";
                    break;
                case "5":
                    monedaOrigen="USD";
                    monedaDestino="COP";
                    break;
                case "6":
                    monedaOrigen="COP";
                    monedaDestino="USD";
                    break;
                case "7":
                    continuar = false;
                default:
                    System.out.println("Error: la opción elegida es incorrecta");
                    continue;

            }

            System.out.println("Ingrese un monto: ");
            monto = scanner.nextLine();

            try {

                Double.parseDouble(monto);

                ConsultaCambioMoneda consulta = new ConsultaCambioMoneda();
                Cambio cambio = consulta.obtenerCambio(monedaOrigen, monedaDestino, monto);
                mostrarResultado(monedaOrigen, monedaDestino, monto, cambio);

            } catch (NumberFormatException e) {

                System.out.println("Error: el monto debe ser un número válido.");

            } catch (IOException | InterruptedException e) {

                throw new RuntimeException(e);

            }

        }

    }
    public static void mostrarMensajeBienvenida(){
        System.out.println("""
            ****************************************************
            Bienvenido/a a MoneySwap
            """);
    }

    public static void mostrarMenu() {
        System.out.println("""
            Seleccione una opción:
            
            1) Dólar =>> Peso argentino
            2) Peso argentino =>> Dólar
            3) Dólar =>> Real brasileño
            4) Real brasileño =>> Dólar
            5) Dólar =>> Peso colombiano
            6) Peso colombiano =>> Dólar
            7) Salir

            """);
    }
    public static void mostrarResultado(String monedaOrigen, String monedaDestino, String monto, Cambio cambio){
        String mensaje = String.format("El valor %s [%s] corresponde al valor final de ==> %s [%s]\n",
                monto,
                monedaOrigen,
                cambio.conversion_result(),
                monedaDestino
        );
        System.out.println(mensaje);

    }
}
