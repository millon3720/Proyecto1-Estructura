/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.util.*;   

/**
 *
 * @author josed
 */
public class ClDatos {

    /**
     * @param args the command line arguments
     */
    public static List Medicamentos = new LinkedList();
    public static List Pacientes = new LinkedList();
    public static List MedicamentosPasientes = new LinkedList();

    public static void main(String[] args) {
        // TODO code application logic here        
    }
    public void GuardarMedicamentos(String Nombre)
    {
        Medicamentos.add(Nombre);
    }
    public void BorrarMedicamentos(String Nombre)
    {
        Medicamentos.remove(Nombre);
    }
    public void GuardarPacientes(String Nombre,String Medicamento)
    {
        Pacientes.add(Nombre);
        MedicamentosPasientes.add(Medicamento);
    }
    
}
