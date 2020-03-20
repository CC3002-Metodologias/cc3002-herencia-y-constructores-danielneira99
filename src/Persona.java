public class Persona {
    protected String nombre;
    protected String ocupacion;
    protected int edad;

    public Persona(String Nombre, String Ocupacion, int Edad){
        this.nombre = Nombre;
        this.ocupacion = Ocupacion;
        this.edad = Edad;
    }

    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {
        System.out.println("ZzzZzZzZ");
    }

    public void hacerLoSuyo() {
        System.out.println("CUARENTENA");
    }
}
