import java.util.Locale;
import java.util.Scanner;

public class PontoFlutuante {

    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Calculadora de Ponto Flutuante");
        System.out.println("Digite o valor de N (com ',') : ");
        String n = scanner.next();
        System.out.println("Digite o valor de X (com ',') : ");
        String x = scanner.next();
        String nConvertido = service.calcularExpoente(n);
        String xConvertido = service.calcularExpoente(x);
        service.calcularSoma(nConvertido, xConvertido);
    }

}
