/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author EMILI VALERIA
 */
public class Reglas {
     private int totalCasillas = 68;
    //-0rojo,1 amarillo,2 azul ,9 verde 
    private int[] salida = new int[]{38, 4, 21, 55};
    //se maneja la ubicacion de las casillas segun sus coordenadas 
    private int[] entrada = new int[]{33, 67, 16, 50};

    public int getTotalCasillas() {
        return totalCasillas;
    }

    //metodo que indica la condicion para salir segun el dado 
    public boolean salir(int dado) {
        return dado == 5;
    }

    //metodo que indica el indice de salida segun el color de la ficha ִ
    public int salidaId(int colorId) {
        return salida[colorId];
    }
    //-0rojo,1 amarillo,2 azul ,9 verde 

    public boolean entradaWin(int colorId, int indiceRecorrido) {
        return indiceRecorrido == entrada[colorId];
    }

    // crear el recorrido de las fichas y metodos que ayudan a las fichas a ingresar al camino win
    //parametros del metodoavanzar son: indice y valorDado 
    //indice= casillas del tablero
    public int avanzar(int indice, int valorDado) {
        int i;
        //1-6
        if (valorDado > 0) {
            for (i = 0; i < valorDado; i++) {
                indice++;
            }
            if (indice == totalCasillas) {

                indice = 0;
            }

        }
        return indice;
    }

    public boolean posicionFichaEntrada(int colorId, int indice, int valorDado) {
        int i;
        if (valorDado > 0) {
            for (i = 1; i <= valorDado; i++) {
                indice++;
                if (valorDado >= totalCasillas) {
                    totalCasillas--;
                }
                if (valorDado == indice) {
                    return true;
                }
            }
        } else {
            if (valorDado < 0) {
                for (i = -1; i >= valorDado; i--) {
                     indice ++;
                }if (valorDado < totalCasillas){
                totalCasillas++;
                }
                  if (valorDado == indice) {
                    return true;
                }
            }
        }
        return false;
    }//fin del metodo
    
}
