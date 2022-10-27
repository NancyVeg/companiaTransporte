package companiatransporte;

/**
 *
 * @author grill
 */
public class Recorrido {
    
    private String fechaInicio;
    private String lugarInicio;
    private String lugarDestino;
    private int horaSalida;
    private int horaLlegada;
    
    /**
     * Constructor de la clase recorrido que permite crear objetos de esta clase con sus variables
     * @param fechaInicio : fecha en la inicia el recorrido
     * @param lugarInicio : ciudad de salida del recorrido
     * @param lugarDestino : ciudad final del recorrido
     * @param horaSalida : hora de inicio del recorrido
     * @param horaLlegada : hora de llegada a la ciudad final
     */
    public Recorrido(String fechaInicio, String lugarInicio, String lugarDestino, int horaSalida, int horaLlegada)
    {
        this.fechaInicio = fechaInicio;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.lugarDestino = lugarDestino;
        this.lugarInicio = lugarInicio;
    }
    
    /**
     * funcion que arroja la ciudad de inicio del recorrido
     * @return lugarInicio
     */
    public String decirCiudadSalida()
    {
        return lugarInicio;
    }
    
    public String infoRecorrido()
    {
        return "El "+fechaInicio+" sale de "+lugarInicio+" a las "+horaSalida+" con destino a "+lugarDestino+" "+horaLlegada+" Hr";
    }
    
}

