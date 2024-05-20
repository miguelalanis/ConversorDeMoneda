public class Principal {
    public static void main(String[] args) {
        ConsultaTipoDeCambio consulta = new ConsultaTipoDeCambio();
        Moneda moneda = consulta.consultaTipoDeCambio("MXN");
        System.out.println("Por cada " + moneda.base_code() + " hay " + moneda.conversion_rates().get("USD") + " USD ");
    }
}
