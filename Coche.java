
/**
 * Write a description of class Coches here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche extends Plazas implements CumpleMedidas
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Coches
     */
    public Coche(Marca marca,int años,int kilometros,int plazas)
    {
        super(marca,años,kilometros,plazas); 
        
    }

    /**
     * Metodo que devuelve los años de revision que tiene que pasar el vehiculo
     */
    public int añoRevision() {        
        int rev = 0;
        if (getMarca() == Marca.FORD) {                
            rev = 2;
        } else {
            rev = 1;
        }  
        return rev;
    }
    
    /**
     * Metodo que devuelve true si las medidas se cumplen y false en caso de que no
     */
    @Override
    public  boolean cumpleMedidas() {
        boolean medida = false;
        if (getPlazas() <= 5) {
            medida = true;    
        }        
        return medida;
    }
}