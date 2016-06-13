
/**
 * Write a description of class FurgonetasPequeñas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaPequena extends Plazas implements CumpleMedidas
{
   

    /**
     * Constructor for objects of class FurgonetasPequeñas
     */
    public FurgonetaPequena(Marca marca,int años,int kilometros,int plazas)
    {
       super(marca,años,kilometros,plazas); 
       
    }  
  
    /**
     * Metodo que devuelve true si las medidas se cumplen y false en caso de que no
     */
    @Override
    public  boolean cumpleMedidas() {
        boolean medida = false;
        if (getPlazas() <= 7) {
            medida = true;    
        }        
        return medida;
    }
    

}
