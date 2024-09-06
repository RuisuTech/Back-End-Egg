import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GestorDeContactos {
    private final List<Contacto> contactosArrayList;
    private final Set<Contacto> contactosHashSet;

    public GestorDeContactos() {
        contactosArrayList = new ArrayList<>();
        contactosHashSet = new HashSet<>();
    }

    // Métodos para ArrayList
    public void agregarContactoArrayList(Contacto contacto) {
        if (!contactosArrayList.contains(contacto)) {
            contactosArrayList.add(contacto);
            System.out.println("Contacto agregado al ArrayList.");
        } else {
            System.out.println("El contacto ya existe en el ArrayList.");
        }
    }

    public void eliminarContactoArrayList(Contacto contacto) {
        if (contactosArrayList.remove(contacto)) {
            System.out.println("Contacto eliminado del ArrayList.");
        } else {
            System.out.println("El contacto no se encontró en el ArrayList.");
        }
    }

    // Métodos para HashSet
    public void agregarContactoHashSet(Contacto contacto) {
        if (contactosHashSet.add(contacto)) {
            System.out.println("Contacto agregado al HashSet.");
        } else {
            System.out.println("El contacto ya existe en el HashSet.");
        }
    }

    public void eliminarContactoHashSet(Contacto contacto) {
        if (contactosHashSet.remove(contacto)) {
            System.out.println("Contacto eliminado del HashSet.");
        } else {
            System.out.println("El contacto no se encontró en el HashSet.");
        }
    }

    public void mostrarContactosArrayList() {
        System.out.println("Contactos en ArrayList:");
        for (Contacto c : contactosArrayList) {
            System.out.println(c);
        }
    }

    public void mostrarContactosHashSet() {
        System.out.println("Contactos en HashSet:");
        for (Contacto c : contactosHashSet) {
            System.out.println(c);
        }
    }
}
