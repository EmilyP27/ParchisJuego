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
    private boolean poseInicial;
    private int indice;
    private boolean caminoWin;
    private int pasoWin;

    //  Fase 3
    // Los puntos funcionan como vidas: si llegan a 0, la ficha vuelve a casa.
    private int puntos = 6;
    
    //constructor 
    public Ficha(int pColor) {
        color = pColor;
        colorNombre = new Colores().nombre(pColor);
        indice = -1;                // -1 = en casa
        poseInicial = true;     // empieza en casa
        caminoWin = false;          // aún no está en el camino WIN
        pasoWin = 0;
    }//Fin constructor

    
    //GET
     public String getColorNombre() {
        return colorNombre;
    }

    public boolean isPoseInicial() {
        return poseInicial;
    }

    public boolean isCaminoWin() {
        return caminoWin;
    }

    public int getColor() {
        return color;
    }

    public int getPasoWin() {
        return pasoWin;
    }

    public int getIndice() {
        return indice;
    }

    public int getPuntos() {
        return puntos;
    }

    
    
    //SET
public void setColorNombre(String colorNombre) {
        this.colorNombre = colorNombre;
    }

    public void setPoseInicial(boolean posicionInicial) {
        this.poseInicial = posicionInicial;
    }

    public void setCaminoWin(boolean caminoWin) {
        this.caminoWin = caminoWin;
    }

    public void setPasoWin(int pasoWin) {
        this.pasoWin = pasoWin;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    
   public void setPuntos(int puntos) {
        if (puntos < 0) {
            this.puntos = 0;
        } else {
            this.puntos = puntos;
        }
    }

    // Métodos para puntos (Fase 3) 
    /**
     * Aumenta puntos
     */
    public void sumarPuntos(int valor) {
        if (valor > 0) {
            puntos = puntos + valor;
        }
    }

    /**
     * Resta puntos
     */
    public void restarPuntos(int valor) {
        if (valor > 0) {
            puntos = puntos - valor;
            if (puntos < 0) {
                puntos = 0;
            }
        }
    }

    /**
     * Verifica si la ficha se quedó sin puntos.
     */
    public boolean sinPuntos() {
        return puntos <= 0;
    }
    
    public void reiniciarPuntos(){
        puntos = 6;
    }

    /**
     * Envía la ficha nuevamente a casa.
     */
    public void enviarHome() {
        indice = -1;
        pasoWin = 0;
        poseInicial = true;
        caminoWin = false;
    }

    /**
     * Reinicia todos los valores al iniciar un nuevo juego.
     */
    public void reset() {
        indice = -1;
        pasoWin = 0;
        poseInicial = true;
        caminoWin = false;
        puntos = 6; // vuelve a los puntos iniciales
    }
    
           
           
   

    
}//fin de la 