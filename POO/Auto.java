// Archivo: Auto.java
public class Auto {
    // Atributos
    private String marca;
    private String modelo;
    private int año;

    // Constructor que inicializa marca, modelo y año
    public Auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Constructor que inicializa marca y modelo
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = 0; // Valor por defecto para año
    }

    // Constructor que inicializa solamente la marca
    public Auto(String marca) {
        this.marca = marca;
        this.modelo = "Desconocido"; // Valor por defecto para modelo
        this.año = 0; // Valor por defecto para año
    }

    // Constructor sin parámetros
    public Auto() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.año = 0;
    }

    // Método para imprimir los datos del auto
    public void imprimirDatos() {
        System.out.print("Marca: " + (marca != null ? marca : "Desconocida") + ", ");
        System.out.print("Modelo: " + (modelo != null ? modelo : "Desconocido") + ", ");
        System.out.println("Año: " + (año != 0 ? año : "No especificado"));
    }

    // Métodos setters para permitir modificar los atributos después de la creación
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
