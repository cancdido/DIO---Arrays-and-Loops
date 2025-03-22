import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int par = 0, impar = 0;

        System.out.println("Digite a quantidade de números que deseja verificar: ");
        quantNumeros = ler.nextInt();

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = ler.nextInt();

            if (numero % 2 == 0) {
                par++;
            } else
                impar++;
            count++;

        } while (count < quantNumeros);

        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);

    }
}
