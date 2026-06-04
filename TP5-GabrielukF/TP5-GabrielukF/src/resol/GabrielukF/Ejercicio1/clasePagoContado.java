package resol.GabrielukF.Ejercicio1;

public class clasePagoContado {
 private double porcentajeDescuento = 0.15;

    public double calcularDescuento(double precio) {
        return precio * porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
}
