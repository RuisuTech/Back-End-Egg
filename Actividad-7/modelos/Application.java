package modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    // Variable global para almacenar los empleados y filtros
    private static List<Empleado> empleadosOriginales = new ArrayList<>();
    private static List<Empleado> empleadosFiltrados = new ArrayList<>();

    public static void main(String[] args) {
        // Inicializar empleados de ejemplo
        empleadosOriginales.add(new Empleado("Ana", 30, 3000, "Ventas"));
        empleadosOriginales.add(new Empleado("Luis", 45, 4000, "Marketing"));
        empleadosOriginales.add(new Empleado("Carlos", 28, 3500, "IT"));
        
        // Copiar empleados originales al filtro
        empleadosFiltrados.addAll(empleadosOriginales);

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            // Mostrar menú
            System.out.println("\n--- Menú de Gestión de Empleados ---");
            System.out.println("1. Mostrar todos los empleados");
            System.out.println("2. Crear empleado");
            System.out.println("3. Filtrar empleados");
            System.out.println("4. Ordenar empleados");
            System.out.println("5. Incrementar salario");
            System.out.println("6. Limpiar filtros");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    mostrarEmpleados(empleadosFiltrados.toArray(new Empleado[0]));
                    break;
                case 2:
                    crearEmpleado(scanner);
                    break;
                case 3:
                    filtrarEmpleados(scanner);
                    break;
                case 4:
                    ordenarEmpleados(scanner);
                    break;
                case 5:
                    incrementarSalario(scanner);
                    break;
                case 6:
                    limpiarFiltros();
                    break;
                case 7:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
                    break;
            }
        }
        scanner.close();
    }

    private static void mostrarEmpleados(Empleado[] empleados) {
        System.out.printf("%-5s %-20s %-5s %-10s %-15s%n", "No", "Nombre", "Edad", "Salario", "Departamento");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < empleados.length; i++) {
            Empleado e = empleados[i];
            System.out.printf("%-5d %-20s %-5d %-10.2f %-15s%n", i + 1, e.getNombre(), e.getEdad(), e.getSalario(), e.getDepartamento());
        }
    }

    private static void crearEmpleado(Scanner scanner) {
        System.out.print("Ingrese el nombre del nuevo empleado: ");
        String nombre = scanner.nextLine();

        // Verificar si el empleado ya existe
        boolean existe = empleadosOriginales.stream().anyMatch(e -> e.getNombre().equalsIgnoreCase(nombre));
        if (existe) {
            System.out.println("Error: Ya existe un empleado con ese nombre.");
            return;
        }

        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el departamento del empleado: ");
        String departamento = scanner.nextLine();

        Empleado nuevoEmpleado = new Empleado(nombre, edad, salario, departamento);
        empleadosOriginales.add(nuevoEmpleado);
        empleadosFiltrados.add(nuevoEmpleado);
        System.out.println("Empleado creado exitosamente.");
    }

    private static void filtrarEmpleados(Scanner scanner) {
        System.out.println("Seleccione el atributo por el cual filtrar:");
        System.out.println("1. Nombre");
        System.out.println("2. Edad");
        System.out.println("3. Salario");
        System.out.println("4. Departamento");
        System.out.print("Seleccione una opción: ");

        int criterio = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (criterio) {
            case 1:
                System.out.print("Ingrese el nombre a filtrar: ");
                String nombreFiltro = scanner.nextLine();
                empleadosFiltrados = new ArrayList<>(List.of(filtrarEmpleados(empleadosOriginales.toArray(new Empleado[0]), "nombre", nombreFiltro, null)));
                break;
            case 2:
                System.out.print("Ingrese la edad mínima: ");
                int edadMin = scanner.nextInt();
                System.out.print("Ingrese la edad máxima: ");
                int edadMax = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                empleadosFiltrados = new ArrayList<>(List.of(filtrarEmpleados(empleadosOriginales.toArray(new Empleado[0]), "edad", edadMin, edadMax)));
                break;
            case 3:
                System.out.print("Ingrese el salario mínimo: ");
                double salarioMin = scanner.nextDouble();
                System.out.print("Ingrese el salario máximo: ");
                double salarioMax = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea
                empleadosFiltrados = new ArrayList<>(List.of(filtrarEmpleados(empleadosOriginales.toArray(new Empleado[0]), "salario", salarioMin, salarioMax)));
                break;
            case 4:
                System.out.print("Ingrese el departamento a filtrar: ");
                String departamentoFiltro = scanner.nextLine();
                empleadosFiltrados = new ArrayList<>(List.of(filtrarEmpleados(empleadosOriginales.toArray(new Empleado[0]), "departamento", departamentoFiltro, null)));
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.println("Filtrado aplicado.");
    }

    private static void ordenarEmpleados(Scanner scanner) {
        System.out.println("Seleccione el atributo por el cual ordenar:");
        System.out.println("1. Nombre");
        System.out.println("2. Edad");
        System.out.println("3. Salario");
        System.out.println("4. Departamento");
        System.out.print("Seleccione una opción: ");

        int criterio = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        String atributo;
        switch (criterio) {
            case 1:
                atributo = "nombre";
                break;
            case 2:
                atributo = "edad";
                break;
            case 3:
                atributo = "salario";
                break;
            case 4:
                atributo = "departamento";
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        empleadosFiltrados = new ArrayList<>(List.of(ordenarEmpleados(empleadosFiltrados.toArray(new Empleado[0]), atributo)));
        System.out.println("Ordenación aplicada.");
    }

    private static void incrementarSalario(Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado cuyo salario desea incrementar: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el porcentaje de aumento: ");
        double porcentaje = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        Empleado empleado = buscarPorNombre(empleadosOriginales.toArray(new Empleado[0]), nombre);
        if (empleado != null) {
            empleado = incrementarSalario(empleado, porcentaje);
            System.out.println("Salario incrementado exitosamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    private static void limpiarFiltros() {
        empleadosFiltrados = new ArrayList<>(empleadosOriginales);
        System.out.println("Filtros limpiados. Mostrando todos los empleados.");
    }

    public static Empleado[] filtrarEmpleados(Empleado[] empleados, String criterio, Object valorMin, Object valorMax) {
        List<Empleado> filtrados = new ArrayList<>();
        
        for (Empleado e : empleados) {
            boolean cumple = false;
            switch (criterio) {
                case "nombre":
                    cumple = e.getNombre().equalsIgnoreCase((String) valorMin);
                    break;
                case "departamento":
                    cumple = e.getDepartamento().equalsIgnoreCase((String) valorMin);
                    break;
                case "edad":
                    cumple = e.getEdad() >= (int) valorMin && e.getEdad() <= (int) valorMax;
                    break;
                case "salario":
                    cumple = e.getSalario() >= (double) valorMin && e.getSalario() <= (double) valorMax;
                    break;
            }
            if (cumple) {
                filtrados.add(e);
            }
        }
        
        return filtrados.toArray(new Empleado[0]);
    }

    public static Empleado[] ordenarEmpleados(Empleado[] empleados, String criterio) {
        boolean swapped;
        int n = empleados.length;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                boolean cambiar = false;
                switch (criterio) {
                    case "nombre":
                        if (empleados[j].getNombre().compareTo(empleados[j + 1].getNombre()) > 0) {
                            cambiar = true;
                        }
                        break;
                    case "edad":
                        if (empleados[j].getEdad() > empleados[j + 1].getEdad()) {
                            cambiar = true;
                        }
                        break;
                    case "salario":
                        if (empleados[j].getSalario() > empleados[j + 1].getSalario()) {
                            cambiar = true;
                        }
                        break;
                    case "departamento":
                        if (empleados[j].getDepartamento().compareTo(empleados[j + 1].getDepartamento()) > 0) {
                            cambiar = true;
                        }
                        break;
                }

                if (cambiar) {
                    Empleado temp = empleados[j];
                    empleados[j] = empleados[j + 1];
                    empleados[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        return empleados;
    }

    public static Empleado buscarPorNombre(Empleado[] empleados, String nombre) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public static Empleado incrementarSalario(Empleado empleado, double porcentaje) {
        double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
        empleado.setSalario(nuevoSalario);
        return empleado;
    }
}
