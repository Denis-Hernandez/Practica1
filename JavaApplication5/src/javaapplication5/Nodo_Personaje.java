/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Denis
 */
class Nodo_Personaje {
    Nodo_Personaje siguiente;
    String Nombre;
    int daño;
    int vida;
    String Clase;
    Nodo_Personaje(String Nombre,int daño,int vida,String Clase){
        this.Nombre = Nombre;
        this.daño = daño;
        this.vida = vida;
        this.Clase=Clase;
    }
}
