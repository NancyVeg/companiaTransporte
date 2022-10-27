package companiatransporte;
import java.util.*;

/**
 *
 * @author grill
 */
public class Ruta {
    
    private int numeroDeRuta;
    ArrayList<Recorrido> recorridos;
    
    public Ruta (int numeroDeRuta)
    {
        this.numeroDeRuta = numeroDeRuta;
        recorridos = new ArrayList<>();
    }
    
    public String infoRuta()
    {
        String recorridosRuta = "El recorrido total de la ruta "+numeroDeRuta+" es: \n";
        
        for (int i = 0; i<recorridos.size() ; i++)
        {
            recorridosRuta += recorridos.get(i).infoRecorrido()+"\n";
        }
        
        return recorridosRuta;
    }
    
    public void agregarRecorrido ( Recorrido unRecorrido)
    {
        recorridos.add(unRecorrido);
    }
    
    public String ciudadInicial ()
    {
        return recorridos.get(0).decirCiudadSalida();
    }
    
}
