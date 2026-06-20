import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence;
        int number;

        System.out.println("Bitte gib eine Zahl ein:");

        //sentence = scan.nextLine();
        number = scan.nextInt();

        System.out.println("Deine Zahl war: " + (number +1));
    }
}
