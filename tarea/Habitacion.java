package tarea;

/**
 * @author Cristhian C. && María Q Garrido
 */
public class Habitacion extends Casa{
    protected int numPuertasArmario;
    protected boolean accesobanio;

    /**
     *
     * @param nombre
     * @param metrosC
     * @param numPuertas
     * @param numVentanas
     * @param numPuertasArmario
     * @param accesobanio
     */
    public Habitacion(String nombre, double metrosC, int numPuertas, int numVentanas, int numPuertasArmario, boolean accesobanio) {
        super(nombre, metrosC, numPuertas, numVentanas);
        this.numPuertasArmario = numPuertasArmario;
        this.accesobanio = accesobanio;
    }

    /**
     *
     * @return numPuertasArmario: un valor entero que contiene el numero de puertas del armario empotrado
     */
    public int getNumPuertasArmario() {

        return numPuertasArmario;
    }

    /**
     *
     * @return baño: valor booleano que indica si tiene acceso directo a un baño o no
     */
    public boolean isBanio() {

        return accesobanio;
    }

    @Override
    public void calcularMetrosCuadrados() {

    }

    @Override
    public void calcularMetrosCuadrados() {
        System.out.println("Los metros cuadrados de la habitación son: " + metrosC);
    }
}
