import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    // coleccion donde guardaremos objetos de tipo vehiculo
    private ArrayList<Vehiculo> vehiculos;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        vehiculos = new ArrayList<>();
    }

    /**
     *  Metodo que añade un vehiculo
     */
    public void addVehiculo(Vehiculo vehiculo) {    
        vehiculos.add(vehiculo);    
    }

    /**
     *  Metodo que elimina pasando el id por parametro
     */
    public void removeVehiculo(int numeroId) {    

        for (int i = 0; i < vehiculos.size();i++) {        
            if (numeroId == vehiculos.get(i).getId()) {            
                vehiculos.remove(numeroId);
            }
        }    
    }

    /**
     * devuelve la marca con el mayor número de vehículos en la flota. 
     * Si hay empate entre cualquier marca o no hubiera aun vehiculos devuelve null.
     */
    public Marca marcaMayoritaria() {
        Marca marca = null;
        //Contadroes de marcas
        int Ford= 0;
        int Fiat = 0;
        int Opel = 0;
        int Citroen = 0;       
        for (int i = 0; i < vehiculos.size();i++) {        
            if(vehiculos.get(i).getMarca() == Marca.FORD) {
                Ford++;
            } else if (vehiculos.get(i).getMarca() == Marca.FIAT) {            
                Fiat++;
            } else if (vehiculos.get(i).getMarca() == Marca.OPEL) {            
                Opel++;
            } else if (vehiculos.get(i).getMarca() == Marca.CITROEN) {            
                Citroen++;
            }
        }

        if (Ford > Fiat && Ford > Opel && Ford > Citroen){
            marca = Marca.FORD;
        }else{
            if(Fiat > Ford && Fiat > Opel && Fiat > Citroen){
                marca = Marca.FIAT;
            }else{
                if(Opel > Ford && Opel > Fiat && Opel > Citroen){
                    marca = Marca.OPEL;
                }else{
                    marca = Marca.CITROEN;
                }
            }
        }
        return marca;
    }

    /**
     * Metodo que comprueba si las todas 
     */
    public boolean cumplenMedidas() {
        boolean medidas = true;       
        int i = 0;
        while (i < vehiculos.size() && !medidas) {       
            if(vehiculos.get(i) instanceof Coche) {
                if (!((Coche)vehiculos.get(i)).cumpleMedidas()){
                    medidas = false;                    
                }
            } else if (vehiculos.get(i) instanceof FurgonetaPequena) {
                if (!((FurgonetaPequena)vehiculos.get(i)).cumpleMedidas()) {
                    medidas = false;
                }
            } else if (vehiculos.get(i) instanceof Camion) {
                if (!((Camion)vehiculos.get(i)).cumpleMedidas()) {
                    medidas = false;
                }
            }
            i++;
        }
        return medidas;
    }

    public int[] getDatosVehiculo(int id){
        boolean encontrado = false;       
        int i = 0;
        int[] array = null;
        while (i < vehiculos.size() && !encontrado) {             
            for (int z = 0; z < 4;i++) {
                if (vehiculos.get(i) instanceof Coche) {
                    array = new int[5];
                    array[0] = vehiculos.get(i).getId();
                    array[1] = vehiculos.get(i).getAnos();
                    array[2] = vehiculos.get(i).getKilometros();
                    array[3] = ((Plazas)vehiculos.get(i)).getPlazas();
                    array[4] = ((Coche)vehiculos.get(i)).añoRevision();
                }
                if (vehiculos.get(i) instanceof Camion) {
                    array[0] = vehiculos.get(i).getId();
                    array[1] = vehiculos.get(i).getAnos();
                    array[2] = vehiculos.get(i).getKilometros();
                    array[3] = ((Peso)vehiculos.get(i)).getPeso();
                }
                if (vehiculos.get(i) instanceof FurgonetaPequena) {
                    array[0] = vehiculos.get(i).getId();
                    array[1] = vehiculos.get(i).getAnos();
                    array[2] = vehiculos.get(i).getKilometros();
                    array[3] = ((Plazas)vehiculos.get(i)).getPlazas();
                }
                if (vehiculos.get(i) instanceof FurgonetaGrande) {
                    array[0] = vehiculos.get(i).getId();
                    array[1] = vehiculos.get(i).getAnos();
                    array[2] = vehiculos.get(i).getKilometros();
                    array[3] = ((Peso)vehiculos.get(i)).getPeso();
                }
            }
        }
        return array;
    }
}
