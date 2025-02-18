package tarea;

/**
 * @author Cristhian C. && María Q Garrido
 */
public class Banio extends Casa{

    protected String banieraDucha;

    /**
     *
     * @param nombre
     * @param metrosC
     * @param numPuertas
     * @param numVentanas
     * @param banieraDucha
     */
    public Banio(String nombre, double metrosC, int numPuertas, int numVentanas, String banieraDucha) {
        super(nombre, metrosC, numPuertas, numVentanas);
        this.banieraDucha = banieraDucha;
    }

    /**
     *
     * @return banieraDucha: representa si el baño tiene bañera o ducha
     */
    public String getBanieraDucha() {
        return banieraDucha;
    }
}
