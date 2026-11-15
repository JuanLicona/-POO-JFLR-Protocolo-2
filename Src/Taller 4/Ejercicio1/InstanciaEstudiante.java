public class InstanciaEstudiante {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Juan Licona", 17, 3.5);

        System.out.println("Nombre:" + estudiante.getNombre());
        System.out.println("Edad:" + estudiante.getEdad());
        System.out.println("Nota Promedio:" + estudiante.getNotaPromedio());
    }

}
