import java.util.Objects;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    // Sobrescritura del método comer()
    @Override
    public void comer() {
        System.out.println(getNombre() + " está comiendo croquetas.");
    }

    // Sobrescritura del método dormir()
    @Override
    public void dormir() {
        System.out.println(getNombre() + " está durmiendo en su cama.");
    }

    // Método específico de Perro
    public void ladrar() {
        System.out.println(getNombre() + " está ladrando.");
    }

    // Getter y Setter para el atributo raza
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Sobrescritura del método equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Perro perro = (Perro) obj;
        return getEdad() == perro.getEdad() &&
               getNombre().equals(perro.getNombre()) &&
               raza.equals(perro.getRaza());
    }

    // Sobrescritura del método hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getEdad(), raza);
    }
}
