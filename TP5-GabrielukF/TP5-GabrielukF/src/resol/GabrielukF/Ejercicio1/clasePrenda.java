package resol.GabrielukF.Ejercicio1;

public class clasePrenda {

    private String tipo;
    private String talle;
    private double precioBase;


    public clasePrenda(String tipo, String talle, double precioBase) {
        this.tipo = tipo;
        this.talle = talle;
        this.precioBase = precioBase;
    }


    public String getTipo() {
        return tipo;
    }

    public String getTalle() {
        return talle;
    }

    public double getPrecioBase() {
        return precioBase;
    }


    public String getDescripcion() {
        return tipo + " - Talle: " + talle;
    }

    public void mostrarPrenda() {
        System.out.println(tipo + " | Talle: " + talle + " | Precio: $" + precioBase);
    }
}
