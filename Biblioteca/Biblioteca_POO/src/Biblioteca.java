
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        int opcion = 0;
        String user;
        Scanner scanner = new Scanner(System.in);
        List<RecursoBibliografico> recursos = new ArrayList<>();

        System.out.println("BIENVENIDO");
        System.out.println("Ingrese su nombre de usuario");
        user = scanner.nextLine();
        Usuario usuario = new Usuario(user);

        recursos.add(new Libro("El Quijote", "Miguel de Cervantes", "ISBN001",false));
        recursos.add(new Libro("Cien años de soledad", "Gabriel García Márquez", "ISBN002",false));
        recursos.add(new Libro("La Odisea", "Homero", "ISBN003",false));
        recursos.add(new Libro("1984", "George Orwell", "ISBN004",false));
        recursos.add(new Libro("El Principito", "Antoine de Saint-Exupéry", "ISBN005",false));

        recursos.add(new Revista("National Geographic", "ISSN001", 2024, 5));
        recursos.add(new Revista("Science", "ISSN002", 2023, 2));
        recursos.add(new Revista("Time", "ISSN003", 2022, 7));
        do {
            System.out.println("\n=== Menu de Biblioteca ===");
            System.out.println("1. Ver recursos disponibles");
            System.out.println("2. Prestar un recurso");
            System.out.println("3. Devolver un recurso");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
             case 1:
             System.out.println("\nRecursos Disponibles:");
             for (int i = 0; i < recursos.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        recursos.get(i).mostrarDetalle();
                        System.out.println("-----------------------");
               }
             break;
            
            case 2:
            System.out.print("Ingresa el numero del recurso que quieres prestar: ");
            int numPrestar = scanner.nextInt();
            if (numPrestar >= 1 && numPrestar <= recursos.size()) {
            RecursoBibliografico recurso = recursos.get(numPrestar - 1);

            if (recurso instanceof Libro) {
                Libro libro = (Libro) recurso;
                if (!libro.prestado) {
                libro.prestado = true;
                usuario.prestarRecurso(libro);
                System.out.println("Se te ha prestado el libro exitosamente.");
                 } else {
                System.out.println("Este libro ya fue prestado.");
                }
             } else if (recurso instanceof Revista) {
                Revista revista = (Revista) recurso;
            if (revista.ejemplares > 0) {
                revista.ejemplares -= 1;
                usuario.prestarRecurso(revista);
                System.out.println("Se te ha prestado una revista exitosamente.");
                 } else {
                System.out.println("No hay ejemplares disponibles de esta revista.");
                     }
                 }
                } else {
                System.out.println("Numero inválido.");
                }
                break;

                case 3:
                System.out.print("Ingresa el numero del recurso que quieres devolver: ");
                 int numDevolver = scanner.nextInt();
                if (numDevolver >= 1 && numDevolver <= recursos.size()) {
                RecursoBibliografico recurso = recursos.get(numDevolver - 1);

                if (recurso instanceof Libro) {
                Libro libro = (Libro) recurso;
                if (libro.prestado) {
                libro.prestado = false;
                usuario.devolverRecurso(libro);
                System.out.println("Has devuelto el libro exitosamente.");
                } else {
                System.out.println("Este libro no estaba prestado.");
                }
                } else if (recurso instanceof Revista) {
                 Revista revista = (Revista) recurso;
                revista.ejemplares += 1;
                 usuario.devolverRecurso(revista);
                System.out.println("Has devuelto una revista exitosamente.");
                    }
                } else {
                System.out.println("Numero invalido.");
                }
                break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion invalida. Intenta nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
