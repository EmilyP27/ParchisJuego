/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author EMILI VALERIA
 */
public class Ficha {
    public String color;
    private int salida,totalCasillas,indice;
    private boolean poseInicial=true;

    public Ficha(String color, int salida, int totalCasillas) {
        this.color = color;
        this.salida = salida;
        this.totalCasillas = totalCasillas;
    }//Fin constructor

    public String getColor() {
        return color;
    }//fin del getColor
  
    public boolean getPoseInicial(){
        return poseInicial;
    }

    public int getIndice() {
        return indice;
    }
    
    
    public void fichaFuera(){
    
        poseInicial=false;
    }
    
}//fin de la 