/*
Problema:
6.- Elabore un programa similar al anterior, pero utilizando la clase StringBuilder y el método append para almacenar la cadena grande, así como el método indexOf para buscar la subcadena “IPN”. Posteriormente y haciendo uso del método System.nanoTime() compare los tiempos de ejecución del ejercicio anterior con el actual haciendo las búsquedas en una cadena suficientemente grande donde al menos en uno de los dos casos el tiempo sea aproximadamente de un segundo.

Importante: Su código no debe imprimir más que el número de ocurrencias, de lo contrario estará midiendo los tiempos de impresión más que los de procesamiento. Si es necesario optimice ambos códigos lo mejor posible.

¿Cuál de los dos códigos resultó ser más eficiente? ¿Cuántas veces resultó más rápido uno que el otro? ¿Qué he aprendido sobre los arreglos de char y la clase String?
*/

//Solución:
import java.util.*;
public class EjerciciosSerie6{
    public static void main(String[] args){
        long time1 = System.nanoTime();
        int n = Integer.parseInt(args[0]);
        StringBuilder str = new StringBuilder();
        Random r = new Random();
        List<Integer> apariciones = new ArrayList<Integer>();
        for(int i = 0; i < (n*4); i++){
            // 65 = A y 90 =Z
            if((i+1)%4==0){
                str.append(((char)32) + ""); 
            }else{
                int aleatorio = (r.nextInt(90-65)+65);
                // System.out.println("Char:" + aleatorio);
                str.append(((char)aleatorio)+"");
            }  
        }
        boolean t = true;
        String cadena = str.toString();
        while(t){
            int index = cadena.indexOf("IPN");
            if(index == -1){
                t = false;
            }else{
                cadena = cadena.substring(index + 2, cadena.length());
                apariciones.add(index);
            }
        }
        long time2 = System.nanoTime();
        System.out.println("Ocurrencias: "+ apariciones.size() +" Time: "+ (time2-time1)*0.000000001 + " segundos");
    }
}

/*
Método de compilación y de ejecución del programa. (Desde terminal)
Compilación: javac EjerciciosSerie6.java
Ejecución: java EjerciciosSerie6 175760
*/

/*
¿Cuál de los dos códigos resultó ser más eficiente?
    R/: El del ejercicio 5
¿Cuántas veces resultó más rápido uno que el otro?
    R/: Aproximadamente 75% mas rápido
¿Qué he aprendido sobre los arreglos de char y la clase String?
    R/:Los arreglos char son una secuencia de caracteres y l clas String representa una cadena de caracteres no modificable.
*/