/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

/**
 *
 * @author Alejandro
 */
public class Dato {
    private String nombre;
    private int edad;
    private double altura;
    private String taras;
    
    public Dato(String nombre, int edad, double altura, String taras) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura =altura;
        this.taras = taras;
    }

    public String getColumn(int columnIndex) {
        String aDevolver = "";
        switch (columnIndex) {
             case 0: 
                 aDevolver = getNombre();
                break;
            case 1: 
                aDevolver = ""+ getEdad();
                break;
            case 2: 
                aDevolver = ""+getAltura();
                break;
            case 3: 
                aDevolver = getTaras();
                break;
        }
          return aDevolver;     
                    
                
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTaras() {
        return taras;
    }

    public void setTaras(String taras) {
        this.taras = taras;
    }

    
}

