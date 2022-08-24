/*
Problema:
4.- Cada término de la serie de Fibonacci se forma sumando los dos términos anteriores. Elabore un programa similar que cree una serie sumando los tres términos anteriores. El programa deberá imprimir los primeros 20 términos de esta serie.
*/

//Solución:
public class EjerciciosSerie4{
    public static void main(String[] args){

        long sig=1, act=0, tmp=0, ant=0;
        for(long i=1; i<=40; i=i+2){
            System.out.print(act +" ");
            ant=tmp;
            tmp=act;
            act=sig;
            sig=sig+tmp+ant;
        }
    }
}