package resol.GabrielukF.Ejercicio2;

import java.util.ArrayList;

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
        System.out.println("Contacto agregado");
    }

    public void listar() {
         if (contactos.isEmpty()) {
            System.out.println("Agenda vacía");
            return;
        }
        for (claseContacto c : contactos) {
            System.out.println(c.getNombre() + " - " + c.getTelefono() + salto);
        }
    }
    public boolean existeContacto(claseContacto c) {
        for (claseContacto contacto : contactos) {
            if (contacto.getTelefono().equals(c.getTelefono())) {
                return true;
            }
        }
        return false;
    }
     public void buscarContacto(String nombre) {
        for (claseContacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Teléfono: " + c.getTelefono());
                return;
            }
        }
        System.out.println("No se encontró el contacto");
    }
    public int espacioLibre() {
        return max - contactos.size();
    }
    public void eliminarContacto(claseContacto c) {
         String nombre = c.getNombre();
        if (contactos.removeIf(contacto ->
            contacto.getNombre().equalsIgnoreCase(nombre))) {
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("No se encontró el contacto");
        }
    }
}