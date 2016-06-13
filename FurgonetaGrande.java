
/**
 * Write a description of class FurgonetasGrandes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaGrande extends Peso 
{

    // guardamos el peso expresado en Kg;
    private int peso;

    /**
     * Constructor for objects of class FurgonetasGrandes
     */
    public FurgonetaGrande(Marca marca,int años,int kilometros,int peso)
    {
       super(marca,años,kilometros,peso);  
       
    }
    
    public int getDatosVehiculo(){    
        return this.peso;    
    }

}
