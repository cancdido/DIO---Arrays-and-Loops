import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) throws Exception {

        Random random = new Random(); // Classe para gerar números aleatórios

        int [] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");

        }

        System.out.print("Antecessor dos Números aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");

        }

        System.out.print("Sucessores dos Números aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");

        }
    }
}
