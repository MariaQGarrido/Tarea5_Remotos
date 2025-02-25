package tarea;

/**
 * @author Cristhian C. && María Q Garrido
 */
public class Hall extends Casa{
    protected boolean blindada;

    /**
     *
     * @param nombre
     * @param metrosC
     * @param numPuertas
     * @param numVentanas
     * @param blindada
     */
    public Hall(String nombre, double metrosC, int numPuertas, int numVentanas, boolean blindada) {
        super(nombre, metrosC, numPuertas, numVentanas);
        this.blindada = blindada;
    }

    /**
     *
     * @return blindada: retorna un booleano si es blindada o no.
     */
    public boolean isBlindada() {
        return blindada;
    }

    @Override
    public void calcularMetrosCuadrados() {
        System.out.println("Los metros cuadrados del hall son: " + metrosC);
    }
}
