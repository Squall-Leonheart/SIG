import java.util.Random;
import java.util.Scanner;
public class Arreglo2DPrincipal{
    public static void main(String args[]){
        Random aleatorio = new Random();
        Scanner ingreso = new Scanner(System.in);
        int min;
        int max;
        int x;
        //Arreglo Y
        int y[] = new int[5];
        //Arreglo de enteros bidimencional
        int z[][] = new int[5][10];
        //Asignar valores aleatorios a z[][]
        for (int i=0; i<z.length; i++){
            for (int j=0; j<z[i].length; j++){
                z[i][j]=aleatorio.nextInt(100);
            }
        }
        //Para poder moverse entre las posiciones del arreglo
        for (int i=0; i<z.length; i++){
            for (int j=0; j<z[i].length; j++){
                System.out.print(z[i][j]+" ");
            }
            System.out.println();
        }
    }
}