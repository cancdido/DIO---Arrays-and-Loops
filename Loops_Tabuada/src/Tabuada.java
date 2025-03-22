import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = ler.nextInt();

        System.out.println("Tabuada do " + tabuada);

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }

    }
}
