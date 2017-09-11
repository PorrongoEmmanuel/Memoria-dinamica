/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.dinamica;

/**
 *
 * @author Emmanuel
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class MDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ArrayList<String>cadenas=new ArrayList<String>();//declarado mi arraylist
        String alumno, respuesta;
        do{
            alumno= JOptionPane.showInputDialog(null, "ingrese un alumno: ");
            //agregando la frase a la lista
            cadenas.add(alumno);
            respuesta= JOptionPane.showInputDialog(null, "desea ingresar otro Alumno (SI/NO)");
        respuesta=respuesta.toUpperCase();
    }while(!respuesta.equals("NO"));
        //MOSTRANDO EL CONTENIDO DE CADENAS
        for(int i=0; i<cadenas.size();i++){
            System.out.println(cadenas.get(i));
        }
    }
    
}
