/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerator;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import modelo.Persona;

/**
 *
 * @author MULTICOMP
 */
public class EjemploInterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        
        personas.add(new Persona("1", "Juan"));
        personas.add(new Persona("2", "Pedro"));
        personas.add(new Persona("3", "Felipe"));
        
        JOptionPane.showMessageDialog(null, "IMPRESION CON ITERATOR\n\n"+imprimirListaIterator(personas));
        JOptionPane.showMessageDialog(null, "IMPRESION CON FOREACH\n\n"+imprimirListaForEach(personas));
    }
     
    private static String imprimirListaIterator(ArrayList<Persona> lista){
        String result = "";
        Iterator<Persona> it = lista.iterator();
        
        while(it.hasNext()){
            result += it.next().toString();
        }
        return result;
    }
    
    private static String imprimirListaForEach(ArrayList<Persona> lista){
        String result = "";
        for(Persona item : lista){
            result += item.toString();
        }
        return result;
    }
    
}
