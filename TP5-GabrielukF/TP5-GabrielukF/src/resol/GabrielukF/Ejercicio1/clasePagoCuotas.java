package resol.GabrielukF.Ejercicio1;

public class clasePagoCuotas implements clasePago {
    private int cuotas;

    public clasePagoCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public double calcularPrecio(double precioBase) {
        double precio = precioBase;

        if (cuotas > 12) {
            precio *= 1.12;
        } else if (cuotas > 6) {
            precio *= 1.08;
        } else if (cuotas > 3) {
            precio *= 1.05;
        }

        return precio;
    }

    public int getCuotas() {
        return cuotas;
    }
}