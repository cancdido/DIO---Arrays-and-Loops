import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Digite um número: ");
            numero = ler.nextInt();

            soma = soma + numero;

            if (numero > maior)
                maior = numero;
            count++;
            // System.out.println("O maior foi: " + maior);
        } while (count < 5);

        System.out.println("O maior foi: " + maior);
        System.out.println("A soma é: " + soma / 5);

    }
}
