import java.util.Scanner;

public class InputReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Inserisci del testo (premi Invio su una riga vuota per terminare):");

        while (true) {
            input = scanner.nextLine();

            // Se la riga è vuota, esci dal ciclo
            if (input.isEmpty()) {
                break;
            }

            // Altrimenti, stampa l'input su una nuova riga
            System.out.println(input);
        }

        System.out.println("Programma terminato.");
        scanner.close();
    }
}
