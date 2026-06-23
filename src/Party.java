import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        int guests;
        Scanner scan = new Scanner(System.in);

        System.out.println("Anzahl der Gäste: ");
        guests = scan.nextInt();

        while (true) {
            System.out.println("+X Gästeanmelden, 0 Programm beenden, -X Gäste abmelden");
            int value = scan.nextInt();
            if (value == 0) {
                break;
            }
            if (value > 0) {
                for(int i = 0; i < value; i++) {
                    System.out.println("Gast angemeldet");
                    guests++;
                }
            }
            if (value < 0) {
                for (int i = 0; i > value; i--) {
                    System.out.println("Gast abgemeldet");
                    guests--;
                }

            }
            System.out.println(guests + " Gäste angemeldet");
        }
    }
}
