import java.util.Random;
import java.util.Scanner;
public class ArregloPrincipal{
    public static void main(String args[]){
        Random aleatorio = new Random();
        Scanner ingreso = new Scanner(System.in);
        int min;
        int max;
        int x;
        //Arreglo Y
        int y[] = new int[5];
        //Arreglo de enteros bidimencional
        int z[][] = new int[3][3];
        for (int i=0; i<y.length; i++){
            y[i]=aleatorio.nextInt(100);
        }
        //Para poder moverse entre las posiciones del arreglo
        //Para encontrar el mínimo y el máximo
        min=y[0];
        max=y[0];
        for (int i=0; i<y.length; i++){
            if (y[i]<min){
                min=y[i];
            }
            if (y[i]>max){
                max=y[i];
            }
            System.out.print(y[i]+" ");
        }
        System.out.println();
        System.out.println("El valor mínimo del arreglo es: "+min);
        System.out.println("El valor máximo del arreglo es: "+max);
    }
}