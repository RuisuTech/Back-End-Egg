import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        GestorDeContactos gestor = new GestorDeContactos();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n1. Agregar contacto (ArrayList)");
                System.out.println("2. Eliminar contacto (ArrayList)");
                System.out.println("3. Agregar contacto (HashSet)");
                System.out.println("4. Eliminar contacto (HashSet)");
                System.out.println("5. Mostrar contactos (ArrayList)");
                System.out.println("6. Mostrar contactos (HashSet)");
                System.out.println("7. Salir");
                System.out.print("Selecciona una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();  // Consumir el salto de línea
                
                if (opcion == 7) {
                    break;
                }
                
                String nombre, telefono, correo;
                Contacto contacto;
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Nombre: ");
                        nombre = scanner.nextLine();
                        System.out.print("Teléfono: ");
                        telefono = scanner.nextLine();
                        System.out.print("Correo: ");
                        correo = scanner.nextLine();
                        contacto = new Contacto(nombre, telefono, correo);
                        gestor.agregarContactoArrayList(contacto);
                    }
                        
                    case 2 -> {
                        System.out.print("Nombre: ");
                        nombre = scanner.nextLine();
                        contacto = new Contacto(nombre, "", "");
                        gestor.eliminarContactoArrayList(contacto);
                    }
                        
                    case 3 -> {
                        System.out.print("Nombre: ");
                        nombre = scanner.nextLine();
                        System.out.print("Teléfono: ");
                        telefono = scanner.nextLine();
                        System.out.print("Correo: ");
                        correo = scanner.nextLine();
                        contacto = new Contacto(nombre, telefono, correo);
                        gestor.agregarContactoHashSet(contacto);
                    }
                        
                    case 4 -> {
                        System.out.print("Nombre: ");
                        nombre = scanner.nextLine();
                        contacto = new Contacto(nombre, "", "");
                        gestor.eliminarContactoHashSet(contacto);
                    }
                        
                    case 5 -> gestor.mostrarContactosArrayList();
                        
                    case 6 -> gestor.mostrarContactosHashSet();
                        
                    default -> System.out.println("Opción no válida.");
                }
            }
        }
    }
}
