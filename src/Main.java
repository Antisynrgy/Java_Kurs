import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gib einen Startwert ein!");
        int Start = scan.nextInt();

        System.out.println("Gib einen Endwert ein!");
        int End = scan.nextInt();

        for (int i = Start; i < End; i++) {
            System.out.println(i);
        }
    }
}