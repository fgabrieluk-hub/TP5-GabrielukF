package resol.GabrielukF.Ejercicio2;

import java.util.*;

public class claseEjercicio2 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        claseAgenda agenda = new claseAgenda();
        String salto = System.lineSeparator();
        int op;

        do {
            System.out.println(salto + "1- Agregar");
            System.out.println("2- Listar");
            System.out.println("0- Salir");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println(salto + "Ingrese el nombre: ");
                    String nom = sc.next();
                    System.out.println("Ingrese el Telefono: ");
                    String tel = sc.next();
                    
                    if(tel.length() == 10){
                        agenda.agregarContacto(new claseContacto(nom, tel));
                    }else {
                        System.out.println("Telefono incorrecto, debe contener 9 caracteres.");
                    }

                    break;

                case 2:
                    agenda.listarContactos();
                    break;
            }

        } while (op != 0);
        sc.close();
    }
}