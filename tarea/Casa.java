package tarea;

/**
 * @author  Cristhian C. && María Q Garrido
 */
public abstract class Casa {
    //elegimos protected para que las sublcases puedan acceder a estos atributos.
     protected String nombre;
     protected double metrosC;
     protected int numPuertas;
     protected int numVentanas;

    /**
     *
     * @param nombre
     * @param metrosC
     * @param numPuertas
     * @param numVentanas
     */
    public Casa(String nombre, double metrosC, int numPuertas, int numVentanas) {
        this.nombre = nombre;
        this.metrosC = metrosC;
        this.numPuertas = numPuertas;
        this.numVentanas = numVentanas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetrosC() {
        return metrosC;
    }

    public void setMetrosC(double metrosC) {
        this.metrosC = metrosC;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumVentanas() {
        return numVentanas;
    }

    public void setNumVentanas(int numVentanas) {
        this.numVentanas = numVentanas;
    }

    /**
     * @return Metodo abstracto que se implementara en las subclases, el cual calcula los metros cuadrados de la casa.
     */
    public abstract  void calcularMetrosCuadrados();
}

