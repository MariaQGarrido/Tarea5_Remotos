package tarea;
import java.util.*;
/**
 * @author Cristhian C. && María Q Garrido
 */
public class CasaMain {
    public static String nombre;
    public static Double metrosCuadrados;
    public static int puertas;
    public static int ventanas;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){

        datosGenerales();
        System.out.println("¿Tiene puerta blindada? Si/No");
        String esBlindada = sc.nextLine();
        boolean isBlindada = false;
        if (esBlindada.equalsIgnoreCase("si")){
            isBlindada=true;
        } else{
            isBlindada=false;
        }
        Hall hall = new Hall(nombre, metrosCuadrados, puertas, ventanas, isBlindada);


        datosGenerales();
        System.out.println("¿Tiene tendedero? Si/No");
        String tieneTendedero = sc.nextLine();
        boolean isTendedero = false;
        double metrosTendedero = 0.0;
        if (tieneTendedero.equalsIgnoreCase("si")){
            isTendedero=true;

            System.out.println("Dime los metros cuadrados del tendedero: ");
            metrosTendedero = Double.parseDouble(sc.nextLine());
        } else{
            isTendedero=false;
        }
        Cocina cocina = new Cocina(nombre, metrosCuadrados, puertas, ventanas, isTendedero, metrosTendedero);


        datosGenerales();
        System.out.println("Cuantas tomas de red tiene: ");
        int tomasRed = Integer.parseInt(sc.nextLine());
        System.out.println("¿Tiene terraza? Si/No");
        String tieneTerraza = sc.nextLine();
        boolean isTerraza = false;
        double metrosTS = 0.0;
        if (tieneTerraza.equalsIgnoreCase("si")){
            isTerraza=true;

            System.out.println("Dime los metros cuadrados de la terraza: ");
            metrosTS = Double.parseDouble(sc.nextLine());
        } else{
            isTerraza=false;
        }
        Salon salon = new Salon(nombre, metrosCuadrados, puertas, ventanas, tomasRed, isTerraza, metrosTS);


        datosGenerales();
        System.out.println("Dime numero de puertas del armario: ");
        int numPuertasArmario = Integer.parseInt(sc.nextLine());
        System.out.println("Tiene acceso directo al baño?");
        String accesoDirecto = sc.nextLine();
        boolean isAccesoDirecto = false;
        if (accesoDirecto.equalsIgnoreCase("si")){
            isAccesoDirecto=true;
        } else{
            isAccesoDirecto=false;
        }
        Habitacion habitacion = new Habitacion(nombre, metrosCuadrados, puertas, ventanas, numPuertasArmario, isAccesoDirecto);

        
        datosGenerales();
        System.out.println("Dime si tiene bañera o ducha: ");
        String baneraODucha = sc.nextLine();
        Banio banio = new Banio(nombre, metrosCuadrados, puertas, ventanas, baneraODucha);


        System.out.println("\nMOSTRANDO DATOS:");
        System.out.println("Datos del "+hall.getNombre()+":");
        hall.calcularMetrosCuadrados();
        System.out.println("puertas: "+hall.getNumPuertas());
        System.out.println("ventanas: "+hall.getNumVentanas());
        System.out.println("Blindada: "+hall.isBlindada());

        System.out.println("\nDatos de la "+cocina.getNombre()+":");
        cocina.calcularMetrosCuadrados();
        System.out.println("puertas: "+cocina.getNumPuertas());
        System.out.println("ventanas: "+cocina.getNumVentanas());
        System.out.println("Tiene tendedero: "+cocina.isTendedero());
        System.out.println("Metros del tendedero: "+cocina.getMetrosT());

        System.out.println("\nDatos del "+salon.getNombre()+":");
        salon.calcularMetrosCuadrados();
        System.out.println("puertas: "+salon.getNumPuertas());
        System.out.println("ventanas: "+salon.getNumVentanas());
        System.out.println("Tomas de red: "+salon.getTomasRed());
        System.out.println("Tiene terraza: "+salon.isTerraza());
        System.out.println("Metros de la terraza: "+salon.getMetrosTS());

        System.out.println("\nDatos de la "+habitacion.getNombre()+":");
        habitacion.calcularMetrosCuadrados();
        System.out.println("puertas: "+habitacion.getNumPuertas());
        System.out.println("ventanas: "+habitacion.getNumVentanas());
        System.out.println("Numero de puertas del armario: "+habitacion.getNumPuertasArmario());
        System.out.println("Acceso directo al baño: "+habitacion.isBanio());

        System.out.println("\nDatos del "+banio.getNombre()+":");
        banio.calcularMetrosCuadrados();
        System.out.println("puertas: "+banio.getNumPuertas());
        System.out.println("ventanas: "+banio.getNumVentanas());
        System.out.println("Tiene "+banio.getBanieraDucha());




    }

    public static void datosGenerales(){
        System.out.println("Dime el nombre de la estancia: ");
        nombre = sc.nextLine();

        System.out.println("Dime los metros cuadrados que tiene: ");
        metrosCuadrados = Double.parseDouble(sc.nextLine());

        System.out.println("Dime el número de puertas: ");
        puertas= Integer.parseInt(sc.nextLine());

        System.out.println("Dime el número de ventanas: ");
        ventanas = Integer.parseInt(sc.nextLine());
    }
}
