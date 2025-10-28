/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author EMILI VALERIA
 */
public class Colores {

    // los Id de nuestros colores 
    private int rojo = 0;
    private int amarillo = 1;
    private int azul = 2;
    private int verde = 3;

    //metodo que nos ayuda a mostrar el texto de la etiqueta (setlblFichaTurno)
    public String nombre(int id) {
        switch (id) {
            case 0:
                return "Rojo";
            case 1:
                return "Amarillo";
            case 2:
                return "Azul";
            case 3:
                return "Verde";
            default:
                return "Rojo";
        }
    }

    public int idNombre(String nombre) {

        if (nombre.equals("Rojo")) {
            return 0;
        }
        if (nombre.equals("Amarillo")) {
            return 1;
        }
        if (nombre.equals("Azul")) {
            return 2;
        }
        if (nombre.equals("Verde")) {
            return 3;
        }
        return 0;
    }

}//fin de la clase 
