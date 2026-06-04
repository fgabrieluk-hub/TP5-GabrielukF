package resol.GabrielukF.Ejercicio1;

public class clasePagoContado implements clasePago {

    @Override
    public double calcularPrecio(double precioBase) {
        return precioBase * 0.85;
    }
}