package resol.GabrielukF.Ejercicio2;

import java.util.*;

public class claseAgenda {
    String salto = System.lineSeparator();

    private ArrayList<claseContacto> contactos;
    private int max;

    public claseAgenda(int max) {
        this.max = max;
        contactos = new ArrayList<>();
    }

    public claseAgenda() {
        this(10);
    }

    public void agregarContacto(claseContacto c) {
        if (contactos.size() >= max) {
            System.out.println("Agenda llena");
            return;
        }

        for (claseContacto con : contactos) {
            if (con.getTelefono().equals(c.getTelefono())) {
                System.out.println("Telefono duplicado");
                return;
            }
        }

        contactos.add(c);
    }

    public void listar() {
        for (claseContacto c : contactos) {
            System.out.println(c.getNombre() + " - " + c.getTelefono() + salto);
        }
    }
}