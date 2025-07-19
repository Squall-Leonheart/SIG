public class Principal{
    public static void main(String args[]){
        System.out.println("Esta es mi clase princial y funciona");
        //Creamos los objetos
        Persona lupita = new Persona(5,4,3,'F',"Estadounidense",100,"Lupita Perez");
        Persona Pepito = new Persona(8,6,2,'M',"Mexicano",50,"Pepito Hernandez");
        Persona Pablo = new Persona(7,5,1,'M',"Colombiano",20,"Jorge Rodríguez");
        lupita.dormir();
        lupita.embriagarse();
        lupita.dormir();
        System.out.println(lupita.getEdad());
        Pepito.dormir();
        Pepito.embriagarse();
        Pepito.embriagarse();
        Pepito.embriagarse();
        Pepito.dormir();
        Pepito.dormir(80);
        System.out.println(Pepito.getEdad());
        Pablo.dormir();
        Pablo.embriagarse();
        Pablo.dormir();
        System.out.println(Pablo.getEdad());
    }
}