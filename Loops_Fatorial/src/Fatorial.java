import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = ler.nextInt();
        int multi = 1;

        System.out.print(fatorial +"! = ");

        for (int i = fatorial; i >= 1; i--) {
            multi *= i;
        }

        System.out.println(multi);

    }
}
