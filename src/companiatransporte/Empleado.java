package companiatransporte;


/**
 *
 * @author grill
 */
public class Empleado {
    
    private int cedula;
    private String nombre;
    private String cargo;
    
    public Empleado(int cedula, String nombre, String cargo)
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
    }
    
    public String infoEmpleado()
    {
        return nombre+" "+cedula+" "+cargo;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
}
