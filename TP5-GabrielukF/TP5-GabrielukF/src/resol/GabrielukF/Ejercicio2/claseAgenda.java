package resol.GabrielukF.Ejercicio2;

import java.util.ArrayList;

public class claseAgenda {

    private ArrayList<claseContacto> contactos;
    private int maxContactos;


    public claseAgenda() {
        this.maxContactos = 10;
        this.contactos = new ArrayList<>();
    }


    public claseAgenda(int maxContactos) {
        this.maxContactos = maxContactos;
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(claseContacto c) {
        if (agendaLlena()) {
            System.out.println("Agenda llena");
            return;
        }

        for (claseContacto contacto : contactos) {
            if (contacto.getTelefono().equals(c.getTelefono())) {
                System.out.println("Ya existe un contacto con ese número");
                return;
            }
        }

        contactos.add(c);
        System.out.println("Contacto agregado");
    }


    public boolean existeContacto(claseContacto c) {
        for (claseContacto contacto : contactos) {
            if (contacto.getTelefono().equals(c.getTelefono())) {
                return true;
            }
        }
        return false;
    }


    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("Agenda vacía");
            return;
        }

        for (claseContacto c : contactos) {
            System.out.println(c);
        }
    }


    public void buscaContacto(String nombre) {
        for (claseContacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Teléfono: " + c.getTelefono());
                return;
            }
        }
        System.out.println("No se encontró el contacto");
    }

    public void eliminarContacto(claseContacto c) {
        if (contactos.removeIf(contacto -> contacto.getTelefono().equals(c.getTelefono()))) {
            System.out.println("Contacto eliminado");
        } else {
            System.out.println("No se encontró el contacto");
        }
    }

    public boolean agendaLlena() {
        return contactos.size() >= maxContactos;
    }

    public int espacioLibre() {
        return maxContactos - contactos.size();
    }
}