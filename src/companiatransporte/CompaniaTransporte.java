package companiatransporte;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author grill
 */
public class CompaniaTransporte {

    public static void main(String[] args) {
        
        Recorrido rec1 = new Recorrido("31 Agosto","Cali","Bogota",830,1700);
        Recorrido rec2 = new Recorrido("1 septiembre","Bogota","Cali",400,1300);
        Ruta ruta1 = new Ruta(324);
        
        ruta1.agregarRecorrido(rec1);
        ruta1.agregarRecorrido(rec2);
        
        JOptionPane.showMessageDialog(null, ruta1.infoRuta());
        
        JOptionPane.showMessageDialog(null, ruta1.ciudadInicial());
    }
    
}
