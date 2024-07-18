import java.util.Scanner;

public class EspaciosEnBlanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una cadena: ");
        String word = sc.nextLine().trim();

        int cant = 0;

        for (int i = 0; i < word.length(); i++) {
            boolean ist = Character.isWhitespace(word.charAt(i));
            if (ist == true) {
                cant++;
            }
        }

        if (cant > 0) {
            System.out.println("La cantidad de espacios son: " + cant);
        } else {
            System.out.println("No tenemos espacios");
        }
    }
}
