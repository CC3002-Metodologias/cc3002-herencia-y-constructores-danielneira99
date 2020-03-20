public class Estudiante extends Persona{
    public Estudiante(String Nombre, int Edad){
        super(Nombre,"ESTUDIANTE",Edad);
    }
    public void dormir(){
        System.out.println("ZzzZzz");
    }
    public void comer(){
        System.out.println("AGUANTE LA FABRICA");
    }
    public void hacerLoSuyo(){
        super.hacerLoSuyo();
        System.out.println("VER ANIME Y SERIES DE NETFLIX");
    }
}
