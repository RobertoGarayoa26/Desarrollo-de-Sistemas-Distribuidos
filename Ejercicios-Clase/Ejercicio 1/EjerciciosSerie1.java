/*
Problema:
1.- Se ha elaborado el siguiente programa para convertir grados centígrados a Fahrenheit. Determine cual es el error y corríjalo mediante un cast para que dé el valor correcto.

public class EjerciciosSerie1 {
    public static void main(String[] args){
        double c = 20;
        double f;
        f = (9/5) * c + 32.0;
        System.out.println(f);
}
*/

//Solución:
public class EjerciciosSerie1 {
    public static void main(String[] args){

        double c = 20;
        double f;
        f = (((double) 9/5) * c + 32.0);
        System.out.println(f);
    }
}