
/**
 * Write a description of class Vehiculos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  class Vehiculo 
{
    // instance variables - replace the example below with your own
    private Marca marca;
    // Guarda los años del vehiculo
    private int años;
    //guarda los kilometros recorridos del vehiculo
    private int kilometros;   
    //contador para incrementar el Id de uno en uno;    
    private static int contadorId = -1;
    //
    private int id;
    /**
     * Constructor for objects of class Vehiculos
     */
    public Vehiculo(Marca marca,int años,int kilometros)  {
       contadorId++;
       id = contadorId;
       this.marca = marca;
       this.años = años;
       this.kilometros = kilometros;
    }
    
    /**
     * Metodo que retorna la marca del vehiculo
     */
    public Marca getMarca() {
        return marca;    
    }
    
    /**
     * Metodo que devuelve los años
     */
    public int getAnos() {    
        return años;
    }
    
    /**
     * metodo que devuelve los kilometros
     */
    public int getKilometros() {
        return kilometros;
    }
    
    /**
     * Metodo que devuelve el id
     */
    public int getId() {    
        return id;
    }
    
  
    
    
    

 
}
