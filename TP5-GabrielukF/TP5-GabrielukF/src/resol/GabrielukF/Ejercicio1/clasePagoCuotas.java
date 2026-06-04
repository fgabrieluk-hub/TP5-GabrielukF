package resol.GabrielukF.Ejercicio1;

public class clasePagoCuotas {

    private double porcentajePorCuota = 0.05;

    public double calcularRecargo(double precio, int cuotas) {
        return precio * (porcentajePorCuota * cuotas);
    }

    public double getPorcentajePorCuota() {
        return porcentajePorCuota;
    }
}
