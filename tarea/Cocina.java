package tarea;

/**
 * @author Cristhian C. && María Q Garrido
 */
public class Cocina extends Casa{
    protected boolean tendedero;
    protected double metrosT;

    /**
     *
     * @param nombre
     * @param metrosC
     * @param numPuertas
     * @param numVentanas
     * @param tendedero
     * @param metrosT
     */
    public Cocina(String nombre, double metrosC, int numPuertas, int numVentanas, boolean tendedero, double metrosT) {
        super(nombre, metrosC, numPuertas, numVentanas);
        this.tendedero = tendedero;
        this.metrosT = metrosT;
    }

    /**
     *
     * @return tendedero: valor booleano que indica si tiene tendedero o no
     */
    public boolean isTendedero() {

        return tendedero;
    }

    /**
     *
     * @return metros
     */
    public double getMetrosT() {

        return metrosT;
    }

    @Override
    public void calcularMetrosCuadrados() {

    }
}
