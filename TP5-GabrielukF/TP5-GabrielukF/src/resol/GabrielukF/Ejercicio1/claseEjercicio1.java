package resol.GabrielukF.Ejercicio1;

import java.util.Scanner;
import java.util.ArrayList;

public class claseEjercicio1 {

public static void ejecutar() {
Scanner sc = new Scanner(System.in);

        ArrayList<clasePrenda> catalogo = new ArrayList<>();

    catalogo.add(new clasePrenda("Camisa", "M", 8000));
    catalogo.add(new clasePrenda("Pantalon", "L", 12000));
    catalogo.add(new clasePrenda("Zapatillas", "42", 20000));
    catalogo.add(new clasePrenda("Campera", "XL", 25000));

    System.out.println("----- CATALOGO DE ROPA -----");

    for (int i = 0; i < catalogo.size(); i++) {
    System.out.print((i + 1) + ") ");
    catalogo.get(i).mostrarPrenda();
}

System.out.println("Seleccione una prenda (numero):");
int opcion = sc.nextInt();
sc.nextLine();

clasePrenda prenda = catalogo.get(opcion - 1);


double precioBase = prenda.getPrecioBase();


        

        System.out.println("Metodo de pago (Contado/Cuotas):");
        String metodoPago = sc.nextLine();

        clasePagoContado pagoContado = new clasePagoContado();
        clasePagoCuotas pagoCuotas = new clasePagoCuotas();

        int cuotas = 0;

        if (metodoPago.equalsIgnoreCase("Cuotas")) {
            System.out.println("Ingrese cantidad de cuotas:");
            cuotas = sc.nextInt();
            sc.nextLine();
        }


        System.out.println("¿Posee cupon? (Si/No):");
        String resp = sc.nextLine();

        boolean usaCupon = resp.equalsIgnoreCase("Si");
        claseCupon cupon = new claseCupon();

        double descuentoContado = 0;
        double recargoCuotas = 0;
        double descuentoCupon = 0;

        if (metodoPago.equalsIgnoreCase("Contado")) {
            descuentoContado = pagoContado.calcularDescuento(precioBase);
        }

        if (metodoPago.equalsIgnoreCase("Cuotas")) {
            recargoCuotas = pagoCuotas.calcularRecargo(precioBase, cuotas);
        }

        if (usaCupon) {
            descuentoCupon = cupon.calcularDescuento(precioBase);
        }

        double precioFinal = precioBase - descuentoContado + recargoCuotas - descuentoCupon;


        System.out.println("\n----- RESUMEN DE COMPRA -----");

        System.out.println("Prenda elegida: " + prenda.getDescripcion());
        System.out.println("Precio base: $" + precioBase);
        System.out.println("Metodo de pago: " + metodoPago);

        if (metodoPago.equalsIgnoreCase("Contado")) {
            System.out.println("Descuento por pago en efectivo: $" + descuentoContado);
        } else {
            System.out.println("Descuento por pago en efectivo: No aplica");
        }

        if (metodoPago.equalsIgnoreCase("Cuotas")) {
            System.out.println("Cantidad de cuotas: " + cuotas);
            System.out.println("Recargo por cuotas: $" + recargoCuotas);
        } else {
            System.out.println("Cantidad de cuotas: No aplica");
            System.out.println("Recargo por cuotas: No aplica");
        }

        if (usaCupon) {
            System.out.println("Descuento por cupon: $" + descuentoCupon);
        } else {
            System.out.println("Descuento por cupon: No aplica");
        }

        System.out.println("PRECIO FINAL: $" + precioFinal);

        sc.close();
    }
}
