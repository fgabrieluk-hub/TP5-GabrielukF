package resol.GabrielukF.Ejercicio2;

import java.util.*;

public class claseEjercicio2 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        claseAgenda agenda = new claseAgenda();
        String salto = System.lineSeparator();
        int op;

        do {
            System.out.println(salto + "1- Agregar contacto");
            System.out.println("2- Listar");
            System.out.println("3- Buscar contacto");
            System.out.println("4- Eliminar contacto");
            System.out.println("5- Espacios libres en la agenda");
            System.out.println("0- Salir");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println(salto + "Ingrese el nombre: ");
                    String nom = sc.next();
                    System.out.println("Ingrese el Telefono: ");
                    String tel = sc.next();
                    
                    if(tel.length() == 9){
                        agenda.agregarContacto(new claseContacto(nom, tel));
                    }else {
                        System.out.println("Telefono incorrecto, debe contener 9 caracteres.");
                    }
                    break;
                case 2:
                    agenda.listar();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del contacto a buscar: ");
                    String nombre = sc.next();
                    agenda.buscarContacto(nombre);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre o numero del contacto a eliminar: ");
                    String nombreEliminar = sc.next();
                    agenda.eliminarContacto(new claseContacto(nombreEliminar, null));
                    ;break;
                case 5:
                    System.out.println("Espacios libres en la agenda: " + agenda.espacioLibre());
                    ;break;
            }

        } while (op != 0);
        sc.close();
    }
}