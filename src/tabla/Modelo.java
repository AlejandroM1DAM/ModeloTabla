/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alejandro
 */
public class Modelo extends AbstractTableModel{
    private List<Dato> datos = new ArrayList<>();
    
    public Modelo(File ruta) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = br.readLine())!= null) {
                
                String[] miniDatos = linea.split(",");
                System.out.println();
                Dato dato = new Dato(miniDatos[0],Integer.parseInt(miniDatos[1]),Double.parseDouble(miniDatos[2]),miniDatos[3]); 
                datos.add(dato);   
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
      
    
    }
    @Override
    public int getRowCount() {
        return datos.size();
    }
    
    
    @Override
    public int getColumnCount() {
        
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        return datos.get(rowIndex).getColumn(columnIndex);
    }
    
}
