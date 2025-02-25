package tarea;

/**
 * @author Cristhian C. && María Q Garrido
 */
public class Salon extends Casa{

    protected int tomasRed;
    protected boolean terraza;
    protected double metrosTS;

    /**
     *
     * @param nombre
     * @param metrosC
     * @param numPuertas
     * @param numVentanas
     * @param tomasRed
     * @param terraza
     * @param metrosTS
     */
    public Salon(String nombre, double metrosC, int numPuertas, int numVentanas, int tomasRed, boolean terraza, double metrosTS) {
        super(nombre, metrosC, numPuertas, numVentanas);
        this.tomasRed = tomasRed;
        this.terraza = terraza;
        this.metrosTS = metrosTS;
    }

    /**
     *
     * @return tomasRed: devuelve el número de red qye hay
     */
    public int getTomasRed() {

        return tomasRed;
    }

    /**
     *
     * @return terraza: devuelve un buleano si hay terraza o no
     */
    public boolean isTerraza() {

        return terraza;
    }

    /**
     *
     * @return metrosST: devuelve los metros que tiene la terraza del salón
     */
    public double getMetrosTS() {

        return metrosTS;
    }

    @Override
    public void calcularMetrosCuadrados() {

    }
}
