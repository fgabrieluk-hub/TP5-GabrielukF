package resol.GabrielukF.Ejercicio1;

public class claseCompra {
    private clasePrenda prenda;
    private double precioFinal;

    public claseCompra(clasePrenda prenda, double precioFinal) {
        this.prenda = prenda;
        this.precioFinal = precioFinal;
    }

    public void mostrar() {
        System.out.println("Prenda: " + prenda.getTipo());
        System.out.println("Talle: " + prenda.getTalle());
        System.out.println("Precio final: " + precioFinal);
    }
}