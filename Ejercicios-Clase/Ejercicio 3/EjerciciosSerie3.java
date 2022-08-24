/*
Problema:
3.- Escriba un programa que cuente del 1 al 15, imprima cada número y luego cuente hacia atrás de dos en dos hasta el 1, imprimiendo nuevamente cada número.
*/

//Solución:
public class EjerciciosSerie3{
    public static void main(String[] args){

        for(int i=1; i<=15; i++){
            System.out.print(i+" ");
        }
        for(int j=15; j>=1; j=j-2){
            System.out.print(j+" ");
        }
    }
}