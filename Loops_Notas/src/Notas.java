import java.util.Scanner;

public class Notas {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        int nota;
        System.out.println("Digite a nota do aluno: ");
        nota = ler.nextInt();

        while (nota < 0 | nota > 10) { // Enquanto a nota for menor que 0 ou maior que 10, o programa pede para digitar
                                       // novamente
            System.out.println("Nota inválida, digite novamente: ");
            nota = ler.nextInt();

        }

    }
}
