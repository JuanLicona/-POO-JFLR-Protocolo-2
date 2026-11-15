Package Ejercicio1;
public class InstanciaEstudiante {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Juan Licona", 17, 4.5);

        System.out.println();

        System.out.println("Nombre:" + estudiante.getNombre());
        System.out.println("Edad:" + estudiante.getEdad());
        System.out.println("Nota Promedio:" + estudiante.getNotaPromedio());
    }

}

void main() {
}
