public class Persona{
    int edad;
    int estatura;
    int peso;
    char genero;
    String nacionalidad;
    int energia;
    String nombre;
    //Metodo constructor que inicializa el proceso
    Persona(int edad, int estatura, int peso, char genero, String nacionalidad, int prueba, String nombre){
        this.edad=edad;
        this.estatura=estatura;
        this.peso=peso;
        this.genero=genero;
        this.nacionalidad=nacionalidad;
        this.energia=prueba;
        this.nombre=nombre;
    }
    public void dormir(){
        System.out.println("La persona "+nombre+" esta durmiendo, por favor hacer silencio");
        energia=energia+10;
        System.out.println("La nueva energía de la persona es: "+energia);
    }
    public void dormir(int a){
        System.out.println("La persona "+nombre+" esta durmiendo, por favor hacer silencio");
        energia=energia+a;
        System.out.println("La nueva energía de la persona es: "+energia);
    }
    public void embriagarse(){
        System.out.println("La persona esta tomando guaro");
        if (energia>=20){
            energia=energia-20;
        }else{
            energia=0;
            dormir();
        }
        if (energia<=0){
            System.out.println(nombre+" Llamo al ex");
        }
        System.out.println("La energía que le queda es: "+energia);
    }
    public void comer(){
        System.out.println("La persona esta comiendo");
    }
    public void respirar(){
        System.out.println("La persona esta respirando");
    }
    public int getEdad(){
        return edad;
    }
}