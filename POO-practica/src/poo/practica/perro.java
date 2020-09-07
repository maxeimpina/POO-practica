/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo.practica;

import java.util.Random;


/**
 * * Crea la clase perro que sera el modelo de los objetos perros
 */

public class perro {
    
    //Atributos
 int patas=0;                //cantidad de patas por defecto
 boolean pulgas=false;       //nos dira si tiene o no pulgas
 String color="";


// genera del string colores un numero aleatorio 
// que sera el color instanciado


String [] colores = {"blanco", "negro", "marron"};  //vector de colores posibles
Random seleccion = new Random();                    
int posiciondecolor = seleccion.nextInt(3);

    //Atributo color
//String color= colores[posiciondecolor]; //ya seteado en el constructor ppal


    //Constructor ppal
public perro(){
    this.patas=4;
    this.pulgas=false;
    this.color=colores[posiciondecolor]; //color efectivamente dado
}

public perro(String color){
    this();
    this.color=color;     //se pasa por sobrecarga
}

public perro(int patas, String color){
    this();
    this.patas=patas;     //se pasa por sobrecarga
    this.color=color;     //se pasa por sobrecarga
}


    //Metodo para emitir ladrido
public void ladrar(){
    String ladrido="¡¡Guau Guau!!";
    System.out.println (ladrido);
}    


    //Metodo para dejar al perro con pulgas
public boolean espulgoso(boolean pulgas){
    if (pulgas == false){ 
        pulgas = true;
        return pulgas;
    } else {
        return pulgas;
    }       
}
    


}
