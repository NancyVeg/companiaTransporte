package companiatransporte;
import java.util.*;
/**
 *
 * @author grill
 */
public class Bus {
    
    private String placa;
    private int capacidad;
    private int galonesGasolina;
    private Empleado conductor;
    private Ruta ruta;
    
    public Bus(String placa, int capacidad, int galonesGasolina)
    {
        this.placa = placa;
        this.capacidad = capacidad;
        this.galonesGasolina = galonesGasolina;
    }
    
    public void asignarRuta(Ruta unaRuta)
    {
        ruta = unaRuta;
    }
    
    public void asignarConductor(Empleado elConductor)
    {
        conductor = elConductor;
    }
    
    public String nombreConductor()
    {
        return conductor.getNombre();
    }
    
    public String inicioRuta()
    {
        return ruta.ciudadInicial();
    }
    
    public String placaBus()
    {
        return placa;
    }
}

