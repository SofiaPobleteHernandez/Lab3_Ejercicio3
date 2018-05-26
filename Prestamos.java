import java.util.Scanner;
public class Prestamos {
    Vehiculo[] cuadricula;
    Scanner leer_modelo;
    Scanner leer_seleccionado;
    Scanner leer_arrendatario;
    Scanner leer_fecha;
    Scanner leer_kilometraje;
    Scanner leer_bencina;
    String arrendatario;
    String fecha;
    String modelo;
    int seleccionado;
    int kilometraje;
    int bencina;
    String[]control;

    public Prestamos(){
        cuadricula=new Vehiculo[10];
        control = new String[10];
        leer_modelo=new Scanner(System.in);
        leer_seleccionado=new Scanner(System.in);
        leer_bencina=new Scanner(System.in);
        leer_kilometraje=new Scanner(System.in);
    }

    public int Rellenar_Cuadricula(){
        int kilometraje=0;
        for (int i=0; i<10; i++){
            cuadricula[i]=new Vehiculo();
            control[i]=new String();
            control[i]= "Disponible";
            System.out.println("Ingrese el marca del vehiculo : ");
            modelo=leer_modelo.next();
            if(modelo.equalsIgnoreCase("Peugeot")){
                cuadricula[i].setModelo("Peugeot 207");
                cuadricula[i].setCapacidad_de_tanque(40);
                kilometraje=(int)(Math.random()*2000);
                cuadricula[i].setKilometraje(kilometraje);
            }
            if(modelo.equalsIgnoreCase("Mazda")){
                cuadricula[i].setModelo("Mazda 2");
                cuadricula[i].setCapacidad_de_tanque(20);
                kilometraje=(int)(Math.random()*2000);
                cuadricula[i].setKilometraje(kilometraje);

            }
            if(modelo.equalsIgnoreCase("Jeep")){
                cuadricula[i].setModelo("Jeep Full");
                cuadricula[i].setCapacidad_de_tanque(60);
                kilometraje=(int)(Math.random()*2000);
                cuadricula[i].setKilometraje(kilometraje);

            }
            cuadricula[i].setArrendatario("No hay información disponible.");
            cuadricula[i].setFecha("No hay información disponible");
            cuadricula[i].setKilometraje_previo(kilometraje);
            cuadricula[i].setCapacidad_previa_de_estanque(cuadricula[i].getCapacidad_de_tanque());

        }
        return 0;
    }

    public int Prestar_Auto(){
        System.out.println("Ingrese el numero de estacionamiento del vehiculo a prestar : ");
        System.out.println("");
        seleccionado=leer_seleccionado.nextInt();

        if(control[seleccionado-1].equalsIgnoreCase("Prestado")){
            System.out.println("El vehículo no se encuentra disponible para préstamo. Por favor escoja otro");
        }

        if(control[seleccionado-1].equalsIgnoreCase("Disponible")) {

            System.out.println("Ingrese nombre del arrendatario (NombreApellido) : ");
            arrendatario=leer_arrendatario.next();
            cuadricula[seleccionado-1].setArrendatario(arrendatario);

            System.out.println("");
            System.out.println("Condiciones del arriendo : ");
            System.out.println("-Marca y Modelo del automóvil : " + cuadricula[seleccionado-1].getModelo());
            System.out.println("-Arrendado a                  : " + cuadricula[seleccionado-1].getArrendatario());
            System.out.println("-Capacidad de combustible     : " + cuadricula[seleccionado-1].getCapacidad_de_tanque());
            System.out.println("-Kilometraje                  : " + cuadricula[seleccionado - 1].getKilometraje());
            System.out.println("-Número de estacionamiento    : " + (seleccionado));
            control[seleccionado-1]="Prestado";
        }
        return 0;
    }

    public int Devolver_Auto(){

        System.out.println("Ingrese el número de estacionamiento del vehículo que desea devolver : ");
        seleccionado=leer_seleccionado.nextInt();
        System.out.println("Ingrese la fecha DD/MM/AAAA : ");
        fecha=leer_fecha.next();
        System.out.println("Ingrese kilometraje al momento de la devolución : ");
        kilometraje=leer_kilometraje.nextInt();
        System.out.println("Ingrese nivel de estanque en litros al momento de la devolución : ");
        bencina=leer_bencina.nextInt();


        if(control[seleccionado-1].equalsIgnoreCase("Disponible")){
            System.out.println("El vehículo se encuentra en la sucursal, por tanto, no puede devolverlo.");
        }

        if(control[seleccionado-1].equalsIgnoreCase("Prestado")){
            cuadricula[seleccionado-1].setFecha(fecha);
            cuadricula[seleccionado-1].setCapacidad_previa_de_estanque(cuadricula[seleccionado-1].getCapacidad_de_tanque());
            cuadricula[seleccionado-1].setKilometraje_previo(cuadricula[seleccionado-1].getKilometraje());
            cuadricula[seleccionado-1].setKilometraje(kilometraje);
            cuadricula[seleccionado-1].setCapacidad_de_tanque(bencina);

            System.out.println("");
            System.out.println("Condiciones de la devolución : ");
            System.out.println("-Marca y Modelo del automóvil : " + cuadricula[seleccionado-1].getModelo());
            System.out.println("-Arrendado a                  : " + cuadricula[seleccionado-1].getArrendatario());
            System.out.println("-Capacidad de combustible     : " + cuadricula[seleccionado-1].getCapacidad_de_tanque());
            System.out.println("-Kilometraje                  : " + cuadricula[seleccionado - 1].getKilometraje());
            System.out.println("-Número de estacionamiento    : " + (seleccionado));
            System.out.println("-Devuelto con fecha           : " + cuadricula[seleccionado-1].getFecha());
            control[seleccionado-1]="Disponible";
        }
        return 0;
    }

    public int Buscar_Vehiculo(int auto){

        System.out.println("ESTADO ACTUAL DEL VEHICULO : ");
        System.out.println("-Numero de estacionamiento                  : " + (auto));
        System.out.println("-Prestado / Disponible                      : " + control[auto-1]);
        System.out.println("-Marca y modelo                             : " + cuadricula[seleccionado-1].getModelo());
        System.out.println("-Devuelto por última vez por                : " + cuadricula[seleccionado-1].getArrendatario());
        System.out.println("-Fecha de última devolución                 : " + cuadricula[seleccionado-1].getFecha());
        System.out.println("-Kilometraje registrado al arrendar         : " + cuadricula[seleccionado-1].getKilometraje_previo());
        System.out.println("-Kilometraje registrado al devolver         : " + cuadricula[seleccionado-1].getKilometraje());
        System.out.println("-Capacidad de estanque al arrendar          : " + cuadricula[seleccionado-1].getCapacidad_previa_de_estanque());
        System.out.println("-Capacidad de estanque al devolver          : " + cuadricula[seleccionado-1].getCapacidad_de_tanque());
        return 0;
    }
}