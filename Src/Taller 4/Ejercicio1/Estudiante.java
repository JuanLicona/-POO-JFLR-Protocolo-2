public class Estudiante {

    private String nombre;
    private int edad;
    private double NotaPromedio;

    public Estudiante(String nombre, int edad, double NotaPromedio) {
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(NotaPromedio);

    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre.equals("")) {
            this.nombre = nombre;
        }  else {
            System.out.println("El nombre no puede estar vacio");
        }
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser menor a 0");
        }

    }

    public double getNotaPromedio() {
        return NotaPromedio;
    }
    public void setNotaPromedio(double NotaPromedio) {
        if (NotaPromedio > 0 && NotaPromedio <= 10) {
            this.NotaPromedio = NotaPromedio;
        } else {
            System.out.println("La nota promedio debe estar entre 0 y 10");
        }
    }
}
