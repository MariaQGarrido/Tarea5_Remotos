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

        System.out.println("Hall: ");
        datosGenerales();
        System.out.println("¿Tiene puerta blindada? Si/No");
        String isBlindada = sc.nextLine();
//
//        if(isBlindada.equals)

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
