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
