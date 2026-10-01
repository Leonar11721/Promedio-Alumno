public class Main {

    public static void main(String[] args) {

        Alumno alumno = new Alumno();

        alumno.nombre = "Leonardo";

        alumno.calificaciones = new double[]{80, 90, 75, 85, 95};

        double promedio = alumno.calcularPromedio(alumno.calificaciones);

        char calificacion = alumno.obtenerCalificacion(promedio);

        alumno.mostrarResultados(alumno.nombre, promedio, calificacion);
    }
}