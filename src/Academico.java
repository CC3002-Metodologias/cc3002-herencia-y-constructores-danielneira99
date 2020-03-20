public class Academico extends Persona{
    private String paper;
    public Academico(String Nombre, int Edad, String Paper){
        super(Nombre,"ACADEMICO",Edad);
        this.paper = Paper;
    }

    public void dormir(){
        System.out.println("ZzzZzzZ");
    }
    public void hacerLoSuyo(){
        super.hacerLoSuyo();
        System.out.println("APRENDER A USAR ZOOM");
    }
    public void publicarPaper(){
        System.out.println(this.paper);
    }

}
