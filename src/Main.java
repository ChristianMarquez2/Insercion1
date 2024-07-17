import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del estudiante:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la cédula del estudiante:");
        String cedula = scanner.nextLine();

        System.out.println("Ingrese la edad del estudiante:");
        int edad = scanner.nextInt();

        Estudiante estudiante = new Estudiante(nombre, apellido, cedula, edad);

        System.out.println("Estudiante insertado:");
        System.out.println(estudiante);
    }
}
