import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 1;

        while(value == 1) {
            System.out.println("All I need ");
            System.out.println("Is your love tonight");
            System.out.println("Erneut abspielen? ja(1) nein(2)");
            value = scan.nextInt();

        }
        System.out.println("Programm beendet");
    }
}