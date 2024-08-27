public class Gato extends Animal {
    private String color;

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    // Sobrescritura del método comer()
    @Override
    public void comer() {
        System.out.println(getNombre() + " está comiendo croquetas para gatos.");
    }

    // Sobrescritura del método dormir()
    @Override
    public void dormir() {
        System.out.println(getNombre() + " está durmiendo encima del sofá.");
    }

    // Método específico de Gato
    public void maullar() {
        System.out.println(getNombre() + " está maullando.");
    }

    // Getter y Setter para el atributo color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
