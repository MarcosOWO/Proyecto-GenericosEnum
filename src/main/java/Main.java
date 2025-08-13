public class Main {

    public static void main(String[] args) {

        Moneda moneda = Moneda.EUR;

        Double cantidadAConvertir = 50.0;
        Double resultado = moneda.convertirADolares(cantidadAConvertir);

        System.out.println("El resultado en dolares de "
                + cantidadAConvertir + moneda.getSimbolo() + " = " + resultado);



    }
}
