import java.util.Scanner;
public class Sistema {
    Prestamos autos;
    Scanner leer_opcion;
    Scanner leer_auto_a_devolver;
    Scanner leer_auto;

    public Sistema(){
        autos=new Prestamos();
        leer_opcion=new Scanner(System.in);
        leer_auto_a_devolver=new Scanner(System.in);
        leer_auto=new Scanner(System.in);
    }

    public void Sistema_Generador() {

        System.out.println("");
        System.out.println("    SISTEMA DE PRÉSTAMO DE AUTOS DE HERTZ");
        System.out.println("    =====================================");
        System.out.println("");
        autos.Rellenar_Cuadricula();
    }

    public void Menu(){

        int choice=0;
        int disponibles=0;
        int auto_a_devolver=0;
        int auto=0;

        while(choice!=4) {
            System.out.println("OPCIONES : ");
            System.out.println("");
            System.out.println("[1] : Registrar un préstamo.");
            System.out.println("[2] : Registrar una devolución.");
            System.out.println("[3] : Revisar el estado actual de un vehículo.");
            System.out.println("[4] : Cerrar sesión.");

            choice = leer_opcion.nextInt();

            if (choice == 1) {
                for (int i = 0; i < 10; i++) {
                    if (autos.control[i].equalsIgnoreCase("Disponible")) {
                        disponibles++;
                    }
                }

                if (disponibles > 0) {
                    autos.Prestar_Auto();
                }
            }

            if (choice == 2) {
                autos.Devolver_Auto();
            }

            if (choice == 3) {
                System.out.println("");
                System.out.println("Ingrese numero de estacionamiento al que pertenece el vehículo  : ");
                System.out.println("");
                auto = leer_auto.nextInt();
                autos.Buscar_Vehiculo(auto);
            }
        }
        System.out.println("Ha cerrado exitosamente la sesión.");
    }
}
