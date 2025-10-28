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
    private String colorNombre;
    private int color;
    private int salida,totalCasillas;
    private boolean poseInicial;
    private int indice;
    private boolean caminoWin;
    private int pasoWin;

    public Ficha(int pColor) {
        color = pColor;
        colorNombre = new Colores().nombre(pColor);
        salida = salida;
        totalCasillas = totalCasillas;
        indice = -1;
        poseInicial = true;
        caminoWin = true;
        pasoWin = 0;
    }//Fin constructor

    public String getColorNombre() {
        return colorNombre;
    }

    public void setColorNombre(String colorNombre) {
        this.colorNombre = colorNombre;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public int getTotalCasillas() {
        return totalCasillas;
    }

    public void setTotalCasillas(int totalCasillas) {
        this.totalCasillas = totalCasillas;
    }

    public boolean isPoseInicial() {
        return poseInicial;
    }

    public void setPoseInicial(boolean poseInicial) {
        this.poseInicial = poseInicial;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public boolean isCaminoWin() {
        return caminoWin;
    }

    public void setCaminoWin(boolean caminoWin) {
        this.caminoWin = caminoWin;
    }

    public int getPasoWin() {
        return pasoWin;
    }

    public void setPasoWin(int pasoWin) {
        this.pasoWin = pasoWin;
    }

   public void reset (){
   indice = -1;
   pasoWin = 0;
   poseInicial = true;
   caminoWin = true;
           
           
   }

    
}//fin de la 