import java.util.Objects;

public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " está comiendo croquetas.");
    }

    @Override
    public void dormir() {
        System.out.println(getNombre() + " está durmiendo en su cama.");
    }

    public void ladrar() {
        System.out.println(getNombre() + " está ladrando.");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Perro perro = (Perro) obj;
        return getEdad() == perro.getEdad() &&
               getNombre().equals(perro.getNombre()) &&
               raza.equals(perro.getRaza());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getEdad(), raza);
    }
}

class Gato extends Animal {
    private String color;

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " está comiendo croquetas para gatos.");
    }

    @Override
    public void dormir() {
        System.out.println(getNombre() + " está durmiendo encima del sofá.");
    }

    public void maullar() {
        System.out.println(getNombre() + " está maullando.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
