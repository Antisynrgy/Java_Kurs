import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie viele Zahlen möchtest du?");
        int value = scan.nextInt();
        for (int i = 0; i < value; i++) {
            System.out.println(i);
        }
    }
}