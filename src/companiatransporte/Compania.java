package companiatransporte;
import java.util.*;

/**
 *
 * @author grill
 */
public class Compania {
    
   ArrayList<Ruta> rutas;
   ArrayList<Empleado> empleados;
   ArrayList<Bus> buses;
   
   public Compania()
   {
       rutas = new ArrayList<>();
       empleados = new ArrayList<>();
       buses = new ArrayList<>();
   }
   
   public void agregarRuta(Ruta unaRuta)
   {
       rutas.add(unaRuta);
   }
   
   public void agregarEmpleado(Empleado unEmpleado)
   {
       empleados.add(unEmpleado);
   }
   
   public void agregarBus(Bus unBus)
   {
       buses.add(unBus);
   }
   
   public String decirBuses()
   {
       String losBuses = "Las placas de los buses de la compañia son: \n";
       for ( int i=0; i<buses.size();i++)
       {
           losBuses += buses.get(i).placaBus()+"\n";
       }
       return losBuses;
   }
   
   public String decirEmpleados()
   {
       String losEmpleados = "Los empleados de la compañia son: \n";
       for(int i=0; i<empleados.size();i++)
       {
           losEmpleados += empleados.get(i).infoEmpleado()+"\n";
       }
       return losEmpleados;
   }
   
   public String decirRutas()
   {
       String lasRutas = ""
   }
    
}
