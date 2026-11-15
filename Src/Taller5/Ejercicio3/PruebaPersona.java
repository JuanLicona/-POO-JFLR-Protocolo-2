package Taller5.Ejercicio3;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona();

        p.edad = 18;
        System.out.println("Edad: " + p.edad);

        // p.nombre = "Juan";
        // System.out.println(p.nombre);

        p.setNombre("Juan Licona");
        System.out.println("Nombre: " + p.getNombre());
    }
}
