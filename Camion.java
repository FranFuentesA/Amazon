
/**
 * Write a description of class Camion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion extends Peso implements CumpleMedidas
{
    
   

    /**
     * Constructor for objects of class FurgonetasGrandes
     */
    public Camion(Marca marca,int años,int kilometros,int peso)
    {
       super(marca,años,kilometros,peso);    
     
    }
    
    /**
     * Metodo que devuelve los años de revision que tiene que pasar el vehiculo
     */
    public boolean esArticulado() {        
        boolean articulado = false;
        if (getMarca() == Marca.FORD || getMarca() == Marca.FIAT) {                
            articulado = true;
        } 
        return articulado;
    }
    
    /**
     * Metodo que devuelve true si las medidas se cumplen y false en caso de que no
     */
    @Override
    public  boolean cumpleMedidas() {
        boolean medida = false;
        if (esArticulado()) {
            if (getPeso() < 3000) {
                medida = true;            
            }   
        }  else {
            if (getPeso() < 2000) {
                medida = true;
            }        
        }      
        return medida;
    }
}
