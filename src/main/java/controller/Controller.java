/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import model.*;
import view.*;

/**
 *
 * @author EMILI VALERIA
 */
public class Controller implements ActionListener {

    // se llama la clases GUIJuego y sus panales(control y tablero 
    //Atributo tipo obeto 
    private GUIJuego gui;
    private PanelControl panelControl;
    private PanelTablero panelTablero;

    //Clases de coordenadas, paquete modelo
    private TableroCoordenadas tablero;
    private CoordenadasHome home;

    //Atributo tipo objeto (Clase ficha)
    private Ficha jugador;
    private Ficha oponente;

    //Estos atributos sirven para identificar el colro de la ficha del jugador y el oponente 
    private int colorJugadorId;
    private int colorOponenteId;

    //Se etsa inicializndo las clases random, Dado y colores 
    private Random random = new Random();
    private Dado dado = new Dado(random, 0);
    private Colores colores = new Colores();

    //Constructor 
    public Controller(PanelControl panelControl, PanelTablero panelTablero, int pColorJugadorId) {
        this.panelControl = panelControl;
        this.panelTablero = panelTablero;
        this.colorJugadorId = colorJugadorId;

        tablero = new TableroCoordenadas();
        home = new CoordenadasHome();

        //Atributo = la variable del constructor 
        //identifica los id r=0, amarillo=1 , azul=2, verde=3
        colorJugadorId = pColorJugadorId;
        if (colorJugadorId < 0) {
            colorJugadorId = 0;
        }
        if (colorJugadorId > 3) {
            colorJugadorId = 3;
        }

        if (colorJugadorId == 0) {
            colorOponenteId = 1;
        } else if (colorJugadorId == 1) {
            colorOponenteId = 0;
        } else if (colorJugadorId == 2){ 
        colorOponenteId =3;
        } else if (colorJugadorId == 3){
        colorOponenteId = 2;
        }
        
        jugador = new Ficha(colorJugadorId);
        oponente = new Ficha (colorOponenteId);
        
        //Listeners
        panelControl.getBtnDado().addActionListener(this);
        panelControl.getBtnReinicio().addActionListener(this);
        
        //Ubicar la ficha en home
        Coordenadas cJugador = home.getHome(colorJugadorId);
         Coordenadas cOponente = home.getHome(colorJugadorId);
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}//fin de la clase
