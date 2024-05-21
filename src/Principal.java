import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe la moneda que deseas convertir");
        String monedaBase = teclado.nextLine();
        System.out.println("Escribe la moneda a la que deseas convertir");
        String mondedaConvertida = teclado.nextLine();
        ConsultaTipoDeCambio consulta = new ConsultaTipoDeCambio();
        Moneda moneda = consulta.consultaTipoDeCambio(monedaBase);
        System.out.println("Por cada " + moneda.base_code() + " hay " + moneda.conversion_rates().get(mondedaConvertida) + " " + mondedaConvertida);
    }
}
