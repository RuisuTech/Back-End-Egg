public class Jugador {
    private String nombre;
    private Equipo equipo;

    public Jugador(String nombre, Equipo equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return nombre + (equipo != null ? " - " + equipo.getNombre() : " - No asignado");
    }
}
