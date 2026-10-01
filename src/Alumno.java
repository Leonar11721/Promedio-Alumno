public class Alumno {

    String nombre;
    double[] calificaciones;

    public double calcularPromedio(double[] calificaciones) {
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        return suma / calificaciones.length;
    }

    public char obtenerCalificacion(double promedio) {
        if (promedio >= 91) {
            return 'A';
        } else if (promedio >= 81) {
            return 'B';
        } else if (promedio >= 71) {
            return 'C';
        } else if (promedio >= 61) {
            return 'D';
        } else if (promedio >= 51) {
            return 'E';
        } else {
            return 'F';
        }
    }

    public void mostrarResultados(String nombre, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
}