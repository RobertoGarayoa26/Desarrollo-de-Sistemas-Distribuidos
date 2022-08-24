/*
Problema:
5.- El programa consiste en generar n “palabras” de tres letras mayúsculas aleatorias e irlas concatenando en una cadena gigante, manteniendo un espacio en blanco de separación entre cada palabra. Posteriormente debe hacerse la búsqueda de la subcadena “IPN” en la cadena gigante y contabilizar el número de apariciones, así como la posición dentro de la cadenota donde apareció.

El programa debe recibir el número n como parámetro en la línea de comandos de manera que debe incluir al inicio algo como:

n = Integer.parseInt(args[0]);

Por cuestiones de desempeño la cadena deberá almacenarse en un arreglo de tipo byte:

byte[] cadenota = new byte[n*4];  

¿De acuerdo con la teoría de la probabilidad cuantas palabras deberían generarse para que se dé una ocurrencia? ¿Y para diez ocurrencias? 

Favor de responder las preguntas y ejecutar ambos con el número de tokens para que ocurran aproximadamente 10 ocurrencias de "IPN" en la misma computadora para que tenga validez. Solo imprima el número de veces que encontró la palabra "IPN". Para una ocurrencia debe haber 263 tokens en la cadenota.
*/

//Solución:
import java.util.*;
public class EjerciciosSerie5{
    public static void main(String[] args){
        
        long time1 = System.nanoTime();
        int n = Integer.parseInt(args[0]);
        byte[] cadena = new byte[n*4];
        Random r = new Random();
        List<Integer> apariciones = new ArrayList<Integer>();
        for(int i = 0; i < (n*4); i++){
            // 65 = A y 90 =Z
            if((i+1)%4==0){
                cadena[i] = (char)32;
            }else{
                int aleatorio = (r.nextInt(90-65)+65);
                cadena[i] = (byte)aleatorio;
            }  
        }
        for(int i = 0; i< (n*4); i+=4){
            if(cadena[i] == (byte)'I'){
                apariciones.add(i);
                //14225872
            }
        }
        for(int i = 0; i<apariciones.size(); i=i+1){
            if(cadena[apariciones.get(i)+1] != (byte)'P'){
                apariciones.remove(i);
                i--;
            }
        }

        for(int i = 0; i<apariciones.size(); i++){
            if(cadena[apariciones.get(i)+2] != (byte)'N'){
                apariciones.remove(i);
                i--;
            }
        }
        long time2 = System.nanoTime();
        //System.out.println(apariciones);

        System.out.println("Ocurrencias:" + apariciones.size() + " Time: " + (time2 - time1)*0.000000001 +" segundos");
    }
}

/*
Método de compilación y de ejecución del programa. (Desde terminal)
Compilación: javac EjerciciosSerie5.java
Ejecución: java EjerciciosSerie5 175760
*/

/*
¿De acuerdo con la teoría de la probabilidad cuantas palabras deberían generarse para que se dé una ocurrencia? 
    R/: 17576
¿Y para diez ocurrencias?
    R/: 175760
*/