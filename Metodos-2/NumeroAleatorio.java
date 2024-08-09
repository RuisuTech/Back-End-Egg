public class NumeroAleatorio {

    public static void main(String[] args) {
        int aleatorio = numeroAleatorio();
        System.out.println("Número aleatorio generado: " + aleatorio);
    }

    public static int numeroAleatorio() {
        return (int) Math.floor(Math.random() * 355) + 1;
    }
}
