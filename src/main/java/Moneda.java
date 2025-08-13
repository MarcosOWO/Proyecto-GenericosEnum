public enum Moneda {

    /*
    Definimos nuestras enumeraciones
     */
    USD("USD","$",1.00),
    EUR("EUR", "€", 1.10),
    GBP("GBP", "£", 1.25),
    MXN("MXN", "$", 0.058),
    JPY("JPY", "¥", 0.0068);

    /*
    Creamos variables finales para cada tipo de dato dentro de la enumeracion
     */
    private final String iso;
    private final String simbolo;
    private final double usdPorUnidad;

    /*
    Con este constructor estamos seteando el dato
    con el tipo de dato que hemos definido antes
     */
    Moneda(String iso, String simbolo, double usdPorUnidad) {
        this.iso = iso;
        this.simbolo = simbolo;
        this.usdPorUnidad = usdPorUnidad;
    }

    /*
    Getters
     */
    public String getIso() {
        return iso;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double getUsdPorUnidad() {
        return usdPorUnidad;
    }

    /*
    función para convertir la moneda enumerada a dolares
     */
    public double convertirADolares(double cantidad){
        return cantidad * usdPorUnidad;
    }
}
