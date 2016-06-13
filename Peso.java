
/**
 * Write a description of class Peso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peso extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int peso;

    /**
     * Constructor for objects of class Peso
     */
    public Peso(Marca marca,int años,int kilometros,int peso)
    {
        super(marca,años,kilometros);
        this.peso = peso;
    }
    
     /**
     * Metodo que devuelve el numero de peso
     */
    public int getPeso() {
        return this.peso;
    }
 
}
