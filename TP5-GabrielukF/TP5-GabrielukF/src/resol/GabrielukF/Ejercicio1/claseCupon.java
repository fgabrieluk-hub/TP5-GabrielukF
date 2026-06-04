package resol.GabrielukF.Ejercicio1;

public class claseCupon {

    private double porcentajeDescuento = 0.10;

    public double calcularDescuento(double precio) {
        return precio * porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
}
