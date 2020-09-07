/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.practica;

/*
     1- Crear la clase Perro, la misma debe tener 3 atributos y el método ladrar() que muestre
    “Guau” por consola. Crear un objeto de esta clase y comprobar el funcionamiento
    
    2- Crear la clase Auto con los atributos marca, modelo y kilometraje, elegir el tipo de dato
    adecuado para ellos. Además se debe crear el método estadoAuto() que depende el
    kilometraje muestre un mensaje: (falta)
   
*   0 km Esta nuevo
*   10000km Poco usado
*   100000km Usado
*   100000km Bastante usado
    Crear un objeto de esta clase y comprobar el funcionamiento

*   4- Para la clase del ejercicio 1 crear un método constructor que 
    solicite como parámetro uno de los atributos.

    5- Para la clase del ejercicio 2 crear el método constructor que solicite como parámetro los 3
    atributos de la clase.  (falta)
* 
    7- Encapsular (poner todos sus atributos privados) la clase del ejercicio 1 y realizar los métodos
*   getter y setter necesarios.
    8- Encapsular la clase del ejercicio 2 y realizar los métodos getter y setter necesarios.
   (falta)
 */


public class POOPractica {

    
    public static void main(String[] args) {

        
String separador="------------------------------------------------------";   
            
/*
se instancia y se crean objetos de la clase perro        
*/

perro firulais, snoopy,dinamita;

firulais = new perro();
snoopy = new perro ("blanco");
dinamita = new perro (5,"negro");


System.out.println(separador);
System.out.println("Los atributos del perro firulais son:");
System.out.println("Cantidad de patas: "+firulais.patas);
System.out.println("¿Tiene pulgas?: "+firulais.pulgas);
System.out.println("¿Que color posee?: "+ firulais.color);

firulais.ladrar();

System.out.println(separador);
System.out.println("Llamando al metodo para hacer pulgoso a firulais:");
System.out.println("¿Tiene pulgas?: "+firulais.espulgoso(firulais.pulgas));
System.out.println(separador);

System.out.println("Los atributos del perro snoopy son:");
System.out.println("Cantidad de patas: "+snoopy.patas);
System.out.println("¿Tiene pulgas?: "+snoopy.pulgas);
System.out.println("¿Que color posee?: "+ snoopy.color);
snoopy.ladrar();

System.out.println(separador);


System.out.println("Los atributos del perro dinamita son:");
System.out.println("Cantidad de patas: "+dinamita.patas);
System.out.println("¿Tiene pulgas?: "+dinamita.espulgoso(dinamita.pulgas));
System.out.println("¿Que color posee?: "+ dinamita.color);
snoopy.ladrar();
snoopy.ladrar();
snoopy.ladrar();

System.out.println(separador);


    }
    
}
