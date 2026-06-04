package resol.GabrielukF.Ejercicio1;

import java.util.*;

public class claseEjercicio1 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        ArrayList<clasePrenda> catalogo = new ArrayList<>();
        ArrayList<claseCompra> compras = new ArrayList<>();

        catalogo.add(new clasePrenda("Camisa", 10000, "M"));
        catalogo.add(new clasePrenda("Pantalon", 15000, "L"));
        catalogo.add(new clasePrenda("Zapatillas", 20000, "42"));

        System.out.println("CATALOGO:");
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println(i + " - " + catalogo.get(i).getTipo());
        }

        System.out.println("Elegir prenda:");
        int op = sc.nextInt();
        clasePrenda p = catalogo.get(op);

        System.out.println("1- Contado | 2- Cuotas");
        int metodo = sc.nextInt();

        clasePago pago;
        double precioFinal;

        if (metodo == 1) {
            pago = new clasePagoContado();
            precioFinal = pago.calcularPrecio(p.getPrecio());
        } else {
            System.out.println("Cantidad de cuotas:");
            int cuotas = sc.nextInt();
            clasePagoCuotas pagoCuotas = new clasePagoCuotas(cuotas);
            pago = pagoCuotas;
            precioFinal = pago.calcularPrecio(p.getPrecio());
        }

        System.out.println("Tiene cupon? (1=si)");
        if (sc.nextInt() == 1) {
            precioFinal *= 0.9;
        }

        claseCompra c = new claseCompra(p, precioFinal);
        compras.add(c);

        c.mostrar();
        sc.close();
    }
}