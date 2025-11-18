/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;

/**
 *
 * @author EMILI VALERIA
 */
public class Dado {

    private Random random;
    private int numero;
     private CoordenadasHome home;

    public Dado() {
        this.random =new Random();
        this.numero = 0;
    }

     
    public Dado(Random random, int numero) {
        this.random = random;
        this.numero = numero;
    }

    public int lanzar() {
        numero = random.nextInt(6) + 1;
        System.out.println("Sacó: " + numero);
        return numero;
    }

    public int getValorActual() {
        return numero;
    }
;

}
