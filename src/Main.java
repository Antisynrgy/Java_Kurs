import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int Zufallszahl = random.nextInt(6) + 1;    //0-5 --> wollen 1-6 für Würfel (deshalb + 1)
            System.out.println(Zufallszahl);
        }
    }
}