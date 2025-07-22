import java.util.Random;

public class PromedioArregloPrincipal{
    public static void main(String args[]){
        Random aleatorio = new Random();
        int cantidad=0;
        int cuenta=0;
        int promedio=0;
        int suma=0;
        //Arreglo Y
        int y[] = new int[100];
        for (int i=0; i<y.length; i++){
            y[i]=aleatorio.nextInt(100);
        }
        //Para poder moverse entre las posiciones del arreglo
        //Para encontrar el mínimo y el máximo
        
        for (int i=0; i<y.length; i++){
            cantidad=cantidad+y[i];
            cuenta=cuenta+1;
            //Otra Forma
            suma=suma+y[i];
            System.out.print(y[i]+" ");
        }
        promedio=cantidad/cuenta;
        System.out.println();
        System.out.println("La suma de los valores del arreglo es: "+cantidad);
        System.out.println("La cantidad de los valores del arreglo es: "+cuenta);
        System.out.println("El Promedio de los valores del arreglo es: "+promedio);
        System.out.println("El Promedio de los valores del arreglo es: "+suma/y.length);
    }
}