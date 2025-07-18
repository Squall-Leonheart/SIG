public class MiPrimerPrograma{
	//Metodos en Java igual a funciones en otros programas
	public static void sumar(int a, int b){
		System.out.println(a+b);
	}
	public static int suma(int a, int b){
		return a+b;
	}
	//Parte donde empieza a correr el programa
	public static void main(String args[]){
		int valor1=0;
		String mensaje="Hola, mi nombre es PEPITO";
		if(valor1>0){
			System.out.println("El valor es mayor a 0");
		}else{
			System.out.println("El valor es menor o igual a 0");
		}
		while(valor1<10){
			valor1=valor1+1;
			System.out.println(valor1);
		}
		for(int i=0;i<=9;i++){
			System.out.println(i);
		}
	//Codigo relacionado a los Metodos
			sumar(5,7);
			System.out.println(suma(6,6));
	}
}