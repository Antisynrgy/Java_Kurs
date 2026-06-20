import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence;

        System.out.println("Bitte gib einen Satz ein:");

        sentence = scan.nextLine();

        System.out.println("Dein Satz war: " + sentence);
    }
}
