import java.util.Scanner;

public class Idade {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) { // metodo booleano para repetir o loop
            System.out.println("Nome:");
            nome = scan.next(); // next ou nextLine pode ser usados para scan strings
            if (nome.equals("20")) // se o nome for 20, o loop para
                break;
            System.out.println("Idade:");
            idade = scan.nextInt();

        }

        System.out.println("Continua aqui");
    }
}
