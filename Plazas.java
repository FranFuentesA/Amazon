
/**
 * Write a description of class Plazas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plazas extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int plazas;

    /**
     * Constructor for objects of class Plazas
     */
    public Plazas(Marca marca,int años,int kilometros,int plazas)
    {
        super(marca,años,kilometros);
        this.plazas = plazas;
    }
    /**
     * Metodo que devuelve el numero de plazas
     */
    public int getPlazas() {
        return this.plazas;
    }
}

