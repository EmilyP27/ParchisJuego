/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author EMILI VALERIA
 */
public class Preguntas {

    private Random random = new Random();
    //CAMBIAR LAS PREGUNTAS DE LOS ARREGLOS 
    private String[][] facil = {
        {"System.out.println( ´´El ciclo del carbono incluye procesos como la fotosíntesis y la respiración celular. ´´) imprime en pantalla?", "V"},
        {"System.out.println( ´´El camuflaje es una forma de adaptación morfológica. ´´) imprime en pantalla?", "V"},// la ultima pregunta del arreglo
        {"System.out.println( ´´ El mimetismo permite a los organismos parecerse a otros más peligrosos. → Verdadero´´) imprime en pantalla?", "V"},
        {"System.out.println( ´´ La hibernación es una adaptación fisiológica frente al frío extremo.´´) imprime en pantalla?", "V"},
        {"System.out.println( ´´ Las adaptaciones fisiológicas no dependen del entorno.´´) imprime en pantalla?", "F"},
        {"System.out.println( ´´ La migración es una forma de adaptación etológica.´´) imprime en pantalla?", "V"},
    };

    private String[][] medias = {
        {"System.out.println( ´´ El cortejo es un comportamiento que busca evitar depredadores. ´´) imprime en pantalla?", "F"},
        {"System.out.println( ´´ El tropismo es un movimiento que orienta a los organismos hacia estímulos como la luz.´´) imprime en pantalla?", "V"},// la ultima pregunta del arreglo
        {"System.out.println( ´´ Las adaptaciones etológicas implican cambios en la estructura física del organismo. ´´) imprime en pantalla?", "F"},
        {"System.out.println( ´´ Los alelos son variantes de un mismo gen. ´´) imprime en pantalla?", "V"},
        {"System.out.println( ´´  El genotipo es la expresión observable de un rasgo. ´´) imprime en pantalla?", "F"},
        {"System.out.println( ´´ La descomposición de materia orgánica contribuye al ciclo del fósforo. ´´) imprime en pantalla?", "V"},
        {"System.out.println( ´´ En una cadena alimentaria, la energía fluye desde los productores hacia los consumidores. ´´) imprime en pantalla?", "V"},
    };

    private String[][] dificiles = {
        {"System.out.println( ´´ Todos los rasgos genéticos son determinados únicamente por un solo gen. →´´) imprime en pantalla?", "F"},//pregunta 1
        {"System.out.println( ´´ En la cadena alimentaria los descomponedores no forman parte de la cadena alimentaria. ´´) imprime en pantalla?", "F"},//pregunta 2
        {"System.out.println( ´´ Una red trófica representa múltiples cadenas alimentarias interconectadas. ´´) imprime en pantalla?", "V"},// pregunta 3 la ultima pregunta del arreglo
        {"System.out.println( ´´ Las redes tróficas solo existen en ecosistemas acuáticos. ´´) imprime en pantalla?", "F"},
        {"System.out.println( ´´ La densidad poblacional se refiere al número de individuos por unidad de área. ´´) imprime en pantalla?", "V"},
        {"System.out.println( ´´ La natalidad y la mortalidad no afectan el tamaño de una población. ´´) imprime en pantalla?", "F"},
        {"System.out.println( ´´ La resistencia ambiental limita el crecimiento de las poblaciones. ´´) imprime en pantalla?", "V"},

    };

    public boolean preguntasVF(int dificultad) {
        String[][] banco;
        if (dificultad == 1) {
            banco = facil;
        } else if (dificultad == 2) {
            banco = medias;
        } else {
            banco = dificiles;
        }

        //
        int indice = random.nextInt(banco.length);
        String pregunta = banco[indice][0];
        String respuestas = banco[indice][1];

        String titulo = "Pregunta";

        int option = JOptionPane.showConfirmDialog(null, pregunta + "\n\n Seleccione: Si = Verdadero, No = Falso", titulo, JOptionPane.YES_NO_OPTION);
        String respuestaJugador;
        if (option == JOptionPane.YES_OPTION) {
            respuestaJugador = "V";
        } else {
            respuestaJugador = "F";
        }
        boolean correcta;
        if (respuestaJugador.equals(respuestas)) {
            correcta = true;
        } else {
            correcta = false;
        }

        String mensaje;
        if (correcta) {
            if (dificultad == 1) {
                mensaje = "Correcto ganaste 1 punto";
            } else if (dificultad == 2) {
                mensaje = "Correcto ganaste 2 punto";
            } else {
                mensaje = "Correcto ganaste 3 punto";
            }

        } else {
            if (dificultad == 1) {
                mensaje = "Incorrecto perdiste 1 punto";
            } else if (dificultad == 2) {
                mensaje = "Incorrecto perdiste 2 punto";
            } else {
                mensaje = "Incorrecto perdiste 3 punto";
            }
        }
        JOptionPane.showMessageDialog(null, mensaje);

        return correcta;
    }//fin metodo

}// fin de la clase
