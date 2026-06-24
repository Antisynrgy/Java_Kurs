import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int Zufallszahl = random.nextInt(10);   //0-9
            //nextInt() bezieht sich hier auf random-Objekt und damit auf die Random-Klasse; kein Bezug zu Scanner-Klasse
        System.out.println(Zufallszahl);
    }
}