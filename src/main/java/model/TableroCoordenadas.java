/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author EMILI VALERIA
 */
public class TableroCoordenadas {

    private Coordenadas[] recorrido = new Coordenadas[]{
        //1-10
        new Coordenadas(296, 455),//1
        new Coordenadas(293, 432),//2
        new Coordenadas(294, 407),//3
        new Coordenadas(293, 389),//4
        new Coordenadas(291, 368),//5
        new Coordenadas(292, 340),//6
        new Coordenadas(291, 316),//7

        //8-9
        new Coordenadas(287, 296),//8
        new Coordenadas(307, 274),//9

        //10-16
        new Coordenadas(332, 273),//10
        new Coordenadas(351, 272),//11
        new Coordenadas(375, 277),//12
        new Coordenadas(401, 276),//13
        new Coordenadas(427, 277),//14
        new Coordenadas(449, 276),//15
        new Coordenadas(471, 272),//16

        //17
        new Coordenadas(468, 229),//17
        //18-24
new Coordenadas (473,176),//18
new Coordenadas (448,164),//19
new Coordenadas (422,166),//20
new Coordenadas (401,166),//21
new Coordenadas (379,170),//22
new Coordenadas (355,168),//23
new Coordenadas (333,168),//24

//25-26
new Coordenadas (311,180),//25
new Coordenadas (280,163),//26

//27-33
new Coordenadas (284,135),//27
new Coordenadas (291,116),//28
new Coordenadas (292,89),//29
new Coordenadas (299,64),//30
new Coordenadas (296,40),//31
new Coordenadas (291,22),//32
new Coordenadas (291,0),//33

//34
new Coordenadas (241,3),//34

//35-41
new Coordenadas (191,3),//35
new Coordenadas (193,22),//36
new Coordenadas (198,43),//37
new Coordenadas (195,68),//38
new Coordenadas (187,90),//39
new Coordenadas (187,113),//40
new Coordenadas (190,138),//41

//42-43
new Coordenadas (193,163),//42
new Coordenadas (172,184),//43

//44-50
new Coordenadas (149,174),//44
new Coordenadas (125,176),//45
new Coordenadas (99,173),//46
new Coordenadas (78,176),//47
new Coordenadas (55,171),//48
new Coordenadas (30,169),//49
new Coordenadas (9,173),//50

//51
new Coordenadas (8,227),//51

//52-58
new Coordenadas (10,288),//52
new Coordenadas (30,287),//53
new Coordenadas (57,288),//54
new Coordenadas (79,290),//55
new Coordenadas (103,287),//56
new Coordenadas (128,281),//57
new Coordenadas (147,284),//58

//59-60
new Coordenadas (173,274),//59
new Coordenadas (191,295),//60

//61-67
new Coordenadas (191,323),//61
new Coordenadas (198,342),//62
new Coordenadas (187,364),//63
new Coordenadas (185,388),//64
new Coordenadas (189,413),//65
new Coordenadas (193,440),//66
new Coordenadas (187,463),//67

//68
new Coordenadas (243,459),//68

    //Faltan coordenadas-cambiar
    };

    private int salida_amarillo = 5;
    private int salida_azul = 22;
    private int salida_rojo = 39;
    private int salida_verde = 56;

    public Coordenadas getPosicion(int indice) {
        return recorrido[indice];
    }

    private int getTotalCasillas() {
        return recorrido.length;
    }

}


