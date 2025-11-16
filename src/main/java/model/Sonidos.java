/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


/**
 *
 * @author EMILI VALERIA
 */
public class Sonidos {

    private Clip musica;

    private Clip cargar(String ruta) {
        try {
            URL u = getClass().getResource(ruta);
            AudioInputStream ais = AudioSystem.getAudioInputStream(u);
            Clip c = AudioSystem.getClip();
            c.open(ais);
            return c;
        } catch (Exception e) {
            return null;
        }
    }

    public void musicaFondo() {
        musica = cargar("/sonidos/ambiente.wav");
        if (musica != null) {
            musica.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    public void musicaFondoPrincipal() {

        musica = cargar("/sonidos/ambiente.wav");
        if (musica != null) {
            musica.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    public void click() {
        Clip c = cargar("/sonidos/click.wav");
        if (musica != null) {
            musica.stop();
        }
    }

    public void detenerFondo() {
        if (musica != null) {
            musica.stop();
        }
    }

    public void gana() {
        Clip c = cargar("/sonidos/acierto.wav");
        if (musica != null) {
            c.start();
        }
    }

    public void pierde() {
        Clip c = cargar("/sonidos/acierto.wav");
        if (musica != null) {
            c.start();
        }
    }

    public void sonidoMeta() {
        Clip c = cargar("/sonidos/acierto.wav");
        if (musica != null) {
            c.start();
        }
    }
}
