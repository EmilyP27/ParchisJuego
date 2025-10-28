/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author EMILI VALERIA
 */
public class CoordenadasHome {

    private Coordenadas[] home = new Coordenadas[]{
        new Coordenadas(79, 72),//Rojo
        new Coordenadas(404, 390),//Amarillo
        new Coordenadas(400, 68),//Azul
        new Coordenadas(75, 391)//Verde

    };
    // Va a leer el id de los colores para pintar en e tablero las fihas que van a jugar
    public Coordenadas getHome(int colorId) {

        if (colorId < 0) {
            colorId = 0;
        }
        if (colorId > 3) {
            colorId = 3;
        }
        return home[colorId];
    }

}//fin de la clase
