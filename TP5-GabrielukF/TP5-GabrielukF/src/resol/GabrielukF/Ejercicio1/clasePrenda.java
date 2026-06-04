package resol.GabrielukF.Ejercicio1;

public class clasePrenda {
    private String tipo;
    private double precio;
    private String talle;

    public clasePrenda(String tipo, double precio, String talle) {
        this.tipo = tipo;
        this.precio = precio;
        this.talle = talle;
    }

    public String getTipo() { return tipo; }
    public double getPrecio() { return precio; }
    public String getTalle() { return talle; }
}

